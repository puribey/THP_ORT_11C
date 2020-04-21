package tp2;

import java.util.Scanner;

/*
 * 8. Escribí la función booleana esMultiplo(int num1, int num2) que recibirá dos enteros y devolverá
 * verdadero cuando el primero sea múltiplo de segundo (de lo contrario, devolverá falso). Para saber si
 * un número es múltiplo de otro utilizá el operador % (módulo), que devuelve el resto de la división. Probá
 * la función desde el main con los lotes de datos (5, 3) y (15, 3).
*/

public class Ej8 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		String resultado;

		System.out.println("Por favor ingrese un numero");
		num1 = input.nextInt();
		input.nextLine();
		System.out.println("Por favor ingrese un numero");
		num2 = input.nextInt();
		input.nextLine();

		resultado = esMultiplo(num1, num2);
		System.out.println(resultado);

	}

	private static String esMultiplo(int num1, int num2) {
		if (num1 % num2 == 0) {
			return "Num1 es multiplo de Num2";
		} else {
			return "Num1 NO es multiplo de Num2";
		}
	};

}
