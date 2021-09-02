public class ImpiegatoSuCommissionePiuBase2 extends ImpiegatoSuCommissione2
{
   private double salarioBase; // salario di base (mensile ad esempio)

   // costruttore a 6 argomenti
   public ImpiegatoSuCommissionePiuBase2( String nome, String cognome, 
      String nps, double vendite, double tasso, double salario )
   {
      super( nome, cognome, nps, vendite, tasso );
      setSalarioBase( salario ); // validate and store base salario
   
      /* System.out.printf( 
         "\   public ImpiegatoSuCommissionePiuBase2( String nome, String cognome, constructor:\n%s\n", this ); 
         */
   } 
   
   // set salarioBase
   public void setSalarioBase( double salario )
   {
        salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
   } 

   // return salario di base
   public double getSalarioBase()
   {
      return salarioBase;
   } 

   // calcola la paga
   public double paga()
   {
      return getSalarioBase() + super.paga();
   } 

   // ritorna la rappresentazione Stringa dell'oggetto corrente 
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "salario di base + ", 
         super.toString(), "salario base", getSalarioBase() );
   } 
}
