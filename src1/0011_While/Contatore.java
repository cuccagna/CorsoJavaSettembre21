import java.util.Scanner;

public class Contatore {
    public static void main(String[] args) {
        int contatore = 0;
        int risultato = 0;
        int num_inserito;
        
        Scanner inserisci = new Scanner(System.in); 

        while(contatore < 5){
            contatore = contatore +1;
            System.out.println("Inserisca un numero da sommare:");
            num_inserito = inserisci.nextInt();
            risultato = risultato + num_inserito;
        }
        inserisci.close();
        System.out.printf("La somma totale dei numeri inseriti è %d",risultato);
    }
}
