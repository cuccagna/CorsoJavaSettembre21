import java.util.Scanner;

public class SommaArray2 {
    public static void main(String[] args) {
        Scanner inserisci = new Scanner(System.in);
        System.out.println("\nPrego, inserire esattamente quanti numeri si desidera immettere:\n");
        int quantitaNumeri = inserisci.nextInt();

        int arrayNumeri[] = new int[quantitaNumeri];

        for(int indice=0 ; indice<quantitaNumeri ; indice++){
            System.out.println("Inserisca un numero:\n");
            arrayNumeri[indice] = inserisci.nextInt();
        }

        inserisci.close();

        int somma = 0;
        for(int indice=0 ; indice<quantitaNumeri ; indice++){
            somma = somma + arrayNumeri[indice];
        }

        SommaArray2.stampa(arrayNumeri , somma);
        System.out.printf("La somma dei valori dell'array e': %d",somma);

    }

    public static void stampa(int arrayNum [] , int totale){
        System.out.println("I valori contenuti nell'array sono:\n");
        
        //Questo si chiama for potenziato e fa esattamente quello che fa
        //il for commentato. Questo lo puoi usare qualora non ti serva usare
        //l'indice
        for(int numero : arrayNum)
            System.out.printf("%d\n",numero);
        /* for(int indice=0 ; indice<arrayNum.length ; indice++)
            System.out.printf("%d\n",arrayNum[indice]); */

        System.out.printf("La somma degli elementi dell'array e' %d",totale);        
    }
}
