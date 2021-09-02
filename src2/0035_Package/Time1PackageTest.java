// Time1PackageTest.java
// Time1 object usato in un'applicazione
import it.labfortraining.corsoJava.crearePackage.Time1; // import classe Time1

public class Time1PackageTest 
{
   public static void main( String args[] )
   {
      // crea ed inizializza un oggetto Time1
      Time1 time = new Time1(); // chiama costruttore Time1

      // stampa la rappresentazione stringa dell'orario
      System.out.print( "The initial universal time is: " );
      System.out.println( time.toUniversalString() );
      System.out.print( "The initial standard time is: " );
      System.out.println( time.toString() );
      System.out.println(); // output a blank line

      // modifica l'orario e stampa l'orario modificato 
      time.setTime( 13, 27, 6 ); 
      System.out.print( "Universal time after setTime is: " );
      System.out.println( time.toUniversalString() );
      System.out.print( "Standard time after setTime is: " );
      System.out.println( time.toString() );
      System.out.println(); // output a blank line

      // imposta orario con valori non validi; in uscita avrai un orario modoficato 
      time.setTime( 99, 99, 99 ); 
      System.out.println( "After attempting invalid settings:" );
      System.out.print( "Universal time: " );
      System.out.println( time.toUniversalString() );
      System.out.print( "Standard time: " );
      System.out.println( time.toString() );
   } // end main
} // end class Time1PackageTest




