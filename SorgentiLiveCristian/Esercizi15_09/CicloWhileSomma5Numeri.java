import java.util.Scanner;

public class CicloWhileSomma5Numeri {
    public static void main(String[] args) {
        int contatore =0;
        int risultato=0;
        int numeroInserito;
        Scanner inserisci = new Scanner(System.in);

        while(contatore<5){
            contatore = contatore + 1;
            System.out.println("Inserisca un numero:\n");
            numeroInserito = inserisci.nextInt();
            risultato = risultato + numeroInserito;
        }

        System.out.printf("La somma dei 5 numeri inseriti e' %d\n",risultato);
    }
}
