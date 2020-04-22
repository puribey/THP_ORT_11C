package tp2;

import java.util.Scanner;

/*
 * Se desea realizar un programa para saber qué prioridad darle a cada materia en cuanto a clases
 * de apoyo de acuerdo a la necesidad de los alumnos.
 * Al comenzar el programa, se pedirá la cantidad de alumnos que desea cargar. Luego, por cada alumno,
 * se pedirá curso (a/b/c/d. Validar), y materia en la cual necesita clase de apoyo
 * (taller/fundamentos/matemática).
 * Una vez realizado el ingreso de datos, se deberá mostrar por pantalla cuál fue la materia más requerida
*/

public class Ej13 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidadAlumnos;
		int apoyoMatematica = 0;
		int apoyoTaller = 0;
		int apoyoFundamentos = 0;
		int contadorMayorApoyo = 0;
		boolean cursoValido;
		boolean esMayor;
		String curso;
		String materiaDeApoyo;
		String materiaMasRequerida = "Ninguna";

		/* Pido la cantidad de alumnos a ingresar para usar en el loop */
		System.out.println("Ingrese la cantidad de alumnos a ingresar");
		cantidadAlumnos = input.nextInt();
		input.nextLine();

		for (int i = 0; i < cantidadAlumnos; i++) {
			/*
			 * Pido el curso del alumno mientras este dentro de las posibildades sino lo
			 * vuelvo a pedir
			 */
			do {
				System.out.println("Ingrese el curso del " + (i + 1) + "° alumno");
				curso = input.next();
				input.nextLine();
				cursoValido = validarCurso(curso);

				if (!cursoValido) {
					System.out.println("El curso ingresado no existe!");
				}
			} while (!cursoValido);

			/* Pido la materia en la que se necesita ayuda */
			System.out.println("Ingrese la materia en la cual necesita ayuda (taller/fundamentos/matematica)");
			materiaDeApoyo = input.next();
			input.nextLine();

			/*
			 * TODO: preguntar por este switch Segun la materia ingresada agrego un alumno
			 * al contador de cada materia Si el numero de alumnos es mayor al mayor numero
			 * anterior entonces los reemplazo Asigno el nombre de esa materia a la materia
			 * mas requerida
			 */
			switch (materiaDeApoyo) {
			case "taller":
				apoyoTaller++;
				esMayor = validarMayor(contadorMayorApoyo, apoyoTaller);
				if (esMayor) {
					contadorMayorApoyo = apoyoTaller;
					materiaMasRequerida = materiaDeApoyo;
				}
				break;
			case "fundamentos":
				apoyoFundamentos++;
				esMayor = validarMayor(contadorMayorApoyo, apoyoFundamentos);
				if (esMayor) {
					contadorMayorApoyo = apoyoFundamentos;
					materiaMasRequerida = materiaDeApoyo;
				}
				break;
			case "matematica":
				apoyoMatematica++;
				esMayor = validarMayor(contadorMayorApoyo, apoyoMatematica);
				if (esMayor) {
					contadorMayorApoyo = apoyoMatematica;
					materiaMasRequerida = materiaDeApoyo;
				}
				break;
			default:
				System.out.println("Esta materia que ha ingresado no existe!");
			}

		}
		;

		/*
		 * Muestro la cantidad de alumnos que eligieron la materia mas requerida y su
		 * nombre
		 */
		System.out.println(
				contadorMayorApoyo + " de " + cantidadAlumnos + " alumnos necesitan apoyo en " + materiaMasRequerida);

	}

	// TODO: no se si esta validacion esta bien como funcion aparte
	private static boolean validarCurso(String curso) {
		return curso.equals("a") || curso.equals("b") || curso.equals("c") || curso.equals("d");
	};

	private static boolean validarMayor(int contadorMayorApoyo, int contadorMateria) {
		return contadorMateria > contadorMayorApoyo;
	};

}
