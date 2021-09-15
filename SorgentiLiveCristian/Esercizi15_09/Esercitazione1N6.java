import java.util.Scanner;

public class Esercitazione1N6 {
    public static void main(String[] args) {
        int num1,num2,num3,min,max;
        int somma,prodotto;
        double media;
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Prego inserire un numero:");
        num1 = inserisci.nextInt();

        System.out.println("Prego inserire un numero:");
        num2 = inserisci.nextInt();

        System.out.println("Prego inserire un numero:");
        num3 = inserisci.nextInt();

        inserisci.close();

        somma = num1 + num2 + num3;
        prodotto = num1 * num2 * num3;
        media = (double) somma/3;

        max = num1;

        if(max<num2)
            max = num2;
        
        if(max<num3)
            max = num3;

        min = num1;

        if(num2<min)
            min = num2;

        if(num3<min)
            min = num3;

        System.out.printf("I numeri inseriti sono:\nnum1 = %d\n"+
                          "num2 = %d\nnum3 = %d\n"+
                          "La loro somma e' %d\nIl loro prodotto e' %d\n"+
                          "La media e' %.2f\nIl minimo e' %d\nIl massimo e' %d"
                          ,num1,num2,num3,somma,prodotto,media,min,max);
    }
}
