import java.util.Scanner;


public class Esercitazione1N8 {
    public static void main(String[] args) {
        int num1,num2;
        
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Prego inserire un numero:");
        num1 = inserisci.nextInt();

        System.out.println("Prego inserire un numero:");
        num2 = inserisci.nextInt();

        if((num1 % num2) == 0)
            System.out.println("I due numeri sono uno multiplo dell'altro\n");

        if((num1 % num2) != 0){
            System.out.println("I due numeri non sono uno multiplo dell'altro\n");
        }
    }
}
