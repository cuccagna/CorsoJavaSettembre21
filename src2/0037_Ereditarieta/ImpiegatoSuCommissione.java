//extends Object è superfluo, ogni classe eredita da Object automaticamente
public class ImpiegatoSuCommissione extends Object {
    
   private String nome;
   private String cognome;
   private String numPrevidenzaSociale;
   private double vendite; // ammontare delle vendite (mensile ad esempio)
   private double tassoCommissione; // percentuale di commissione sulle vendite

   // costruttore a 5 argomenti
   public ImpiegatoSuCommissione( String n, String c, String nps, 
      double vend, double tasso )
   {
      // qui accade una chiamata implicita al costruttore di default di Object
      nome = n;
      cognome = c;
      numPrevidenzaSociale = nps;
      setVendite( vend ); // valida e memorizza l'ammonatre lordo delle vendite
      setTassoCommissione( tasso ); // validate and store commission rate
   } 

   // set nome
   public void setNome( String n )
   {
      nome = n;
   } 

   // return nome
   public String getNome()
   {
      return nome;
   } 

   // set cognome
   public void setcognome( String c )
   {
      cognome = c;
   } 

   // return cognome
   public String getCognome()
   {
      return cognome;
   } 

   // set numero di previdenza sociale
   public void setNumPrevidenzaSociale( String nps )
   {
      numPrevidenzaSociale = nps; // dovresti validarlo, cioè appurarti che sia nel formato corretto
   } 

   // return social security number
   public String getNumPrevidenzaSociale()
   {
      return numPrevidenzaSociale;
   } 

   // set l'ammonatare delle vendite per l'impiegato.
   public void setVendite( double vend )
   {
      vendite = ( vend < 0.0 ) ? 0.0 : vend;
   } 

   
   public double getVendite()
   {
      return vendite;
   } 

   // set tasso di commissione sulle vendite da pagare all'impiegato
   public void setTassoCommissione( double tasso )
   {
      tassoCommissione = ( tasso > 0.0 && tasso < 1.0 ) ? tasso : 0.0;
   } 

   
   public double getTassoCommissione()
   {
      return tassoCommissione;
   } 

   // calcola la paga dell'impiegato
   public double paga()
   {
       //oppure return tassoCommissione * vendite;
      return getTassoCommissione() * getVendite();
   } 

   // ritorna una rappresentazione Stringa dell'oggetto impiegato
   public String toString()
   {
      return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
         "impiegato su commissione ", getNome(), getCognome(), 
         "numero di previdenza sociale", getNumPrevidenzaSociale(), 
         "vendite", getVendite(), 
         "tasso di commissione", getTassoCommissione() );
   } 
}
