package tp2;

import java.util.Scanner;

public class Ej6 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int contadorAlumnos;
		double mejorPromedio;
		double promedio;
		String nombreMejorAlumno;
		String nombreAlumno;

		contadorAlumnos = 0;
		mejorPromedio = 0;
		nombreMejorAlumno = "";

		/*
		 * Mientras la cantidad de alumnos ingresada sea menor a 10, ejecutar el codigo
		 * siguiente
		 */
		while (contadorAlumnos < 10) {

			/* Sumar cada ingreso al contador */
			contadorAlumnos++;

			/* Pedir nombre de alumno */
			System.out.println("Por favor ingrese el nombre del " + contadorAlumnos + "° alumno:");
			nombreAlumno = input.next();
			input.nextLine();

			/* Pedir promedio de alumno */
			System.out.println("Por favor ingrese el promedio del " + contadorAlumnos + "° alumno:");
			promedio = input.nextDouble();
			input.nextLine();

			/*
			 * Checkear si el promedio es superior al mejor y si lo es guardar promedio y
			 * nombre
			 */
			if (promedio > mejorPromedio) {
				mejorPromedio = promedio;
				nombreMejorAlumno = nombreAlumno;
			}

		}

		/* Mostrar variables */
		System.out.println("El mejor alumno es: " + nombreMejorAlumno);
		System.out.println("Su promedio es de: " + mejorPromedio);

	}

}
