import java.util.Scanner;
import java.util.StringTokenizer;

public class PigLatin {

    private StringBuffer testoOriginaleTokens[];
    private String testoInserito;
    private String testoTradotto;
    private final static String EMPTY_STRING = "";

    
    public PigLatin(){
        System.out.println("\nBenvenuto nel programma di conversione del testo in Pig Latin");
        setTestoInserito(EMPTY_STRING);
        setTestoTradotto(EMPTY_STRING);
    }

    

    public void setTestoTradotto(String testo){
        testoTradotto = testo;
    }

    public String getTestoTradotto(){
        return testoTradotto;
    }

    public void setTestoInserito(String s){
        testoInserito = s;
    }

    public String getTestoInserito(){
        return testoInserito;
    }

    public String toString(){
        return getTestoTradotto();
    }

    public void aggiungiTesto(String text){
        text = text.trim();
        //Controllo che il testo che si vuole inserire non sia vuoto
        if(!text.equals(EMPTY_STRING))
        {
            //Serve per separare le varie stringhe inserite, e se l'attuale contenuto è vuoto il separatore non deve essere uno spazio 
            String separator = getTestoInserito().equals(EMPTY_STRING) ? EMPTY_STRING : " ";
            setTestoInserito(getTestoInserito() + separator + text);
        }
    }

    //Permette di aggiungere testo anche su più linee
    public void inserisciTesto(){
        testoOriginaleTokens = null;
        Scanner inserisci = new Scanner(System.in);
        System.out.println("\nPrego, inserisca il testo da convertire:");
        do{
            String testo = inserisci.nextLine();
            aggiungiTesto(testo);
        }while(continuaInserimento());
        //inserisci.close();  Se lo chiudo non posso richiamare il metodo altre volte
    }

    //Ritorna true se si vuole continuare l'inserimento altrimenti torna false
    private boolean continuaInserimento(){
        Scanner inserisciAncora = new Scanner(System.in);
        String scelta;
        while(true){
            System.out.println("Si desidera inserire altro testo da convertire? S/N");
            scelta = inserisciAncora.nextLine().toUpperCase();
            if(scelta.equals("S")){
                //inserisciAncora.close();
                System.out.println("Prego, inserisca un'altra linea di testo da convertire");
                return true;
            }
            if(scelta.equals("N")){
                //inserisciAncora.close();
                return false;
            }
            
            //Se sei qui vuol dire che non hai inserito nè S nè N. Fare reinserire la scelta
            System.out.println("Errore: scelta non valida. Inserire solo S o N. Riprovare");
        }
    }

    public String traduci(){
        //Devi tokenizzare il testo originale solo la prima volta che chiami la traduzione
        if(testoOriginaleTokens == null){
            tokenizzaTestoDaTradurre();
            setTestoTradotto(traduciTesto());    
            return getTestoTradotto();
        }

        //Hai già il testo tradotto stampalo
        return getTestoTradotto();
    }

    private String traduciTesto(){
        StringBuffer testoTradotto = new StringBuffer();
        int numTokens = 0;
        //System.out.printf("\nLa traduzione in PIG LATIN del testo \n%s\nè:\n"
          //                ,getTestoInserito());
        for(StringBuffer token : testoOriginaleTokens){
            generateLatinToken(token); //nel metodo il token viene modificato
            /*if(numTokens++ % 5 == 0)
                System.out.println();

            System.out.printf("%s ",token);*/
            testoTradotto.append(token).append(" ");
        }

        return testoTradotto.toString();
    }

    public void generateLatinToken(StringBuffer token){
        final String PIG_LATIN_CODA = "ay"; 

        char firstCharacter = token.charAt(0);
        token.deleteCharAt(0);
        token.append(firstCharacter).append(PIG_LATIN_CODA);
    }

    private void tokenizzaTestoDaTradurre(){
        StringTokenizer tokens = new StringTokenizer(getTestoInserito());
        testoOriginaleTokens = new StringBuffer[tokens.countTokens()];
        for(int indice=0 ; tokens.hasMoreTokens() ; indice++)
            testoOriginaleTokens[indice] = new StringBuffer(tokens.nextToken());
    }
}
