public class ContinueEsempio {
    public static void main(String[] args) {

        for(int contatore = 1 ; contatore<=10 ;contatore++){
            if(contatore == 5)
                continue; //Quando questa viene eseguita tutte le restanti istruzioni del for non sono eseguite. Si fa l'incremento di contatore e si rivaluta la condizione del for. Nel while e do while dopo il continue si valuta direttamente la condizione senza fare un incremento.
            System.out.printf("%d ",contatore);
        }
    }
}
