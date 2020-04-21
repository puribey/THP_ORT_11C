package tp2;

import java.util.Scanner;

/*
 * El club de corredores nos pide un programa para obtener estadísticas de la carrera de 10km.
 * El mismo consiste en ingresar, por teclado, el número de corredor, las
 * horas, los minutos y los segundos que tardo en realizar la carrera. Tener en cuenta que al ingresar 0
 * como el número de corredor, finaliza el programa y debe mostrar por pantalla:
 * a) El ganador
 * b) El promedio en segundos de los corredores.
 * c) El porcentaje de corredores que realizaron la carrera en menos de una hora.
 * Programar y utilizar la función devolverSegundos que recibe como parámetros horas, minutos y
 * segundos.
*/

public class Ej10 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numCorredor;
		int horasCorredor;
		int minutosCorredor;
		int segundosCorredor;
		int tiempoTotalEnSegundosCorredor;

		double promedioGeneral;
		int tiempoTotal = 0;
		int cantidadCorredores = 0;

		int mejorTiempo = 0;
		int mejorCorredor = 0;

		int porcentajeMenosDeUnaHora = 0;
		int corredoresMenosDeUnaHora = 0;

		numCorredor = pedirNumeroEntro("Por favor ingrese el num de corredor o ingrese 0 para terminar", 0, 100);

		/* Mientras el usuario no use el 0 se van a ejecutar los siguientes comandos */
		while (numCorredor != 0) {
			/* Sumamos un corredor a nuestro contador por cada vez que entra en el ciclo */
			cantidadCorredores++;
			/* Pedimos el tiempo del corredor en horas, min y segs */
			horasCorredor = pedirNumeroEntro("Por favor ingrese la cantidad de horas", 0, 24);
			minutosCorredor = pedirNumeroEntro("Por favor ingrese la cantidad de minutos", 1, 60);
			segundosCorredor = pedirNumeroEntro("Por favor ingrese la cantidad de segundos", 1, 60);

			/* Calculamos el tiempo total en segundos */
			tiempoTotalEnSegundosCorredor = transformarASegundos(horasCorredor, minutosCorredor, segundosCorredor);
			/* Vamos sumando los tiempos para obtener el tiempo total */
			tiempoTotal = tiempoTotal + tiempoTotalEnSegundosCorredor;

			/*
			 * Si el tiempo del corredor es menor a 1h en segundos (3600) entonces sumamos
			 * un corredor
			 */
			if (tiempoTotalEnSegundosCorredor < 3600) {
				corredoresMenosDeUnaHora++;
			}

			/* Si el tiempo del corredor fue mejor al mejor tiempo o es = a 0 */
			if (tiempoTotalEnSegundosCorredor < mejorTiempo || mejorTiempo == 0) {
				mejorTiempo = tiempoTotalEnSegundosCorredor;
				mejorCorredor = numCorredor;
			}

			/* Pedimos nuevamente un numero de corredor */
			numCorredor = pedirNumeroEntro("Por favor ingrese el num de corredor o ingrese 0 para terminar", 0, 100);
		}
		/*
		 * Si el mejor corredor sigue siendo 0 significa que no se han ingresado
		 * corredores
		 */
		if (mejorCorredor != 0) {
			System.out.println("El ganador es el corredor numero " + mejorCorredor);
			promedioGeneral = tiempoTotal / cantidadCorredores;
			System.out.println("Su tiempo promedio es de " + promedioGeneral + " segundos");
			porcentajeMenosDeUnaHora = corredoresMenosDeUnaHora * 100 / cantidadCorredores;
			System.out.println("El porcentaje de corredores que tardaron menos de una hora es de "
					+ porcentajeMenosDeUnaHora + " %");
		} else {
			System.out.println("Debe ingresar por lo menos un corredor antes de finalizar el programa");
		}

	}

	private static int transformarASegundos(int horas, int minutos, int segundos) {
		int totalSegundos;
		totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
		return totalSegundos;
	};

	private static int pedirNumeroEntro(String msj, int minVal, int maxVal) {
		int num;
		do {
			System.out.println(msj);
			num = input.nextInt();
		} while ((num < minVal && num > maxVal));
		return num;
	};

}
