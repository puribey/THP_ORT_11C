package tp1;
import java.util.Scanner;

/*
EJ 11
Realizá un programa que resuelva el siguiente problema:
Deberás solicitar el ingreso de una fecha de compra (String en el siguiente formato: YYYYMMDD),
un nombre de comprador, un nombre de producto y una cantidad y precio del producto comprado.
Mostrá a modo de ticket, la información ingresada y el monto a pagar.

Modelo de Ticket:
Fecha de Compra: YYYYMMDD
Nombre del Comprador: xxxxx xxxxx
Producto solicitado: xxxxx
Cantidad solicitada: xx
Precio Unitario: $xxx
Total a Pagar: $xxxxx
*/

public class Ej11 {
    private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String fecha;
        String nombre;
        String producto;
        short cantidad;
        float precio;

        System.out.println("Por favor ingrese la fecha en el siguiente formato: YYYYMMDD");
        fecha = input.next();
        input.nextLine();
        System.out.println("Por favor ingrese su nombre");
        nombre = input.next();
        input.nextLine();
        System.out.println("Por favor ingrese el nombre del producto");
        producto = input.next();
        input.nextLine();
        System.out.println("Por favor ingrese la cantidad comprada");
        cantidad = input.nextShort();
        input.nextLine();
        System.out.println("Por favor ingrese el precio por unidad");
        precio = input.nextFloat();
        input.nextLine();

        System.out.println("*** TICKET *** \n" +
                "Fecha de Compra: " + fecha + "\n" +
                "Nombre del Comprador: " + nombre + "\n" +
                "Producto solicitado: " + producto +"\n" +
                "Cantidad solicitada: " + cantidad + "\n" +
                "Precio Unitario: $" + precio + "\n" +
                "Total a Pagar: $" + (precio * cantidad));

	}

}
