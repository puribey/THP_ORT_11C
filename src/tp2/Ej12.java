package tp2;

import java.util.Scanner;

/*
 * Realizar un programa en el cual se pida el ingreso de dos números enteros num1 y num2 y el signo
 * de la operación (“+” para sumar, “-” para restar, “/” para dividir, “*” para multiplicar y “%” para obtener el
 * resto o módulo). Mientras que la operación no sea “f” (de “fin”) aplicar la operación elegida a n1 y n2.
 * Tener en cuenta que la división por 0 es imposible. Realizar una función para cada operación, que
 * reciba por parámetros n1 y n2, y retorne el resultado de hacer la operación entre los dos números.
*/
public class Ej12 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		String operador;
		double resultado = 0;

		/* Pido el operador primero */
		System.out.println("Por favor ingrese un operador (+|-|*|/|%) a realizar o f para finalizar:");
		operador = input.next();

		/* Si el operador es f entonces no hago nada, sino pido los numeros */
		if (operador.equals("f")) {
			System.out.println("Fin del programa");
		} else {
			input.nextLine();
			System.out.println("Por favor ingrese el primer numero");
			num1 = input.nextInt();
			input.nextLine();
			System.out.println("Por favor ingrese el segundo numero");
			num2 = input.nextInt();
			input.nextLine();

			/* Si el operador es / y el segundo numero es = 0 entonces lo vuelvo a pedir */
			while (operador.equals("/") && num2 == 0) {
				System.out.println("La división por 0 es imposible, por favor vuelva a ingresar el segundo numero");
				num2 = input.nextInt();
				input.nextLine();
			}
			;

			/* Segun el operador elegido realizo una funcion */
			switch (operador) {
			case "+":
				resultado = sumarNumeros(num1, num2);
				break;
			case "-":
				resultado = restarNumeros(num1, num2);
				break;
			case "*":
				resultado = multiplicarNumeros(num1, num2);
				break;
			case "/":
				resultado = dividirNumeros(num1, num2);
				break;
			case "%":
				resultado = moduloDeNumeros(num1, num2);
				break;
			// TODO: Esta bien que esto este aca?
			default:
				System.out.println("Este operador no se encuentra dentro de las opciones");
			}

			/* Muestro el resultado de la operacion */
			System.out.println("El resultado de su operación es: " + resultado);

		}

		input.close();

	}

	private static double sumarNumeros(int num1, int num2) {
		return num1 + num2;
	};

	private static double restarNumeros(int num1, int num2) {
		return num1 - num2;
	};

	private static double multiplicarNumeros(int num1, int num2) {
		return num1 * num2;
	};

	// TODO: preguntar por los tipos de valor en esta operacion
	private static double dividirNumeros(int num1, int num2) {
		return (double) num1 / (double) num2;
	};

	private static double moduloDeNumeros(int num1, int num2) {
		return num1 % num2;
	};
}
