public class BreakEsempio {
    public static void main(String[] args) {
        int contatore; //dichiarata fuori dal for per usarla anche fuori il for

        for(contatore = 1 ; contatore<=10 ;contatore++){
            if(contatore == 5)
                break;
            System.out.printf("%d ",contatore);
        }
        //Dopo che viene eseguito il break l'esecuzione continua da qui
        System.out.printf("\nDopo l'uscita dal for contatore = %d",contatore);
    }
}
