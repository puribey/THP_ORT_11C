package tp2;
import java.util.Scanner;

public class Ej5 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num;
		int totalSuma;
		int intentos;
		float promedio;
		
		totalSuma = 0;
		intentos = 0;
		promedio = 0;
		
		/* Voy a pedir los numeros mientras el promedio entre ellos sea menor a 20 */
		while(promedio < 20) {
			intentos++;
			System.out.println("Por favor ingrese un numero");
            num = input.nextInt();
            input.nextLine();
            
            totalSuma = totalSuma + num;
            promedio = totalSuma / intentos;
            
            /* Print de todas las variables */
            System.out.println("Cantidad de veces que se ingresaron numeros: " + intentos);
    		System.out.println("Suma total de los numeros ingresados: " + totalSuma);
    		System.out.println("Promedio: " + promedio);
		}
		
		System.out.println("Fin");
        input.close();

	}

}
