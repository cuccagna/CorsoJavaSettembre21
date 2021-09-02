import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionePerZeroConGestioneEccezione {
   
/*     questa è un'eccezione non verificata per cui throws non sarebbe necessario
 */   public static int quoziente( int numerator, int denominator )
      throws ArithmeticException 
   {
      return numerator / denominator; 
   } 

   public static void main( String args[] )
   {
      Scanner scanner = new Scanner( System.in ); 
      boolean continuaLoop = true; 

      do
      {
         try 
         {
            System.out.print( "Perfavore inserire un numeratore intero: " );
            int numeratore = scanner.nextInt();
            System.out.print( "Perfavore inserire un denominatore intero: " );
            int denominatore = scanner.nextInt();

            int risultato = quoziente( numeratore, denominatore );
            System.out.printf( "\nRisultato: %d / %d = %d\n", numeratore,
               denominatore, risultato );
            continuaLoop = false; 
         } 
         catch ( InputMismatchException inputMismatchException )
         {
            System.err.printf( "\nEccezione: %s\n",
               inputMismatchException );
            scanner.nextLine(); 
            System.out.println(
               "Devi inserire interi. Perfavore prova di nuovo.\n" );
         } 
         catch ( ArithmeticException arithmeticException )
         {
            System.err.printf( "\nEccezione: %s\n", arithmeticException );
            System.out.println(
               "Zero è un denominatore non valido. Perfavore prova di nuovo.\n" );
         } 
      } while ( continuaLoop ); 
   } 

}
