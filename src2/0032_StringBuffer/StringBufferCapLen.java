public class StringBufferCapLen 
{
   public static void main( String args[] )
   {
      StringBuffer buffer = new StringBuffer( "Hello, how are you?" );

      System.out.printf( "buffer = %s\nlength = %d\ncapacity = %d\n\n",
         buffer.toString(), buffer.length(), buffer.capacity() );

      buffer.ensureCapacity( 75 );
      System.out.printf( "New capacity = %d\n\n", buffer.capacity() );

      buffer.setLength( 10 );
      System.out.printf( "New length = %d\nbuffer = %s\n", 
         buffer.length(), buffer.toString() );
   } // end main
}
