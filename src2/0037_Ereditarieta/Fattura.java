public class Fattura implements Pagamento{
    private double prezzo;
    
    public Fattura(double p)
    {
        setPrezzo(prezzo);
    }

    public void setPrezzo(double p)
    {
        prezzo = (p<0.0) ? 0.0 : p;
    }

    public double getPagamento()
    {
        return 1.2*prezzo;  //torna prezzo con IVA
    }
}
