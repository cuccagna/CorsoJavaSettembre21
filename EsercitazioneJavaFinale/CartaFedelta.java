import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CartaFedelta {
    public boolean chiediCartaFedelta(String messaggio){
        int scelta;
        //Finchè non scegli si o no continua a chiedere
        while(true){
            scelta = JOptionPane.showConfirmDialog(null, messaggio , "Carta fedeltà", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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

    public boolean inserisciCartaFedelta(){
        String codiceCartaFedelta;
        boolean reinserisci;

        do{
            while(true){
                reinserisci = false;
                codiceCartaFedelta=JOptionPane.showInputDialog(null, "Inserisca il codice della carta fedeltà", "Codice carta fedeltà",JOptionPane.PLAIN_MESSAGE);
            
                if(codiceCartaFedelta==null || codiceCartaFedelta.equals("") )
                    JOptionPane.showMessageDialog(null, "Scelta non valida. Riprova","Errore",JOptionPane.ERROR_MESSAGE);
                else
                    break;
            }

            if(!validaCodiceCartaFedelta(codiceCartaFedelta))
            {
                reinserisci = notificaCartaFedeltaNonValida();
                if(!reinserisci) //Se sei qui c'è un errore e non vuoi reinserire
                    return false;
            }
        }while(reinserisci);

        return true;
    }

    private boolean notificaCartaFedeltaNonValida(){
        JOptionPane.showMessageDialog(null, "Il codice della carta non è valido o non è registrato", "Errore codice carta", JOptionPane.ERROR_MESSAGE);
        return chiediCartaFedelta("Vuole inserire un altro codice per la carta fedeltà?");
    }

    //Verifica se rispetta il formato come prima cosa e se è presente
    //nel file dove ci sono tutte le carte fedeltà registrate
    private boolean validaCodiceCartaFedelta(String codiceCartaFedelta){
        if(!codiceCartaFedelta.matches("[a-zA-Z]{7}\\d{2}[a-zA-Z]\\d{2}"))
            return false;

            try {
                FileReader reader = new FileReader("CartaFedelta.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if(line.equals(codiceCartaFedelta))
                        return true;
                }
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        return false; //se sei qui nessun codice nel file corrisponde a quello inserito
    }
}
