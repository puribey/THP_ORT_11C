package tp2;

import java.util.Scanner;

/*
 * TODO: Preguntar si esto esta bien, no se si entendi del todo la consigna!
 * 
 * 9. Realizar un programa que le pida al usuario que ingrese 5 veces 3 valores enteros cada vez. Emití
 * el promedio de cada grupo.
*/

public class Ej9 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		float promedio;

		/* Repetir el proceso 5 veces */
		for (int i = 0; i < 5; i++) {
			/* Pedimos 3 numeros */
			System.out.println("Por favor ingrese un numero");
			num1 = input.nextInt();
			input.nextLine();
			System.out.println("Por favor ingrese otro numero");
			num2 = input.nextInt();
			input.nextLine();
			System.out.println("Por favor ingrese un ultimo numero");
			num3 = input.nextInt();
			input.nextLine();

			/* Calculamos el promedio */
			promedio = (num1 + num2 + num3) / 3;

			/* Le mostramos el promedio al usuario */
			System.out.println("El promedio del " + (i + 1) + "° grupo es: " + promedio);
		}
		;
	}

}
