package tp2;

import java.util.Scanner;

public class Ej7 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String usuario = "puri";
		String contraseña = "1234";
		String usuarioIngresado;
		String contraseñaIngresada;
		short intentos = 0;

		do {
			/* Sumo un intento por cada vez que entra en el loop */
			intentos++;

			/* Pedir usuario */
			System.out.println("Usuario:");
			usuarioIngresado = input.next();
			input.nextLine();

			/* Pedir contraseña */
			System.out.println("Contraseña:");
			contraseñaIngresada = input.next();
			input.nextLine();

			/*
			 * Siempre que sea menor a 3 intentos y los datos esten mal debe mostrar el msj
			 */
			if (intentos < 3 && (!usuarioIngresado.equals(usuario) || !contraseñaIngresada.equals(contraseña))) {
				System.out.println("Los datos ingresados son incorrectos, por favor vuelva a intentarlo");
			}

			/* Aviso de que solo queda una oportunidad */
			if (intentos == 2) {
				System.out.println("Sólo le queda un intento");
			}

		} while (intentos < 3 && (!usuarioIngresado.equals(usuario) || !contraseñaIngresada.equals(contraseña)));

		/* Si los datos son correctos, damos un msj de bienvenida */
		if (usuarioIngresado.equals(usuario) && contraseñaIngresada.equals(contraseña)) {
			System.out.println("Bienvenido al sistema!");
		} else {
			/* Si luego de la 3 siguen siendo incorrectos avisamos del bloqueo */
			System.out.println("El sistema se ha bloqueado luego de 3 intentos. Vuelva a intentarlo más tarde");
		}
		;

	}

}
