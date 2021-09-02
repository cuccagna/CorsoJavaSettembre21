public class Impiegato {
    private String nome;
    private String cognome;
    private Data dataCompleanno;
    private Data dataAssunzione;
 
    // costruttore per inizializzare nome cognome e data di compleanno e assunzione
    public Impiegato( String n, String c, Data dataDelCompleanno, 
       Data dataDiAssunzione )
    {
       nome = n;
       cognome = c;
       dataCompleanno = dataDelCompleanno;
       dataAssunzione = dataDiAssunzione;
    } 
 
    // convert Impiegato nel formato String
    public String toString()
    {
       return String.format( "%s, %s  Assunto: %s  Compleanno: %s", 
          cognome, nome, dataAssunzione, dataCompleanno );
    }   
}
