import java.util.HashSet;

public class Prodotti implements Cloneable{

    private String codiceABarre;
    private String descrizione;
    private double prezzo;
    private boolean clonato;
    private boolean duplicatoAmmesso;
    private static HashSet<String> coidiciABArrePresenti = new HashSet<String>();


    public Prodotti(String codiceABarreProdotti, String descrizioneProdotti, double prezzoProdotti,boolean duplicatoAmmessoProdotto){
        duplicatoAmmesso = duplicatoAmmessoProdotto;
        clonato = false;
        setCodiceABarre(codiceABarreProdotti);
        setDescrizione(descrizioneProdotti);
        setPrezzo(prezzoProdotti);
    }

    public Prodotti(String codiceABarreProdotti, String descrizioneProdotti, double prezzoProdotti){
        duplicatoAmmesso = false;
        clonato = false;
        setCodiceABarre(codiceABarreProdotti);
        setDescrizione(descrizioneProdotti);
        setPrezzo(prezzoProdotti);
    }

    public void setCodiceABarre(String codiceABarreProdotti){
        if(!clonato && !duplicatoAmmesso){

            verificaUnivocita(codiceABarreProdotti);

        }

        codiceABarre = codiceABarreProdotti;

    }

    public String getCodiceABarre(){
        return codiceABarre;
    }

    public void setDescrizione(String descrizioneProdotti){
        descrizione = descrizioneProdotti;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setPrezzo(double prezzoProdotti){
        prezzo = prezzoProdotti;
    }

    public double getPrezzo(){
        return prezzo;
    }

    private void verificaUnivocita(String codiceABarreProdotti){

        if (coidiciABArrePresenti.contains(codiceABarreProdotti)){
            throw new RuntimeException("Il codice a barre del prodotto non e' univoco");
        }else{
            coidiciABArrePresenti.add(codiceABarreProdotti);
        }


    }
    
    public String toString(){

        return String.format("Prodotto:\ncodice a barre:%s\ndescrizione:%s\nprezzo:%.2f\n",getCodiceABarre(),getDescrizione(),getPrezzo());

    }

    public int hashCode() {
        return getCodiceABarre().hashCode();
    }

    public boolean equals(Object p){
        if(p != null && getClass().equals(p.getClass())){
        
            Prodotti prod = (Prodotti)p;
            return (getPrezzo() == prod.prezzo) && (getDescrizione().equals(prod.descrizione)) && (getCodiceABarre().equals(prod.codiceABarre));

        }else{
            return false;
        }
    }

    public Object clone(){
        try{
        Prodotti prodottoCopiato = (Prodotti) super.clone();
        prodottoCopiato.clonato = true;
        prodottoCopiato.setCodiceABarre(new String(getCodiceABarre()));
        prodottoCopiato.setDescrizione(new String(getDescrizione()));
        return prodottoCopiato;
        }
        catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }




    public double applicaSconto(){
        
    double sconto = getPrezzo()*0.05;
    double prezzoScontato = getPrezzo() - sconto;
    return prezzoScontato;
    //le istruzioni sopra possono essere sostituite da -//
    //- return getPrezzo()*0.95;//


    }

}
