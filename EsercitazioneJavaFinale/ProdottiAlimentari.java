public class ProdottiAlimentari extends Prodotti{

    private Data scadenza;

    public ProdottiAlimentari(Data scadenzaProdotti,String codiceABarreProdotti, String descrizioneProdotti, double prezzoProdotti){
        super(codiceABarreProdotti, descrizioneProdotti, prezzoProdotti);
        setScadenza(scadenzaProdotti);
    }

    public ProdottiAlimentari(Data scadenzaProdotti,String codiceABarreProdotti, String descrizioneProdotti, double prezzoProdotti,boolean duplicatoAmmesso){
        super(codiceABarreProdotti, descrizioneProdotti, prezzoProdotti,duplicatoAmmesso);
        setScadenza(scadenzaProdotti);
    }

    public void setScadenza(Data scadenzaProdotti){
        scadenza = scadenzaProdotti;
    }

    public Data getScadenza(){
        return scadenza;
    }

    public double applicaSconto(){
        if(getScadenza().getDifference(new Data())<10){
            double sconto = getPrezzo()*0.20;
            double prezzoScontato = getPrezzo() - sconto;
            return prezzoScontato;
        }
        return getPrezzo();
    }

    public String toString(){
        return String.format("%sscadenza:%s\n", super.toString(),getScadenza());
    } 

}
