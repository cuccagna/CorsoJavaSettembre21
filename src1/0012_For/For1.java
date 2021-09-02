

public class For1
{
    public static void main(String[] args) {

        //Stampare a video i numeri da 1 a 10
        for(int contatore=1 ; contatore<=10 ; contatore++)
            System.out.printf("%d\n",contatore);

            // Qui contatore non è più visibile. Sarebbe un errore System.out.printf("%d\n",contatore);

        /*Spiegazione codice sopra:
          La prima parte del for cioè int contatore=1 viene eseguita per prima
          Qui possono essere dichiarate delle variabili.
          Queste variabili saranno visibili solo nel corpo del for. Fuori non esistono
          Se vuoi che esistano anche fuori devi dichiararle prima e non nel ciclo for

          Poi si controlla la condizione(contatore<=10) se è vera si esegue il corpo del for
          altrimenti si prosegue dopo il for (cioè il for termina).  

          Se è vero vengono eseguite le istruzioni nel corpo del for e DOPO viene
          eseguita la terza parte del for cioè contatore++

          A questo punti viene rivalutata la condizione, se questa è ancora vera il
          corpo del for viene rieseguito altrimenti termina.

          Notare che la parte di inizializzazione (int contatore=1) viene eseguita solo
          la prima volta, invece quando il ciclo si ripete non viene mai più eseguita.
          */

        System.out.println("\n\nSecondo esempio\n\n");

          //Stampare a video i numeri da 1 a 10
        for(int contatore=0 ; contatore<10 ; contatore++)
            System.out.printf("%d\n",contatore+1);

        /*
        L'esempio sopra è uguale al precedente solo che la variabile contatore
        è inizializzata  a 0 e non a 1.  Questo comporta il dovere incrementare
        contatore nell'istruzione di stampa altrimenti verrebbero stampati i
        numeri da 0 a 9 e non da 1 a 10.  Tuttavia incrementare contatore di 1
        nella printf non modifica la variabile per cui è sempre necessario lasciare 
        nel for nella terza parte contatore++
        */

        System.out.println("\n\nTerzo esempio\n\n");


        //Stampare a video i numeri da 1 a 10
        for(int contatore=0 ; contatore<10 ; )
            System.out.printf("%d\n",++contatore);

        /*
            Il terzo esempio stampa ancora i numeri da 1 a 10 ma
            questa volta contatore è modificata (incrementata di 1)
            nella printf per cui nel for non è più necessario incrementare
            contatore (anzi farlo sarebbe un errore)
        */

        System.out.println("\n\nQuarto esempio\n\n");


        //Stampare a video i numeri da 1 a 10. QUi c'è un errore
        for(int contatore=0 ; contatore<10 ; )
            System.out.printf("%d\n",contatore++);

        /*L'errore è nel fare il post incremento anzichè il preincremento.
        Quindi sono stampati i numeri da 0 a 9.
        */

        System.out.println("\n\nQuinto esempio\n\n");


        //Stampare a video i numeri da 1 a 10. QUi c'è un errore
        for(int contatore=0 ; contatore<10 ; )
            System.out.printf("%d\n",contatore++);

        System.out.println("\n\nQuinto esempio\n\n");


        //Stampare a video i numeri da 1 a 10. QUi c'è un errore
        for(int contatore=0 ; contatore<10 ; )
            System.out.printf("%d\n",contatore++);
        
    }
}