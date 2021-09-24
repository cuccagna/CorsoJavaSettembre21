import java.util.Scanner;

public class Esercitazione3N4 {
    public static void main(String[] args) {
        Scanner inserisci = new Scanner(System.in);
        int numInserito;
        int min=0;
        
        System.out.println("Prego inserire quanti numeri si desidera inserire:");
        int numeri = inserisci.nextInt();

        for(int numCorrente=0 ; numCorrente<numeri ; numCorrente++)
        {
            System.out.println("Inserisci un numero\n");
            numInserito = inserisci.nextInt();

            if(numCorrente == 0)
                min = numInserito;
            else
                if(numInserito<min)
                    min = numInserito;

        }

        inserisci.close();
        System.out.printf("Il numero piu' piccolo inserito e' %d\n",min);
    }
}
