package tp1;
import java.util.Scanner;

/*
EJ 13
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
• Si trabaja 40 horas o menos se le paga $16 por hora (crear una constante para almacenar el 16)
• Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
Pedir al usuario que ingrese la cantidad de horas trabajadas en la semana,
y mostrar por pantalla el salario correspondiente.
*/


public class Ej13 {
    private static Scanner input = new Scanner (System.in);
    public static final int PRECIO_HORA = 16;
    public static final int PRECIO_HORA_EXTRA = 20;

    public static void main (String [] args) {
        short horas;
        float salario;

        System.out.println("Por favor ingrese la cantidad de horas trabajadas por semana");
        horas = input.nextShort();
        input.nextLine();

        if (horas <= 40){
            salario = horas * PRECIO_HORA;
            System.out.println("Salario: $" + salario);
        } else {
            salario = (40 * PRECIO_HORA) + ((horas - 40) * PRECIO_HORA_EXTRA);
            System.out.println("Salario: $" + salario);
        }
        input.close();
    }
}
