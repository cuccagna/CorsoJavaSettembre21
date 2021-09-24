public class Esercitazione4N2 {
    private String nome;
    private String cognome;
    private double pagaMensile;

    public Esercitazione4N2(String nomeImpiegato , String cognomeImpiegato , double pagaMensileImpiegato)
    {
        setNome(nomeImpiegato);
        setCognome(cognomeImpiegato);
        setPagaMensile(pagaMensileImpiegato);
        //nome = nomeImpiegato; + più corretto usare i metodi set
    }

    public void setNome(String nomeImpiegato){
        nome = nomeImpiegato;
    }

    public String getNome(){
        return nome;
    }

    public void setCognome(String cognomeImpiegato){
        cognome = cognomeImpiegato;
    }

    public String getCognome(){
        return cognome;
    }

    public void setPagaMensile(double pagaMensileImpiegato){
        /* if(pagaMensileImpiegato < 0.0){
            pagaMensile = 0.0;
            return;
        } */
        
        pagaMensile = ((pagaMensileImpiegato < 0.0) ? 0.0 : pagaMensileImpiegato);
    }

    public double getPagaMensile(){
        return pagaMensile;
    }

    
}
