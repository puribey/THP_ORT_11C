package tp1;

/*
EJ 8
Suponiendo que el primer día de la semana es el Domingo,
pedir un número entre 1 y 7 (inclusive) y mostrar el nombre del día correspondiente.
Si el día no está en el rango permitido debe emitir por pantalla el mensaje de error "El día ingresado no es válido".
*/

import java.util.Scanner;

public class Ej8 {
    private static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        short dia;


        System.out.println("Por favor ingrese un numero del 1 al 7");
        dia = input.nextShort();
        input.nextLine();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("El día ingresado no es válido");
                break;
        }

        input.close();
    }
}
