package tp2;

import java.util.Scanner;

/*
 * Una empresa dedicada al transporte de documentación necesita procesar su facturación mensual
 * a partir de los resúmenes de viajes realizados para cada uno de sus clientes.
 * Quieren saber también cuál es el promedio pagado por empresa y el valor de la factura más cara. Para
 * el cálculo de cada factura se sabe que por mes cada empresa tiene derecho a dos viajes diarios libres
 * con un abono de $8500, cobrando además por cada viaje adicional $100. En caso de que la empresa
 * supere los 30 viajes adicionales, por promoción, se le hará un descuento del 10% sobre el total mensual
 * facturado. Por cada empresa nos informan el nombre de la misma y la cantidad de viajes adicionales
 * (entero >=0, siempre menor a 1000), y nosotros debemos mostrar en pantalla su nombre y el importe
 * total de la factura.
*/

// TODO: Cuantas empresas se ingresan? Como sabemos donde parar? La factura más cara no la sabemos, el promedio tampoco.

public class Ej14 {
	private static Scanner input = new Scanner(System.in);

	public static final int ABONO_MENSUAL = 8500;
	public static final int ADICIONAL_POR_VIAJE = 100;

	public static void main(String[] args) {
		String nombreEmpresa;
		double totalMensual;
		int cantidadViajesAdicionales;
		int montoPorViajesAdicionales;

		// Pedimos el nombre de la empresa
		System.out.println("Ingrese el nombre de la empresa");
		nombreEmpresa = input.next();
		input.nextLine();

		// Pedimos cantidad de viajes validados
		cantidadViajesAdicionales = validarViajesAdicionales();

		// Calculamos el adicional
		montoPorViajesAdicionales = cantidadViajesAdicionales * ADICIONAL_POR_VIAJE;

		// Calculamos el total
		totalMensual = calcularTotalMensual(cantidadViajesAdicionales, montoPorViajesAdicionales);

		// Mostramos el total
		System.out.println("El monto total facturado de la empresa " + nombreEmpresa + " es de $" + totalMensual);

	}

	private static int validarViajesAdicionales() {
		int cantidad;

		System.out.println("Ingrese la cantidad de viajes adicionales realizados este mes:");
		cantidad = input.nextInt();
		input.nextLine();

		while (cantidad < 0 && cantidad > 1000) {
			System.out.println("El valor ingresado es incorrecto, intentelo nuevamente:");
			cantidad = input.nextInt();
			input.nextLine();
		}
		;

		return cantidad;

	};

	private static double calcularTotalMensual(int cantidadViajes, int monto) {
		double total;
		if (cantidadViajes > 30) {
			total = (monto + ABONO_MENSUAL) * 0.90;
		} else {
			total = monto + ABONO_MENSUAL;
		}
		;
		return total;

	};

}
