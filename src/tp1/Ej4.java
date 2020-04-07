package tp1;
import java.util.Scanner;

/*
EJ 4
Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2.
Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato:
“La suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2
*/


public class Ej4 {
    private static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        int num1;
        int num2;

        System.out.println("Por favor ingrese un numero");
        num1 = input.nextInt();
        input.nextLine();
        System.out.println("Por favor ingrese otro numero");
        num2 = input.nextInt();
        input.nextLine();
        System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1 + num2) );
        input.close();
    }
}
