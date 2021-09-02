public class PigLatinTest {
    
    /* La console*/
    public static void main(String[] args) {
        PigLatin latinConvertitore = new PigLatin();
        latinConvertitore.inserisciTesto();
        System.out.printf("\nIl testo inserito è:\n%s\n",latinConvertitore.getTestoInserito());
        latinConvertitore.traduci();
        System.out.printf("\nIl testo tradotto è:\n%s",latinConvertitore);

        //Qua faccio vedere che funziona anche se faccio un altro inserimento
        latinConvertitore.inserisciTesto();
        System.out.printf("\nIl testo inserito è:\n%s\n",latinConvertitore.getTestoInserito());
        latinConvertitore.traduci();
        System.out.printf("\nIl testo tradotto è:\n%s",latinConvertitore);

    }
}
