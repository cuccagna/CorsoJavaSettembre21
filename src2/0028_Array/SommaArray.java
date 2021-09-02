import java.util.Scanner;

public class SommaArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPrego inserisca esattamente quanti numeri desidera inserire:");
        int quantitaNumeri = input.nextInt();
        int arrayNum[] = new int[quantitaNumeri]; //array inizializzato con dimensione inserita a runtime

        for(int i=0 ; i<quantitaNumeri ; i++){
            System.out.println("Prego, inserisca un numero:");
            arrayNum[i] = input.nextInt();
            arrayNum[i] *= 2 + 1; 
        }
        input.close();

        int somma=0;
        for(int i=0 ; i<quantitaNumeri ; i++){
            somma += arrayNum[i];
        }

        stampa(arrayNum,somma);
    }

    public static void stampa(int aNum [] , int totale){
        
        System.out.println("\nI numeri contenuti nell'array dopo l'elaborazione sono:");
        //Nota la sintassi del for potenziato
        for(int num : aNum )
            System.out.printf("%d\n",num);

        System.out.printf("\nla cui somma è %d\n\n",totale);
    }
}
