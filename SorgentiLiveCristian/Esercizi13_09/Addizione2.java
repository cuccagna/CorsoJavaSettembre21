//import java.util.*;
import java.util.Scanner;

public class Addizione2 {
    public static void main(String[] args) {

        //tipo nomeIdentificatore;
        int num1;//Qui memorizzo il primo numero inserito dall'utente
        int num2; //Qui memorizzo il secondo numero inserito dall'utente

        //num1 = 25;
        //System.out.printf("La variabile num1 contiene il valore %d",num1);

        Scanner inserisci = new Scanner(System.in);
        //nomeClasse nomeOggetto = new nomeClasse (parametro1,parametro2);
        //nomeOggetto.nomeMetodo();
        System.out.print("Prego, inserisca un numero intero\n");
        num1 = inserisci.nextInt(); //blocca il programma in attesa che l'utente inserisca un numero
        //inserisci.nextInt();
        //System.out.printf("La variabile num1 contiene il valore %d",num1);
        System.out.println("Prego, inserisca il secondo numero:");
        num2 = inserisci.nextInt();

        //System.out.printf("I due numeri inseriti sono\nnum1=%d\nnum2=%d",num1,num2);
        int somma;
        somma = num1 + num2;
        System.out.printf("La somma dei due numeri corrisponde a\n%d + %d = %d ",num1,num2,somma);
        //Metodo alternativo che permette di bypassare la dichiarazione
        //della variabile somma
        //System.out.printf("La somma dei due numeri è %d",(num1+num2));
        inserisci.close();
    }
}
