import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest 
{
   
   public static void main( String args[] )
   {
      // get sentence
      Scanner scanner = new Scanner( System.in );
      System.out.println( "Enter a sentence and press Enter" );
      String sentence = scanner.nextLine();

      // process user sentence
      StringTokenizer tokens = new StringTokenizer( sentence );
      System.out.printf( "Number of elements: %d\nThe tokens are:\n",
         tokens.countTokens() );

      while ( tokens.hasMoreTokens() )
         System.out.println( tokens.nextToken() );
   } // end main
}
