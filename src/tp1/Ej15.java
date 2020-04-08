package tp1;

/*
EJ 15
Existen dos reglas que identifican dos conjuntos de valores:
- El número es de un solo dígito.
- El número es impar.
A partir de estas reglas, creá un algoritmo que asigne a las variables booleanas
estaEnA, estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero o falso, según corresponda,
para indicar si el valor ingresado pertenece al primer conjunto, al segundo, a ambos o a ninguno, respectivamente.
Definí un lote de prueba de varios números y probá el algoritmo, escribiendo los resultados.
*/


import java.util.Scanner;

public class Ej15 {
    private static Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
        int num;
        boolean estaEnA;
        boolean estaEnB;
        boolean estaEnAmbos;
        boolean noEstaEnNinguno;

        System.out.println("Ingrese un numero");
        num = input.nextInt();
        input.nextLine();

        estaEnA = num >= -9 && num <= 9;
        estaEnB = num % 2 != 0;
        estaEnAmbos = (estaEnA && estaEnB);
        noEstaEnNinguno = (!estaEnA && !estaEnB);

        System.out.println("estaEnA: " + estaEnA);
        System.out.println("estaEnB: " + estaEnB);
        System.out.println("estaEnAmbos: " + estaEnAmbos);
        System.out.println("noEstaEnNinguno: " + noEstaEnNinguno);

        input.close();
    }
}
