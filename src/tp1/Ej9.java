package tp1;
import java.util.Scanner;

/*
EJ 9
Realizá un programa que resuelva el siguiente problema:
Tres personas aportan diferente capital a una sociedad.
Se desea saber qué porcentaje del total aportó cada una (indicando nombre y porcentaje) y
cuál es el monto del total aportado por las tres.
Pedir por pantalla el ingreso del capital aportado por cada una de las personas y
luego mostrar lo pedido en el siguiente formato:
Nombre: capital aportado: $ ... , Porcentaje del capital: %.... , Monto total aportado: $ ....
*/

public class Ej9 {
    private static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        String nombre1;
        String nombre2;
        String nombre3;
        int aporte1;
        int aporte2;
        int aporte3;
        int total;


        System.out.println("Por favor ingrese su nombre");
        nombre1 = input.next();
        input.nextLine();
        System.out.println("Por favor ingrese el el aporte en $: ");
        aporte1 = input.nextInt();
        input.nextLine();
        System.out.println("Por favor ingrese su nombre");
        nombre2 = input.next();
        input.nextLine();
        System.out.println("Por favor ingrese el el aporte en $: ");
        aporte2 = input.nextInt();
        input.nextLine();
        System.out.println("Por favor ingrese su nombre");
        nombre3 = input.next();
        input.nextLine();
        System.out.println("Por favor ingrese el el aporte en $: ");
        aporte3 = input.nextInt();
        input.nextLine();
        total = aporte1 + aporte2 + aporte3;

        System.out.println("Nombre: " + nombre1 + ". Capital aportado: $" + aporte1 + ". Porcentaje del capital: " + ((total * aporte1) /100) + "%. Monto total aportado: $" + total);
        System.out.println("Nombre: " + nombre2 + ". Capital aportado: $" + aporte2 + ". Porcentaje del capital: " + ((total * aporte2) /100) + "%. Monto total aportado: $" + total);
        System.out.println("Nombre: " + nombre3 + ". Capital aportado: $" + aporte3 + ". Porcentaje del capital: " + ((total * aporte3) /100) + "%. Monto total aportado: $" + total);

        input.close();
    }
}
