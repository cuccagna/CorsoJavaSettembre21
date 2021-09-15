import java.util.Scanner;

public class Sentinella2 {
    public static void main(String[] args) {
        Scanner inserisci = new Scanner(System.in);
        int risultato = 0;
        int numInserito=0;
        int sentinella = -1;

        while(numInserito != sentinella){
            risultato = risultato + numInserito;
            System.out.println("Prego,inserire un numero da sommare\nIserisca -1 per cessare l'inserimento");
            numInserito = inserisci.nextInt();
        }
        inserisci.close();
        
    }
}
