import java.util.Scanner;

public class IstruzioneSelezioneIf {
    public static void main(String[] args) {
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Prego\nInserisca un voto:");
        int voto = inserisci.nextInt();
        inserisci.close();

        System.out.println("\n\nESEMPIO 1:\n");
        //Dentro l'if ci deve essere una condizione logica cioè che restituisce
        //vero o falso cioè che usa gli operatori relazione >,>=,<,<=,<,!=,==
        //L'istruzione dopo l'if viene eseguita solo se la condizione dentro
        //l'if è vera
        if(voto >= 18)
            System.out.println("Promosso\n");


            System.out.println("\n\nESEMPIO 2:\n");
        /*Le parentesi graffe aperta e chiusa dopo l'if non sono obbligatorie
          ma sono necessarie se quando la condizione dell'if è vera vuoi eseguire
          più di un'istruzione
          */
        if(voto >= 18){
            System.out.print("Complimenti!\n");
            System.out.println("Promosso\n");
        }

        System.out.println("\n\nESEMPIO 3:\n");
        /*
        Invece cosa farebbe lo stesso codice di sopra senza parentesi?
        Cioè il seguente?
        
        */

        
        if(voto >= 18)
            System.out.print("Complimenti!\n");
            System.out.println("Promosso\n");

        /*
        RISPOSTA ALLA DOMANDA DI SOPRA:
        ERRORE LOGICO.
        Cioè il programma funziona ancora ma non fa quello che vogliamo
        perchè il messaggio Complimenti! viene stampato solo se il voto
        è maggiore o uguale di 18  ma il messaggio Promosso viene stampato
        sempre perchè non fa parte del corpo dell'if e quindi è slegato
        dall'if ed eseguito sempre e comunque anche se il voto è minore
        di 18 
        */

        System.out.println("\n\nESEMPIO 4:\n");
        /*
         If dentro if ,
         cioè if annidati.
         Nota che con gli operatori logici che poi vedremo
         questo codice può essere scritto meglio
         */

         if(voto>0)
            if(voto>=18)
                if(voto<=30){
                    System.out.print("Complimenti!\n");
                    System.out.println("Promosso\n");
                }

         /*
            Spiegazione esempio sopra:
            La condizione nel secondo if è testata solo se la condizione del primo if è vera
            cioè se voto>0
            La condizione nel terzo if è testata solo se la condizione del secondo  if
            è vera.
            Il corpo del terzo if cioè i due messaggi di stampa sono eseguiti solo
            se sono arrivato a potere testare la condizione del terzo if e contemporaneamente
            questa è vera cioè voto<=30

            Cioè le due stampe sono eseguite solo se contemporaneamente
            voto>0
            voto>18
            voto<=30

            (Per precisione il primo if è superfluo,
            basterebbe testare il secondo if e basta dato che se voto è maggiore di 18
            èanche maggiore di zero)
         */
    }
}
