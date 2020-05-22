package tp2;

import java.util.Scanner;

/*
 * Una empresa de catering nos pide desarrollar un programa para calcular el precio que tendrá que
 * cobrar a sus clientes según el menú elegido por los invitados de cada fiesta.
 * Las alternativas de cubierto ofrecidas y sus precios por persona son (poner como constantes) :
 * Opción 1. Menú clásico $300
 * Opción 2. Menú para celíacos $310
 * Opción 3. Menú Kosher $430
 * Opción 4. Menu Light $290
 * A su vez, tenemos que tener en cuenta que se cobra $30 por persona para cubrir las bebidas,
 * indistintamente del menú elegido.
 * Al comenzar el programa, se le preguntará al usuario si desea calcular el precio total del catering para
 * su fiesta (s/n - Validar). En caso afirmativo, se le solicitará al usuario que ingrese la cantidad de invitados
 * total (validar que sea mayor a 0).
 * Una vez ingresada esa información, se le pedirá que ingresé el tipo de menú
 * (clásico/celiaco/kosher/light/fin - Validar) para luego cargar la cantidad de invitados que eligieron ese
 * cubierto. Estos dos datos se le pedirán hasta que en el tipo de menú ingrese ‘fin’.
 * Una vez finalizado el ingreso de datos, se mostrará por pantalla un resumen detallando lo ingresado y
 * el costo final calculado.
 * Obs: validar que concuerde la cantidad total de invitados y la cantidad total de Menues pedidos.
 * Recuerde modularizar haciendo uso de las funciones, utilizar constantes, realizar validaciones y ser
 * prolijo en el código.
*/

public class Ej16 {
	private static Scanner input = new Scanner(System.in);

	public static final int PRECIO_MENU_CLASICO = 300;
	public static final int PRECIO_MENU_CELICACOS = 310;
	public static final int PRECIO_MENU_KOSHER = 430;
	public static final int PRECIO_MENU_LIGHT = 290;
	public static final int PRECIO_POR_BEBIDA = 30;

	public static void main(String[] args) {
		// Variables generales
		String calcularValorCatering;
		int cantidadTotalInvitados;
		int costoTotal;

		// Variables de menu
		String tipoDeMenuElegido;
		int cantidadClasicos = 0;
		int cantidadCeliacos = 0;
		int cantidadKoshers = 0;
		int cantidadLights = 0;
		int sumaInvitados = 0;
		int costoPorClasicos = 0;
		int costoPorCelicaos = 0;
		int costoPorKoshers = 0;
		int costoPorLights = 0;

		// Pregunto al usuario si quiere iniciar el programa o no
		System.out.println("Desea calcular el monto total del catering? (S/N)");
		calcularValorCatering = input.next().toLowerCase();
		input.nextLine();

		// Si lo desea iniciar hago esto
		if (calcularValorCatering.equals("s")) {
			// Pido y valido la cantidad de invitados
			cantidadTotalInvitados = pedirInvitados();
			// Calculo el extra de las bebidas
			costoTotal = cantidadTotalInvitados * PRECIO_POR_BEBIDA;
			// Pido el tipo de menu
			tipoDeMenuElegido = pedirTipoDeMenu();
			// Si el menu no es ninguna de las siguientes opciones o no es fin o la suma de
			// invitados no es igual al total entonces entro al while
			while ((tipoDeMenuElegido.equals("clasico") && tipoDeMenuElegido.equals("celiaco")
					&& tipoDeMenuElegido.equals("kosher") && tipoDeMenuElegido.equals("light"))
					|| !tipoDeMenuElegido.equals("fin") || sumaInvitados != cantidadTotalInvitados) {

				/*
				 * Evalui el tipo de menu y pido la cantidad de invitados Valido que ese numero
				 * no se pase del total ingresado anteriormente Calculo el precio de los menus
				 * por su tipo Actualizo la suma de los invitados
				 */

				switch (tipoDeMenuElegido) {
				// TODO: Me pregunto si esto se puede modularizar más
				case "clasico":
					cantidadClasicos = validarSumaInvitados(cantidadTotalInvitados, sumaInvitados);
					costoPorClasicos = cantidadClasicos * PRECIO_MENU_CLASICO;
					sumaInvitados = sumaInvitados + cantidadClasicos;
					break;
				case "celiaco":
					cantidadCeliacos = validarSumaInvitados(cantidadTotalInvitados, sumaInvitados);
					costoPorCelicaos = cantidadCeliacos * PRECIO_MENU_CELICACOS;
					sumaInvitados = sumaInvitados + cantidadCeliacos;
					break;
				case "kosher":
					cantidadKoshers = validarSumaInvitados(cantidadTotalInvitados, sumaInvitados);
					costoPorKoshers = cantidadKoshers * PRECIO_MENU_KOSHER;
					sumaInvitados = sumaInvitados + cantidadKoshers;
					break;
				case "light":
					cantidadLights = validarSumaInvitados(cantidadTotalInvitados, sumaInvitados);
					costoPorLights = cantidadLights * PRECIO_MENU_LIGHT;
					sumaInvitados = sumaInvitados + cantidadLights;
					break;
				}
				// Si la suma de los invitados es igual al total doy por terminado el ingreso de
				// datos y salgo del while
				if (sumaInvitados == cantidadTotalInvitados) {
					tipoDeMenuElegido = "fin";
				} else {
					// Sino pido otra vez el tipo
					tipoDeMenuElegido = pedirTipoDeMenu();
				}
			}
			;

			// Hago la suma de todos los costos
			costoTotal = costoTotal + costoPorClasicos + costoPorCelicaos + costoPorKoshers + costoPorLights;

			// Muestro los resultados y el detalle de todo por pantalla
			System.out.println("El costo total del catering es de $" + costoTotal
					+ " incluyendo el costo de las bebidas \n" + "Se encargaron " + cantidadClasicos
					+ " menus clasicos por el costo total de $" + costoPorClasicos + "\n" + "Se encargaron "
					+ cantidadCeliacos + " menus celiacos por el costo total de $" + costoPorCelicaos + "\n"
					+ "Se encargaron " + cantidadKoshers + " menus kosher por el costo total de $" + costoPorKoshers
					+ "\n" + "Se encargaron " + cantidadLights + " menus light por el costo total de $" + costoPorLights
					+ "\n");
		} else {
			// Si no desea iniciar finalizo el programa
			System.out.println("Fin del programa");
		}

	}

	private static int pedirInvitados() {
		int invitados;

		System.out.println("Ingrese la cantidad total de invitados");
		invitados = input.nextInt();
		input.nextLine();

		while (invitados < 0) {
			System.out.println("El numero ingresado debe ser mayor a 0, intentelo nuevamente");
			invitados = input.nextInt();
			input.nextLine();
		}
		;

		return invitados;
	};

	private static String pedirTipoDeMenu() {
		String menu;
		System.out.println(
				"Ingresar el tipo de menu a ingresar (clasico/celiaco/kosher/light) o escriba fin para terminar");
		menu = input.next();
		input.nextLine();

		return menu.toLowerCase();

	};

	private static int validarSumaInvitados(int total, int suma) {
		int invitados;
		int sumaTotal;

		invitados = pedirInvitados();
		sumaTotal = suma + invitados;

		while (sumaTotal > total) {
			System.out
					.println("El numero ingresado supera a la cantidad de invitados, ingrese otro numero de invitados");
			invitados = pedirInvitados();
			sumaTotal = suma + invitados;
		}
		;

		return invitados;
	};

}
