public class StringBufferAppend 
{
   public static void main( String args[] )
   {
      Object objectRef = "hello"; 
      String string = "goodbye";  
      char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean booleanValue = true;
      char characterValue = 'Z';
      int integerValue = 7;
      long longValue = 10000000000L;
      float floatValue = 2.5f; // f suffix indicates 2.5 is a float
      double doubleValue = 33.333;

      StringBuffer lastBuffer = new StringBuffer( "last buffer" );
      StringBuffer buffer = new StringBuffer();

      //Con append argomenti di tipo primitivo ma anche riferimenti
      //e array di char automaticamente convertiti a String 
      buffer.append( objectRef );
      buffer.append( "\n" ); // each of these contains new line
      buffer.append( string );
      buffer.append( "\n" );
      buffer.append( charArray );
      buffer.append( "\n" );
      buffer.append( charArray, 0, 3 );
      buffer.append( "\n" );
      buffer.append( booleanValue );
      buffer.append( "\n" );
      buffer.append( characterValue );
      buffer.append( "\n" );
      buffer.append( integerValue );
      buffer.append( "\n" );
      buffer.append( longValue );
      buffer.append( "\n" );
      buffer.append( floatValue );
      buffer.append( "\n" );
      buffer.append( doubleValue );
      buffer.append( "\n" );
      buffer.append( lastBuffer );

      System.out.printf( "buffer contains %s\n", buffer.toString() );
   } // end main
}
