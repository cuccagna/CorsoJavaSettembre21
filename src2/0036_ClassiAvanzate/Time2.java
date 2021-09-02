public class Time2
{
   private int hour;   // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59

   // costruttore senza argomenti Time2: inizializza a zero ogni variabile d'istanza
   public Time2()
   {
      this( 0, 0, 0 ); // questa istruzione invoca il costruttore di Time2 con 3 argomenti
   } 

   // costruttore Time2: hour fornita, minute and second a zero di default
   public Time2( int h ) 
   { 
      this( h, 0, 0 ); // questa istruzione invoca il costruttore di Time2 con 3 argomenti
   } 

   // costruttore Time2: hour e minute forniti, second a zero di default
   public Time2( int h, int m ) 
   { 
      this( h, m, 0 ); // questa istruzione invoca il costruttore di Time2 con 3 argomenti
   } // end Time2 two-argument constructor 

   // costruttore Time2: hour minute e  second forniti
   public Time2( int h, int m, int s ) 
   { 
      setTime( h, m, s ); 
   } 

   // costruttore Time2: un altro oggetto Time2 fornito come parametro
   public Time2( Time2 time )
   {
      // invoca il costruttore a 3 argomenti di Time2
      //avrei anche potuto scrivere anche time.hour invece
      //di time.getHour() nonostante hour è private perchè
      //l'oggetto time è dello stesso tipo (stessa classe)
      //della classe corrente
      //Ovviamente stesso discorso per minute e second
      this( time.getHour(), time.getMinute(), time.getSecond() );
   } 

   // metodi set
   // imposta un nuovo orario usando "l'orario universale"; assicura che 
   // i dati rimangono consistenti settando i valori non validi a zero
   public void setTime( int h, int m, int s )
   {
      setHour( h );   // setta hour
      setMinute( m ); // setta minute
      setSecond( s ); // setta second
   } 

   // valida ed imposta hour 
   public void setHour( int h ) 
   { 
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
   } 

   //valida ed imposta minute 
   public void setMinute( int m ) 
   { 
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
   } 

   // valida ed imposta second 
   public void setSecond( int s ) 
   { 
      second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
   } 

   // Metodi get
   // ritorna valore di hour 
   public int getHour() 
   { 
      return hour; 
   } 

   // ritorna valore di minute
   public int getMinute() 
   { 
      return minute; 
   } 

   // get second value
   public int getSecond() 
   { 
      return second; 
   } 

   // converti ad una String in formato universal-time (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   }

   // converti ad una Stringa in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   } 
}
