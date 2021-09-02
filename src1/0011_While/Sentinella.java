/*Programma che fa la somma dei numeri inseriti dall'utente.
  La quantità di numeri da sommare non è nota a priori ma 
  stabilisce l'utente quando fermarsi inserendo un valore
  sentinella che in questo caso è stato scelto -1
*/

import java.util.Scanner;

public class Sentinella {
    public static void main(String[] args) {
        Scanner inserisci = new Scanner(System.in);
        int sentinella = -1; //stabilisco sentinella
        int risultato = 0;
        int num_inserito = 0;

        while ( num_inserito != sentinella){
            risultato = risultato + num_inserito;
            System.out.println("Prego, inserire un numero da sommare:\nInserire invece -1 per cessare l'inserimento");
            num_inserito = inserisci.nextInt();
        }
        inserisci.close();
        System.out.printf("La somma dei numeri inseriti è %d\n",risultato);

    }
}
