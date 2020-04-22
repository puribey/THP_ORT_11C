package tp2;

import java.util.Scanner;

/*
 * Realizá un programa que al ingresar dos números enteros positivos llamados A y B se calcule el
 * producto de éstos a través de sumas sucesivas. Por ejemplo, si los números son 4 y 2, hacer 4 + 4; si
 * son 5 y 3, hacer 5 + 5 + 5.
 * ¿Qué pasa si la diferencia entre los dos números es muy grande?
 * ¿Influye cuál se usa para sumar y cuál para contar la cantidad de sumas hechas? 
*/

public class Ej11 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int a;
		int b;
		int totalSuma = 0;

		/* Pedimos 2 numeros */
		System.out.println("Por favor ingrese un numero");
		a = input.nextInt();
		input.nextLine();
		System.out.println("Por favor ingrese otro numero");
		b = input.nextInt();
		input.nextLine();

		/* Mientras i sea menor a b, sumar el numero a al total */
		for (int i = 0; i < b; i++) {
			totalSuma = totalSuma + a;
		}
		;
		System.out.println("El total de la suma es: " + totalSuma);
		input.close();
	}

}
