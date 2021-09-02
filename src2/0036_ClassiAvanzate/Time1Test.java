public class Time1Test 
{
   public static void main( String args[] )
   {
      // crea ed inizializza un oggetto Time1
      Time1 time = new Time1(); // invoca costruttore Time1 

      // Stampa la rappresentazione stringa dell'orario
      System.out.print( "L'orario in formato universale e': " );
      System.out.println( time.toUniversalString() );
      System.out.print( "L'orario standard iniziale e': " );
      System.out.println( time.toString() );//puoi mettere anche solo time   Il metodo toString() sarà chiamato automaticamente
      System.out.println(); 

      // modifica l'orario e stampalo
      time.setTime( 13, 27, 6 ); 
      System.out.print( "L'orario in formato universale dopo setTime è: " );
      System.out.println( time.toUniversalString() );
      System.out.print( "L'orario in formato standard dopo setTime è: " );
      System.out.println( time.toString() );
      System.out.println(); 

      // imposta l'orario con valori non validi; stampa orario aggiornato 
      time.setTime( 99, 99, 99 ); 
      System.out.println( "After attempting invalid settings:" );
      System.out.print( "Universal time: " );
      System.out.println( time.toUniversalString() );
      System.out.print( "Standard time: " );
      System.out.println( time.toString() );
   } // fine main
}
