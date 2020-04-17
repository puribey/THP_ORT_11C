package tp2;
import java.util.Scanner;

public class Ej4 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		int intentos = 0;
		
        do {
        	/* Aviso al usuario que debe hacer luego de equivocarse */
        	if(intentos >= 1) {
        		System.out.println("El primer numero debe ser menor o igual al segundo, por favor intente nuevamente");
        	}
        	
        	/* Pido los dos numeros */
        	System.out.println("Por favor ingrese un numero");
            num1 = input.nextInt();
            input.nextLine();
            System.out.println("Por favor ingrese otro numero");
            num2 = input.nextInt();
            input.nextLine();
            
            /* Aumento el numero de intentos */
            intentos++;
        } while(num1 > num2);
        
        for(int i = num1; i <= num2; i++) {
        	System.out.println(i);
        }
        
        System.out.println("Fin primer for");
        
        for(int i = num1 + 1; i < num2; i++) {
        	System.out.println(i);
        }
        
        System.out.println("Fin segundo for");
        input.close();
	}

}
