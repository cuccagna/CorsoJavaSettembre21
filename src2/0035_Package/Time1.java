
package it.labfortraining.corsoJava.crearePackage;

public class Time1  
{
   private int hour;   // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   // imposta un nuovo orario usando il formato universale; assicura che
   // i  dati rimangono consistenti settando valori non validi a zero
   public void setTime( int h, int m, int s )
   {
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 );   // valida ore
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); // valida minuti
      second = ( ( s >= 0 && s < 60 ) ? s : 0 ); // valida secondi
   } // end method setTime

   // converti a String in formato universal-time  (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format( "%02d:%02d:%02d", hour, minute, second );
   } // fine metodo toUniversalString

   // converti a String in standard-time formato (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ),
         minute, second, ( hour < 12 ? "AM" : "PM" ) );
   } // fine metodo toString
} 
