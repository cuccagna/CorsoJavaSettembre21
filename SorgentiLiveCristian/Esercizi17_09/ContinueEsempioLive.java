public class ContinueEsempioLive {
    public static void main(String[] args) {
        int contatore;

        for(contatore = 1 ; contatore <= 10 ; contatore++){
            if(contatore == 5)
                continue;

                System.out.printf("contatore=%d",contatore);
            
        }

        /* La differenza tra usare il continue nel while e nel ciclo for è
        che nel for l'incremento delle variabili usate nella condizione
        viene comunque eseguito. Con il ciclo while e do while no a meno
        che non metti questo incremento prima del continue */
        /* while(contatore<10){
            //contatore++; Mettere l'incremento qui per non andare in loop

            if(contatore==5)
                continue;

            contatore++;
            Stampa
            AltreIstruzioni
        }
        System.out.printf("contatore=%d",contatore);
    } */
}





/* int x=3;
switch(x)
{
    case 3:
    case 4:
    case 5:
        System.out.println();
        System.out.println();
    break;

    case 7:
        inserisci.nextInt();
    break;

    case 8:
    i=i+1;
    break;

    default:
    Stampa
    incremento
    Altre istruzioni
    break;

} */