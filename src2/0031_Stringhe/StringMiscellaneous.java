public class StringMiscellaneous 
{
   public static void main( String args[] )
   {
      String s1 = "hello there";
      char charArray[] = new char[ 5 ];

      System.out.printf( "s1: %s", s1 );

      
      System.out.printf( "\nLength of s1: %d", s1.length() );

      
      System.out.print( "\nThe string reversed is: " );

      for ( int count = s1.length() - 1; count >= 0; count-- )
         System.out.printf( "%s ", s1.charAt( count ) );

      //copia i caratteri dalla stringa all'array di caratteri
      //Primo argomento indice della stringa (s1 in questo caso)
      //da cui iniziare la copia, 5 indice della stringa(s1) +1
      //fino a cui copiare (cioè in questo caso prendi gli indici da 0 a 4
      //estremi inclusi) e copiali in charArray (array di char terzo parametro)
      //e  mettili in questo array a partire dalla posizione con indice 0 dell'array
      s1.getChars( 0, 5, charArray, 0 );
      System.out.print( "\nThe character array is: " );

      for ( char character : charArray )
         System.out.print( character );

      System.out.println();
   } 
}