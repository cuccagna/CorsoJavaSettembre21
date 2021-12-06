public class ProdottiNonAlimentari extends Prodotti {

    private String materiale;

    public ProdottiNonAlimentari(String materialeProdotti,String codiceABarreProdotti, String descrizioneProdotti, double prezzoProdotti){
        super(codiceABarreProdotti, descrizioneProdotti, prezzoProdotti);
        setMateriale(materialeProdotti);
    }

    public ProdottiNonAlimentari(String materialeProdotti,String codiceABarreProdotti, String descrizioneProdotti, double prezzoProdotti,boolean duplicatoAmmesso){
        super(codiceABarreProdotti, descrizioneProdotti, prezzoProdotti,duplicatoAmmesso);
        setMateriale(materialeProdotti);
    }

    public void setMateriale(String materialeProdotti){
        materiale = materialeProdotti;
    }

    public String getMateriale(){
        return materiale;
    }

    public double applicaSconto(){
        String materiali[] = {"plastica","vetro","carta"};
        for(int i=0;i<materiali.length;i++){
            if(getMateriale().equalsIgnoreCase(materiali[i])){
                double sconto = getPrezzo()*0.10;
                double prezzoScontato = getPrezzo() - sconto;
                return prezzoScontato;
            }
            
        }
        return getPrezzo();
    }

    public String toString(){
        return String.format("%smateriale:%s\n", super.toString(),getMateriale());
    } 
}
