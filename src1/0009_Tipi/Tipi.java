public class Tipi {
    public static void main(String[] args) {
        boolean vero = true;
        boolean falso = true;
        boolean falsoPerDavvero = false;

        /*In molti linguaggi è Ok. In Java no
        int num1 = vero;
        int num2 = (int) vero;
        */
        System.out.printf("Valore booleano vero = %b\nValore booleano falso = %b\nValore booleano falsoPerDavvero = %b\n",vero,falso,falsoPerDavvero);
        
        byte n2 = 3;

        //Nota la seguente istruzione darebbe un errore in compilazione senza usare l'operatore
        //di cast (byte) perchè 345 non può essere rapprsentato come byte. Allora
        //devi essere tu a dire al compilatore per me è ok.
        //QUESTO ACCADE SEMPRE QUANDO CERCHI DI ASSEGNARE UN TIPO PIU' IN ALTO
        //NELLA GERARCHIA A UNO PIU' IN BASSO.
        //LA GERARCHIA è
        /*
        double
        float
        long
        int
        short
        byte
        char
        */

        //Cast esplicito necessario, ma a tuo rischio e pericoli. Infatti
        //345 non è rappresentabile come un tipo byte perchè per il tipo byte
        //il massimo valore è 128 allora avviene un troncamento ottennendo
        //risultati disattesi.  Utilizzalo quando sei sicuro che il valore contenuto
        //nel tipo più in alto nella gerarchia è rappresentabile correttamente
        //anche con il tipo più in basso nella gerarchia cui stai facendo l'assegnamento
        byte n3 = (byte) 345;

        //n3 varrà 89 e non 345 perchè è avvenuto un trocamento dato che il massimo
        //valore del tipo byte è 345
        System.out.printf("\nAl tipo byte n3 è stato assegnato con cast esplicito 345\nn3=%d",n3);

        
        //Cast implicito
        int n4 =  n2; //Assegna un byte a un int che succede? Cast implicito! Sempre OK

        System.out.printf("\nn2 di tipo byte = %d\nn4 è int\nDopo n4=n2 si ha\nn4=%d",n2,n4);
    
        //A seguire altro esempio di cast esplicito necessario.
        double y=10;
        /*Siccome stai assegnando un tipo più in alto nella gerarchi ad uno più
          in basso darebbe errore. Necessario il cast esplicito.*/
        int x = (int) y;

        System.out.printf("\n\nx=%d\ny=%f\n\n", x,y);

        //Ma attenzione. Guarda che può succedere con un cast esplicito
        double w = 10.5;
        int z = (int) w;
        System.out.printf("\n\nz=%d\nw=%f\n\n", z,w);
        //Come puoi vedere dalla stampa stai cercando di assegnare un numero con la virgola
        //a un intero, lo puoi fare col cast esplicito ma perderai la virgola. Se
        //a te sta bene ok ma devi esserne consapevole. Non devi assumere che 
        //un eventuale parte decimale (cioè quella con la virgola venga conservata)

        //TIPO char
        //Questo tipo occupa un byte e si dichiara un suo valore con gli apici singoli
        char charExample = 'a';
        //non puoi scrivere char chraExample = 'abc' cioè tra i singoli apici ci deve essere un solo carattere
        //Ad ogni carattere corrisponde un valore numerico. Se non utilizzi caratteri
        /*strani ma ti limiti a quelli del codice ASCII (guarda appendice o cerca su Internet codice ASCII)
         ciascuno di essi sarà 1 byte e quindi rappresentabile in un tipo char. 
         Ad essere precisi JAVA usa UNICODE ma non è rilevante se ti limiti ad usare
         caratteri normali.*/

         //Ogni carattere ASCII ha associato un valore numerico intero (vedi tabella ASCII)
         //Per vedere questo valore intero devi fare un cast esplicito da char a int
         int fromCharToInt = (int) charExample;

         System.out.printf("\nIl valore numerico del carattere %c è %d\n",charExample,fromCharToInt);
    
        //OPERAZIONI TRA TIPI DIVERSI
        //Nota questo modo di dichiarare più variabili DELLO STESSO TIPO su stessa riga
        int num1,num2,result;
        //Nota che = associa da destra a sinistra quindi la seguente equivale a fare
        //prima num2=9;       e   poi   num1=num2;
        //Quindi entrambe hanno valore 9
        num1 = num2 =9;

        //Nessun problema num1,num2,result tutte e 3 dello stesso tipo
        result = num1+num2;

        double result2;

        //Somma num1 e num2 che sono interi che torna un intero che andrebbe 
        //assegnato a result2 che è double allora quello che viene tornato da
        //num1+num2 viene implicitamente convertito a double perchè da int a double
        //si va dal basso verso l'alto nella gerarchia. NO PROBLEM
        result2 = num1+num2;

        double addendo1 =10.5;

        //Qui somma tra un double e un int assegnata a un double. Ci aspettiamo
        //Faccia 10.5+9= 19.5  Funzionerà
        double result3 = addendo1 + num2;

        /*Si funzionerà perchè ecco quello che accade:
          Java quando deve fare un'operazione si aspetta che entrambi gli
          operandi siano dello stesso tipo. In questo caso addendo1 è double
          e num2 è int .  
          Allora converte l'operando più in basso nella gerarchia nel tipo 
          dell'operando più in alto nella gerarchia. Nell'esempio num2 che è int
          è automaticamente convertito a double cioè 9 diventa un double "temporaneo"
          Esegue la somma tra due double e la assegna a result3 che è pure double.
          NO PROBLEM
          */

          /*Invece la seguente istruzione è un problema perchè?
          int result4 = addendo1 + num2;

          Quello che accade nell'istruzione sopra è uguale a quanto detto prima
            per ciò che riguarda addendo1 + num2 ma quando ottengo il risultato
            19.5 che è un double lo assegno a un intero  quindi vado da double
            a int cioè verso il basso nella gerarchia per cui è un errore in
            compilazione. Devi fare un cast esplicito per eseguirla*/

            /*L'istruzione sopra quella in result4 non può essere eseguita
              senza cast esplicito. Ma attenzione perchè la seguente con il cast
              esplicito stampa 19 e non 19.5 perchè quando assegni da double a
              int se il double contiene una parte con la virgola la parte con la
              virgola viene perduta
              */
            int result5 = (int) (addendo1 + num2);

            //LA DIVISIONE TRA INTERI E' UN ERRORE TIPICO IN JAVA

            //NOTARE quest altro modo per dichiarare e contemporaneamente
            //inizializzare più variabili dello stesso tipo su un'unica riga
            int x1=5,x2=3;

            double result6 = x1/x2;
            /*
              result6 avrà il valore 1,000000 perchè essendo x1 ed x2 interi viene
              fatta la divisione intera che elimina la parte frazionaria
              */

              double result7 = (double) x1 / x2;

              /*
                Per ovviare al problema precedente è necessario fare un cast
                esplicito di uno dei valori interi a double, x1 nell'esempio.
                Così dato che un operando è double ed entrambi gli operandi 
                nelle operazioni in Java devono essere dello stesso tipo x2
                subisce un cast implicito da int a double così verrà fatto
                5/2 in modo da restituire un risultato con la virgola
                (Nota che è necessario che anche result7 sia double)
              */

              /*
                Nota che nella printf a seguire + è un operatore che serve
                a concatenare le stringhe e serve per spezzare su più
                righe la printf che altrimenti su un'unica riga risulterebbe
                lunghissima
                */
                 
              System.out.printf("Stampa di riepilogo delle variabili risultato:"+
              "\n\nresult = %d\nresult2 = %f\nresult3 = %f"+
              "\nresult5 = %d\nresult6 = %f\nresult7 = %f\n",
              result,result2,result3,result5,result6,result7);

/*             int nonInitializedVariable;
            System.out.printf("La viariabile nonInitializedVariable ha valore = %d",nonInitializedVariable);
 
            Il codice sopra darebbe errore perchè si sta tentando di stampare una variabile
            non inizializzata.
            Nota però che le variabili d'istanza primitiva vengono inizializzate a zero
            tranne quelle booleane inizializzate a false

            Stessa cosa per:
                String stringaNonInizializzata;
                System.out.printf("La viariabile nonInitializedVariable ha valore = %s",stringaNonInizializzata);

            In questo caso il tipo della variabile è un RIFERIMENTO e solo per le variabili
            d'istanza viene inizializzato a null. Qui darebbe ancora un errore perchè è una
            variabile locale.
            Nota che i nomi delle classi già esistenti nelle librerie Java, e quelle che creiamo
            noi diventano dei nuovi tipi chiamati riferimenti che possiamo usare come tipi
            di variabili create da noi.
            Un esempio è
            Scanner input = new Scanner(System.in);

            in questo caso input è una variabile di tipo Scanner (classe preesistente
            nel package java.util.Scanner) ed è pertanto un riferimento.
        */     

    }
}
