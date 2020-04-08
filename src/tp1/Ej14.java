package tp1;
import java.util.Scanner;

/*
EJ 14
Construir un programa que simule el funcionamiento de una calculadora
que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división)
con valores numéricos enteros. En un principio, el usuario debe especificar la operación que desea realizar
(s para la suma, r para la resta, p para el producto y d para la división) y luego,
deberá ingresar dos números enteros para así realizar la operación.
Informar el resultado por pantalla.
*/



public class Ej14 {
    private static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        int num1;
        int num2;
        char operacion;


        System.out.println("Ingrese la letra de la operación que desea realizar " +
                "(s para la suma, r para la resta, p para el producto y d para la división)");
        operacion = input.next().charAt(0);
        input.nextLine();

        System.out.println("Ingrese un numero");
        num1 = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese otro numero");
        num2 = input.nextInt();
        input.nextLine();

        switch (operacion) {
            case 's':
                System.out.println("El total de la suma es: " + (num1 + num2));
                break;
            case 'r':
                System.out.println("El total de la resta es: " + (num1 - num2));
                break;
            case 'p':
                System.out.println("El total del producto es: " + (num1 * num2));
                break;
            case 'd':
                System.out.println("El total de la division es: " + (num1 / num2));
                break;
            default:
                System.out.println("Esa letra no se encuentra dentro de las opciones");
        }

        input.close();
    }
}
