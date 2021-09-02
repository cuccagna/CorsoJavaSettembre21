public class ThisTest 
{
   public static void main( String args[] )
   {
      SimpleTime orario = new SimpleTime( 15, 30, 19 );
      System.out.println( orario.buildString() );
   } // fine main
} // fine classe ThisTest

// classe SimpleTime chiarisce il riferimento this
class SimpleTime 
{
   private int hour;   // 0-23
   private int minute; // 0-59
   private int second; // 0-59 

   // se il costruttore usa nomi dei parametri identici ai 
   // nomi delle variabili d'istanza il riferimento thi è 
   // richiesto per distinguere tra i nomi
   public SimpleTime( int hour, int minute, int second )
   {
    //cioè hour è il parametro,   this.hour la variabile d'istanza
      this.hour = hour;      // imposta "this"  hour dell'oggetto
      this.minute = minute;  // imposta "this"  minute dell'oggetto
      this.second = second;  // imposta "this"  second dell'oggetto
   } 

   // uso esplicito ed implicito di "this" per chiamare toUniversalString()
   public String buildString()
   {
      return String.format( "%24s: %s\n%24s: %s", 
         "this.toUniversalString()", this.toUniversalString(),
         "toUniversalString()", toUniversalString() );
   } // end method buildString

   // converti in una String in formato universal-time  (HH:MM:SS)
   public String toUniversalString()
   {
      
      /*Qui this non sarebbe richiesto esplicitamente perchè non si hanno
         variabili locali con lo stesso nome delle variabili d'istanza*/
      return String.format( "%02d:%02d:%02d", 
         this.hour, this.minute, this.second );
   } // end method toUniversalString
}