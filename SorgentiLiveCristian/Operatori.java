public class Operatori {
    public static void main(String[] args) {
        /* int n1;
        int n2; */
        //Equivalente alla dichiarazione sopra
        int n1=5,n2=2;
        int somma,sottrazione,divisione,moltiplicazione;
        int risultato;

        somma = n1 + n2 + n2;
        sottrazione = n2-n1;
        moltiplicazione = n1 * n1 * n2;
        //La divisione tra numeri interi produce un risultato ancpra intero (senza virgola)
        divisione = n1 / n2;
        //divisione

        //Moltiplicazione e divisione hanno la stessa precedenza tra di loro
        //ma maggiore rispetto alla somma e alla sottrazione.
        risultato = n1+n2*n1;

        //L'associatività dei quattro operatori +,-,*,/ è da sinistra a destra
        //quindi in caso di stessa precedenza viene eseguito prima quello più a sinistra.
        //In ogni caso usare le parentesi per fugare eventuali dubbi.
        risultato = n1/(n2*n1);

        //Operatore modulo %
        //Prende il resto
        //Però se il primo numero è più piccolo del secondo il risultato
        //del modulo è il primo numero
        risultato = n1 % n2;

    }
}
