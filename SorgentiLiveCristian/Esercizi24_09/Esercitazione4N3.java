public class Esercitazione4N3 {
    private String targa;
    private int cilindrata;
    private double prezzoListino;
    private String colore;

    private final static String coloriDisponibili[] = {"bianco","oro","rosso"};

    public Esercitazione4N3(String targa , int cilindrata ,String colore){
        this(targa,cilindrata,1000,colore); //chiamo il costruttore con 4 parametri
    }

    public Esercitazione4N3(String targa , int cilindrata , double prezzoListino , String colore){
        setTarga(targa);
        setCilindrata(cilindrata);
        setPrezzoListino(prezzoListino);
        setColore(colore);
    }

    public void setTarga(String targa){
        this.targa = targa;
    }

    public String getTarga(){
        return targa;
    }

    public void setCilindrata(int cilindrata){
        this.cilindrata = ((cilindrata<=0) ? 25 : cilindrata);
    }

    public int getCilindrata(){
        return cilindrata;
    }

    public void setPrezzoListino(double prezzoListino){
        this.prezzoListino = prezzoListino;
    }

    public double getPrezzoListino(){
        return prezzoListino;
    }

    public void setColore(String colore){
        boolean isColoreDisponibile = false;
        for(String col : coloriDisponibili){
            if(col.equals(colore)){
                isColoreDisponibile = true;
                break;
            }
        }
        this.colore = (isColoreDisponibile==true) ? colore : "coloreNonValido";
    }

    public String getColore(){
        return colore;
    }

    public String toString(){
        return String.format("Le caratteristiche del motorino sono:\nTarga: %s\nCilindrata: %d\nPrezzo: %.2f\nColore: %s\n",getTarga(),getCilindrata(),getPrezzoListino(),getColore());
    }
}
