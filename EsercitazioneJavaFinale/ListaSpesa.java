import java.util.HashMap;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ListaSpesa {
    private boolean cartaFedeltaAbilitata = false;
    private HashMap<Prodotti, Integer> listaProdotti = new HashMap<Prodotti, Integer>();

    private void setCartaFedeltaAbilitata(boolean statoAbilitazioneCarta){
        cartaFedeltaAbilitata = statoAbilitazioneCarta;
    }
                        
    public boolean getCartaFedeltaAbilitata(){
        return cartaFedeltaAbilitata;
    }

    public void start(){
        listaProdotti.clear();
        CartaFedelta fidelityCard = new CartaFedelta();
        if(fidelityCard.chiediCartaFedelta("Vuole usare la carta fedeltà?"))
            setCartaFedeltaAbilitata( fidelityCard.inserisciCartaFedelta() );

        inserisciProdotti();
    }

    public double calcolaTotale(){
        Prodotti prodotto;
        Integer quantitaProdotto;
        double totale=0;
        for (var entry : listaProdotti.entrySet()) {
            prodotto = entry.getKey();
            quantitaProdotto = entry.getValue();
            //System.out.printf("%d\n\n", quantitaProdotto.intValue());
            if(getCartaFedeltaAbilitata())
                totale += prodotto.applicaSconto() * quantitaProdotto;
            else
                totale += prodotto.getPrezzo() * quantitaProdotto;  
        }

        return totale;
    }

    private void inserisciProdotti(){
        while(true){
            inserisciProdotto();
            if(!chiediSeInserireProdotto("Vuoi inserire un altro prodotto?"))
                return;
        }
    }

    private void inserisciProdotto(){
        String codiceProdotto;
        Prodotti prodottoInserito;
        boolean reinserisci;


        do{
            reinserisci = false;
            while(true){
                codiceProdotto = JOptionPane.showInputDialog(null, "Inserisca il codice del prodotto", "Codice del prodotto",JOptionPane.PLAIN_MESSAGE);
                if(codiceProdotto==null || codiceProdotto.equals("") )
                    JOptionPane.showMessageDialog(null, "Scelta non valida. Riprova","Errore",JOptionPane.ERROR_MESSAGE);
                else
                    break;
            }

            if( (prodottoInserito=validaCodiceProdotto(codiceProdotto)) == null){
                reinserisci = notificaProdottoNonValido();
            }
            else{
                //Se il prodotto già esiste incrementare la quantità di uno
                Integer quantitaDiQuelProdotto = listaProdotti.get(prodottoInserito);
                if(quantitaDiQuelProdotto == null)
                    listaProdotti.put(prodottoInserito,1);
                else
                    listaProdotti.put(prodottoInserito,++quantitaDiQuelProdotto); 
            }
        }while(reinserisci);
    }

    public boolean chiediSeInserireProdotto(String messaggio){
        int scelta;
        //Finchè non scegli si o no continua a chiedere
        while(true){
            scelta = JOptionPane.showConfirmDialog(null, messaggio , "Codice Prodotto", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch(scelta){
                case JOptionPane.YES_OPTION:
                    return true; //break non necessari perchè c'è già il return

                 case JOptionPane.NO_OPTION:
                    return false;
                
                    //in tutti gli altri casi continua il ciclo, cioè chiedi di nuovo quando chiudi senza rispondere
                default:
                    JOptionPane.showMessageDialog(null, "Non hai fatto una scelta", "Fai una scelta", JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }

    private boolean notificaProdottoNonValido(){
        JOptionPane.showMessageDialog(null, "Il codice del prodotto inserito non è valido o non esiste", "Codice prodotto non valido", JOptionPane.ERROR_MESSAGE);
        return chiediSeInserireProdotto("Vuole inserire un altro codice per il prodotto?");
    }
    public Prodotti validaCodiceProdotto(String codiceProdotto){
        if(!codiceProdotto.matches("[a-zA-Z]\\d{3}[a-zA-Z]{2}"))
            return null;

            try {
                FileReader reader = new FileReader("Prodotti.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);
                String prodottoLine;
                while ((prodottoLine = bufferedReader.readLine()) != null) {
                    Prodotti prodottoIndividuato = parsaProdottoLine(prodottoLine,codiceProdotto);
                    if(prodottoIndividuato != null)
                        return prodottoIndividuato;
                }
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
                
            }

        return null;
    }
  
    private Prodotti parsaProdottoLine(String prodottoLine,String codiceProdotto){
        Scanner in = new Scanner(prodottoLine);
        boolean prodottoAlimentare = in.next().equals("A");
        String codiceProdottoFile = in.next();

        if(codiceProdottoFile.equalsIgnoreCase(codiceProdotto)){
            String descrizione = in.next();
            double prezzo = in.nextDouble();
            if(prodottoAlimentare){
                String dataScadenza = in.next();
                in.close();
                return new ProdottiAlimentari(new Data(dataScadenza), codiceProdottoFile, descrizione, prezzo,true);
            }
            else{ //prodotto non alimentare
                String materiale = in.next();
                in.close();
                return new ProdottiNonAlimentari(materiale,codiceProdottoFile,descrizione,prezzo,true);
            }
        }

        in.close();
        return null; //Se sei qui il codice prodotto della linea nel file non corrisponde al codice prodotto inserito dall'utente
        
    }
}
