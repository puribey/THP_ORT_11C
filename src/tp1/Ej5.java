package tp1;
import java.util.Scanner;

/*
EJ 5
Realizá un programa que, dados dos números enteros num1 y num2 cargados desde teclado por el usuario,
muestre el resultado de la división del primero por el segundo
siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
En el caso de que el segundo valor num2 sea cero, mostrar el siguiente mensaje de error:
“No se puede dividir por cero”.
*/


public class Ej5 {
    private static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        int num1;
        int num2;
        int resultado;

        System.out.println("Por favor ingrese un numero");
        num1 = input.nextInt();
        input.nextLine();
        System.out.println("Por favor ingrese otro numero");
        num2 = input.nextInt();
        input.nextLine();
        if(num2 == 0) {
            System.out.println("No se puede dividir por 0");
        } else {
            resultado = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + resultado);
        }
        input.close();
    }
}
