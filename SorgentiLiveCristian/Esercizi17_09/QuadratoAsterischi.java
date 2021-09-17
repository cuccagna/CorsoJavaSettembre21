import java.util.Scanner;

import java.util.Scanner;

public class QuadratoAsterischi {
    public static void main(String[] args) {
        int lato;
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Prego, specificare il lato del quadrato:");
        lato = inserisci.nextInt();
        int contatore=1;
        int riga = 1;

        //Questo ciclo esterno serve per ripetere "lato" volte la stampa di una riga.
        while(riga<=lato){
            //Questo codice while interno si occupa di stampare la singola riga di asterischi
            while(contatore <= lato){
                System.out.print("* ");
                contatore++;
            }
            System.out.println();
            riga++; //fa parte del ciclo while più esterno
            contatore=1;
        }
    }
}
