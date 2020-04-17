package tp1;
import java.util.Scanner;

/*
EJ 12
En un casino de juegos se desea mostrar los mensajes respectivos
por el puntaje obtenido en el lanzamiento de tres dados de un cliente,
de acuerdo a los siguientes resultados:

• Si los tres dados son seis, mostrar el mensaje “Excelente”
• Si dos dados son seis, mostrar el mensaje “Muy bien”
• Si un dado es seis, mostrar el mensaje “Regular”
• Si ningún dado se obtiene seis, mostrar el mensaje “Insuficiente”
*/


public class Ej12 {
    private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		short dado1;
        short dado2;
        short dado3;

        System.out.println("Ingrese el numero del primer dado");
        dado1 = input.nextShort();
        input.nextLine();
        System.out.println("Ingrese el numero del segundo dado");
        dado2 = input.nextShort();
        input.nextLine();
        System.out.println("Ingrese el numero del tercer dado");
        dado3 = input.nextShort();
        input.nextLine();

        if(dado1 == 6 && dado2 == 6 && dado3 == 6){
            System.out.println("Excelente");
        }else if (((dado1 == 6 && dado2 == 6) || (dado2 == 6 && dado3 == 6) || (dado1 == 6 && dado3 == 6))){
            System.out.println("Muy bien");
        } else if (dado1 == 6 || dado2 == 6 || dado3 == 6) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }

        input.close();
	}

}
