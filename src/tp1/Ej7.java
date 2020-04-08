package tp1;
import java.util.Scanner;

/*
EJ 7
Realizá un programa que al ingresar por teclado tres números enteros num1, num2 y num3,
muestre el valor del mayor de todos.
En caso de igualdad entre los tres imprimir "Los números son iguales".
Test1: num1 = 12, num2 = 4, num3= 7. Resultado esperado: El mayor número es num1
Test2: num1 = 2, num2 = 65, num3= 8. Resultado esperado: El mayor número es num2
Test3: num1 = 3, num2 = 10, num3= 28. Resultado esperado: El mayor número es num3
Test4: num1 = 5, num2 = 5, num3= 5. Resultado esperado: Los números son iguales
*/


public class Ej7 {
    private static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        int num1;
        int num2;
        int num3;

        System.out.println("Por favor ingrese un numero");
        num1 = input.nextInt();
        input.nextLine();
        System.out.println("Por favor ingrese otro numero");
        num2 = input.nextInt();
        input.nextLine();
        System.out.println("Por favor ingrese otro numero");
        num3 = input.nextInt();
        input.nextLine();

        if(num1 == num2 && num2 == num3) {
            System.out.println("Los números son iguales");
        } else {
            if(num1 > num2 && num1 > num3) {
                System.out.println(" El mayor número es: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println(" El mayor número es: " + num2);
            } else {
                System.out.println(" El mayor número es: " + num3);
            }
        }
        input.close();
    }
}
