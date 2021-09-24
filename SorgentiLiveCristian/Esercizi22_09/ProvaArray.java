public class ProvaArray {
    public static void main(String[] args) {
        int pippo[] = new int[10];

        //Queste due istruzioni sono del tutto analoghe a quella sopra
        int pippo[];
        pippo = new int[10];

        //Esempio di array non di tipo primitivo, ma di tipo String in questo caso
        String mieParole[] = new String[20];

        //Per accedere ai singoli elementi devi usare l'indice che va da 0
        //a dimensione dell'array-1

        //Lettura di un elemento (in questo caso il primo elemento) dell'array
        int x;
        x = pippo[0];

        //Modifica di un elemento dell'array
        pippo[0] = 5;

        /* Se provi ad accedere ad un array con un indice negativo o che supera
        o eguaglia la dimensione dell'array verrà lanciato un errore */
        pippo[10]
        pippo[11]
        pippo[-1]

        //Esempio di indicizzazione (cioè accesso) a un elemento di un array
        //tramite una variabile
        int indice = 3;

        pippo[indice+2]

        /* Tutti gli elementi di un array di boolean sono inizializzati a false.
        Per gli altri tipi primitivi invece l'inizializzazione è al valore 0
        Per i tipi riferimento come String ad esempio l'inizializzazione di
        default è al valore null */

        /* Puoi impostare la dimensione di un array dinamicamente
        ma una volta impostata la dimensione non puoi aumentarla nè diminuirla */
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Inserire la dimensione dell'array:\n");
        int dim = inserisci.nextInt();

        int myArray[] = new int[dim];



        boolean myArray[] = new boolean[11];
        //length torna la lunghezza dell'array che è in questo caso 11
        int dimensione = myArray.length; 



    }
}
