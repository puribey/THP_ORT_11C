package tp1;
import java.util.Scanner;

/*
EJ 3
Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que ingrese su nombre
y luego muestre un mensaje de bienvenida incluyendo el mismo.
*/

public class Ej3 {
    private static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        String nombre = "";
        System.out.println("Por favor ingrese su nombre");
        nombre = input.next();
        input.nextLine();
        System.out.println("Bienvenido/a " + nombre + "!");
        input.close();
    }
}
