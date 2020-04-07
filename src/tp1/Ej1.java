package tp1;

public class Ej1 {
    private static Scanner input;
    public static void main (String [] args) {
        input = new Scanner (System.in);
        int num1;
        int num2;
        System.out.println("Inserte primer número");
        num1= input.nextInt();
        input.nextLine();
        System.out.println("Inserte otro número");
        num2= input.nextInt();
        input.nextLine();
        if (num2!=0) {
            double div = num1/num2;
            System.out.println(num1+ "/" +num2 + "= " +div);
        } else {
            System.out.println("El segundo num es 0, no se puede dividir");
        }
        input.close();
    }
}
