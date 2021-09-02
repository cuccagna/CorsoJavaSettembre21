public class StringBufferConstructors 
{
   public static void main( String args[] )
   {
      //capacità 16 e lunghezza 0
      StringBuffer buffer1 = new StringBuffer();
      //Capacità 10 e lunghezza 0
      StringBuffer buffer2 = new StringBuffer( 10 );
      //Capacità=16 + length(hello)=16+5=21   lunghezza = 5
      StringBuffer buffer3 = new StringBuffer( "hello" );

      //toString() di StringBuffer può essere usato per convertire
      //un oggetto da StringBuffer a String
      System.out.printf( "buffer1 = \"%s\"\n", buffer1.toString() );
      System.out.printf( "buffer2 = \"%s\"\n", buffer2.toString() );
      System.out.printf( "buffer3 = \"%s\"\n", buffer3.toString() );
   } 
}