package tp2;

import java.util.Scanner;

/*
 * Una empresa de telefonía nos pide escribir un programa que le brinde información sobre el
 * consumo de sus clientes residenciales. Para ello se ingresa, por cada una de las llamadas realizadas
 * en el último mes:
 * ● Código de Cliente (int de 5 dígitos, entre 10001 y 99999, 0 = fin)
 * ● Duración de la llamada nro. (int > 0).
 * ● Tipo de abono (“a”, “b” o “c”).
 * Para calcular el importe de cada llamada, nos informan que el costo por minuto, de acuerdo al tipo de
 * abono, es el siguiente:
 * ● Abono “a” => $2 el minuto
 * ● Abono “b” => Hasta 5 minutos, $2 el minuto; Más de 5 minutos, $1,5 el minuto.
 * ● Abono “c” => $1 el minuto con un máximo de $10 (Ej. si habla 15 minutos paga $10).
 * Se pide informar:
 * 1. El importe acumulado a recaudar por cada tipo de abono.
 * 2. La cantidad de minutos de la llamada más larga.
 * 3. La cantidad de llamadas de menos de 6 minutos.
 * 4. El precio promedio por llamada.
*/

public class Ej15 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int codigoCliente;
		int duracionLlamada;
		int contadorLlamadas = 0;
		String tipoDeAbono;

		double costoLlamada;
		double precioPromedioPorLlamada;
		double montoTotalLlamadas = 0;

		int duracionLlamadaMasLarga = 0;

		int contadorLlamadasMenosSeisMin = 0;

		double importeAbonoA = 0;
		double importeAbonoB = 0;
		double importeAbonoC = 0;

		// Pido el primer codigo de cliente y lo valido
		codigoCliente = validarCodigoCliente();

		while (codigoCliente != 0) {
			// Sumo +1 a mi contador de llamadas
			contadorLlamadas++;

			// Pido la duracion de la llamada y la valido
			duracionLlamada = validarDuracionLlamada();

			// Determino cual fue la llamada mas larga
			if (duracionLlamada > duracionLlamadaMasLarga) {
				duracionLlamadaMasLarga = duracionLlamada;
			}

			// Si la duración fue menor a 6 le sumo +1 a mi contador
			if (duracionLlamada < 6) {
				contadorLlamadasMenosSeisMin++;
			}

			// Pido el tipo de abono y lo valido
			tipoDeAbono = validarTipoDeAbono();

			// Calculo el costo de la llamada según el abono
			costoLlamada = calcularCostoLlamada(duracionLlamada, tipoDeAbono);
			System.out.println("costoLlamada: " + costoLlamada);

			// Aqui acumulo en cada total segun el abono
			if (tipoDeAbono.equals("a")) {
				importeAbonoA = importeAbonoA + costoLlamada;
			} else if (tipoDeAbono.equals("b")) {
				importeAbonoB = importeAbonoB + costoLlamada;
			} else {
				importeAbonoC = importeAbonoC + costoLlamada;
			}

			// Suma progresiva de los montos de las llamadas
			montoTotalLlamadas = montoTotalLlamadas + costoLlamada;

			// Vuelvo a pedir otro codigo
			codigoCliente = validarCodigoCliente();

		}

		// Si el contador de llamadas es mayo a 0 significa que puedo mostrar todo
		if (contadorLlamadas > 0) {
			precioPromedioPorLlamada = montoTotalLlamadas / contadorLlamadas;
			System.out
					.println("El importe acumulado a recaudar por cada tipo de abono: \n" + "Abono a: $" + importeAbonoA
							+ " \n" + "Abono b: $" + importeAbonoB + " \n" + "Abono c: $" + importeAbonoC + " \n");
			System.out.println("La cantidad de minutos de la llamada más larga: " + duracionLlamadaMasLarga + "min.");
			System.out.println("La cantidad de llamadas de menos de 6 minutos: " + contadorLlamadasMenosSeisMin);
			System.out.println("El precio promedio por llamada: $" + precioPromedioPorLlamada);
		} else {
			// Sino me retiro del sistema
			System.out.println("El programa ha finalizado sin ingresar ninguna llamada.");
		}

	}

	private static int validarCodigoCliente() {
		int codigo;

		System.out.println("Ingrese el codigo de cliente de 5 digitos o 0 para finalizar");
		codigo = input.nextInt();
		input.nextLine();

		while ((codigo < 10001 || codigo > 99999) && codigo != 0) {
			System.out.println("El valor ingresado es incorrecto, intentelo nuevamente:");
			codigo = input.nextInt();
			input.nextLine();
		}
		;

		return codigo;

	};

	private static int validarDuracionLlamada() {
		int duracion;

		System.out.println("Ingrese la duración de su llamada");
		duracion = input.nextInt();
		input.nextLine();

		// TODO: que pasa si ingresa horas?
		while (duracion < 0) {
			System.out.println("La llamada no puede durar menos de 0 min");
			duracion = input.nextInt();
			input.nextLine();
		}
		;

		return duracion;

	};

	private static String validarTipoDeAbono() {
		String abono;

		System.out.println("Ingrese el tipo de abono que posee (a/b/c)");
		abono = input.next().toLowerCase();
		input.nextLine();

		while (!abono.equals("a") && !abono.equals("b") && !abono.equals("c")) {
			System.out.println("Este tipo de abono no existe, ingrese un tipo de abono existente (a/b/c)");
			abono = input.next();
			input.nextLine();
		}
		;

		return abono.toLowerCase();

	};

	private static double calcularCostoLlamada(int minutos, String abono) {
		double costoTotal = 0;

		switch (abono) {
		case "a":
			costoTotal = minutos * 2;
			break;
		case "b":
			if (minutos <= 5) {
				costoTotal = minutos * 2;
			} else {
				costoTotal = minutos * 1.5;
			}
			break;
		case "c":
			if (minutos < 10) {
				costoTotal = minutos;
			} else {
				costoTotal = 10;
			}
			break;
		default:
			System.out.println("No hemos podido procesar el monto total dado que este abono no existe");
		}

		return costoTotal;

	};

}
