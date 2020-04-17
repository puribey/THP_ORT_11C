package tp1;
import java.util.Scanner;

/*
EJ 10
Realizá un programa que resuelva el siguiente problema:
Nos piden desarrollar un programa que informe si un estacionamiento
se encuentra o no abierto según la hora ingresada por el usuario.
Nosotros sabemos que el estacionamiento se encuentra abierto entre las 10 y las 18hs.
(Crear constante HORA_APERTURA = 10, y HORA_CIERRE = 18).
Al iniciar el programa, se le pedirá al usuario que ingrese la hora,
y deberemos setear una variable booleana llamada estaAbierto en true o false,
según corresponda, e informar por pantalla mediante la misma si el estacionamiento se encuentra abierto o no.
Obs: En el caso de que el usuario ingrese una hora menor a 0 o mayor a 24, mostrar el mensaje:
“Ha ingresado una hora incorrecta”
*/

public class Ej10 {
	private static Scanner input = new Scanner (System.in);
    public static final int HORA_APERTURA = 10;
    public static final int HORA_CIERRE = 18;

	public static void main(String[] args) {
		boolean estaAbierto;
        int hora;

        System.out.println("Por favor ingrese la hora");
        hora = input.nextInt();
        input.nextLine();

        // no estoy segura si deberia ser >= o >
        estaAbierto = hora >= HORA_APERTURA && hora < HORA_CIERRE;

        if(hora < 0 || hora > 24){
            System.out.println("Ha ingresado una hora incorrecta");
        } else if(estaAbierto) {
            System.out.println("El estacionamiento está abierto");
        } else {
            System.out.println("El estacionamiento está cerrado");
        }

        input.close();

	}

}
