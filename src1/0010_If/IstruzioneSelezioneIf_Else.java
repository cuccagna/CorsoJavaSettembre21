import java.util.Scanner;


public class IstruzioneSelezioneIf_Else {
    public static void main(String[] args) {
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Prego\nInserisca un voto:");
        int voto = inserisci.nextInt();
        inserisci.close();
        
        System.out.println("\n\nESEMPIO 1:\n");

        //corpo dell'if eseguito se la condizione voto>=18 è vera
        //corpo dell'else eseguito solo se la condizione voto>=18 è falsa
        //Quindi viene eseguito solo 1 dei due, non possono mai essere eseguiti
        //entrambi.
        if(voto>=18)
            System.out.println("Promosso\n");
        else
            System.out.println("Bocciato\n");

        System.out.println("\n\nESEMPIO 2:\n");

        //if-else nidificato
        if(voto>=27){
            System.out.println("Promosso");
            System.out.println("Complimenti!");
            System.out.println("Ottimo voto");
        }
        else //Sono qui solo se voto<=26
            if(voto>=24){ //ma io voglio distinguere che non sia solo minore o uguale di 26 ma voglio stampare un messaggio diverso tra 24 e 26 allora metto un if dopo l'else
                //Sono qui solo se voto>=24 e contemporaneamente voto<=26
                System.out.println("Promosso");
                System.out.println("Buon voto");
            }
            else //sono qui solo se voto<=23
                if(voto>=18) 
                    System.out.println("Promosso"); //Sei qui se voto compreso tra 18 e 23
                else //cioè se voto<18
                    System.out.println("Bocciato"); 

            System.out.println("\n\nESEMPIO 3:\n");
            /*ELSE PENDENTE
            L'else si riferisce al primo if sopra di lui.
            Ma se volessi "riferire" quell'else a un altro if come fare?
            Vedere esempio seguente
            */

            int x=3;
            int y=2;

            if( x >5 )
                if( y > 5)
                    System.out.println("x e y sono > 5");
            else
                System.out.println("x e' <= 5");

            /*
                Come si comporta il pezzo di codice sopra e a chi si riferisce
                l'else. Ad if( x >5 )  o a if( y > 5)?
                Per quanto detto sopra l'else si riferisce normalmente al primo if
                sopra di lui cioè a if( y > 5) nell'esempio per cui quell'else
                è eseguito solo quando y>5 che è la condizione dell'if è falsa.
                Ma a sua volta if( y > 5) non è mai valutato perchè si trova dentro
                 if( x >5 ) ed è eseguito solo quando x>5 ma in questo caso x vale 8
                 quindi il pezzo di codice sopra non stamperà niente.
                 e il messaggio nell'else è fuorviante perchè quella stampa avverrà
                 quando x>5 è vera ed anche y>5 è falsa (cioè y<=5) 
            */


            System.out.println("\n\nESEMPIO 4:\n");

            /*
                Nell'esempio per avere che l'else si riferisca a if( x >5 ) e non a
                if( y > 5)  devo usare le parentesi graffe in questa maniera.*/

                if( x >5 ){
                    if( y > 5)
                        System.out.println("x e y sono > 5");
                }
                else //Adesso questo ramo sarà eseguito qundo x<=5 a prescindere dal valore di y
                    System.out.println("x e' <= 5");

    }
}
