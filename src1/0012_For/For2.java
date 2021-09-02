import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        int base=0;
        boolean isInserimentoOk = false;

        Scanner inserisci = new Scanner(System.in);
        
        /*Nel seguente while richiedi l'inserimento finchè
          l'utente non inserisce un numero tra 2 e 5.
          Nota che se l'utente inserisse una stringa  cioè dei caratteri (non numerici)
          o un decimale il programma andrebbe in errore.
          Vedremo come gestire anche questo caso quando parleremo delle eccezioni
          */
        while(isInserimentoOk == false){
            System.out.println("Prego, inserisca la base:");
            base = inserisci.nextInt();
            if(base>=2)
                if(base<=5) //Esegue questo if solo se base>=2
                    isInserimentoOk = true; //Sei qui solo se hai sia base>=2 che base<=5
                else //Questo else si riferisce a if(base<=5) ed è eseguito solo se base>=2 e base>5
                    System.out.println("Errore, ha inserito una base maggiore di 5 (deve essere compresa tra 2 e 5)\nRiprovare");
            else //Questo else si riferisce a if(base>=2) ed è eseguito solo se base<2
                System.out.println("Errore, ha inserito una base minore di 2 (deve essere compresa tra 2 e 5)\nRiprovare");
        }//Fine while
        inserisci.close();

        //Se sei qui la base è tra 2 e 5

        System.out.printf("Esponente Potenze %d\n\n",base);
        //Nota nel for l'incremento di 2
        for(int esponente=1; esponente<=11 ; esponente+=2)
        {
            //pow è un metodo statico della classe Math (per i metodi statici
            //non serve creare un oggetto di quella classe per poterne usare il
            //metodo). Non è necessario importare il package di Math perchè è
            //java.util che è quello importato di default.
            //Il metodo pow prende il primo parametro e eleva questo numero
            //al secondo parametro l'esponente e ritorna un double che siccome
            //viene assegnato ad un intero che è più in basso nella gerarchia
            //è necessario convertire esplicitamente.
            int potenza = (int) Math.pow(base,esponente);
            System.out.printf("%-9d %d\n", esponente , potenza);
        }

    }
}
