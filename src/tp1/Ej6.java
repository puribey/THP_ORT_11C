package tp1;
import java.util.Scanner;

/*
Ej 6
Realizá un programa que solicite al usuario el ingreso por teclado un valor entero mayor que 0
en una variable llamada num1 y muestre un mensaje por pantalla indicando "el número es par" o "el número es impar".
Deberá utilizar el operador “módulo” es el caracter %.
*/

public class Ej6 {
    private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1;

        System.out.println("Por favor ingrese un numero");
        num1 = input.nextInt();
        input.nextLine();

        if(num1 % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        input.close();
	}

}
