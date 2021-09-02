import java.util.Scanner;
public class DivisionePerZeroNoGestioneEccezione {
    


   // dimostrazione del lancio di un'eccezione quando una divisione intera
   //per zero accade
   public static int quoziente( int numeratore, int denominatore )
   {
      return numeratore / denominatore; // possibile divisione per zero
   } 

   public static void main( String args[] )
   {
      Scanner scanner = new Scanner( System.in ); 

      System.out.print( "Perfavore inserire un numeratore intero: " );
      int numeratore = scanner.nextInt();
      System.out.print( "Perfavore inserire un denominatore intero: " );
      int denominatore = scanner.nextInt();

      int risultato = quoziente( numeratore, denominatore );
      System.out.printf( 
         "\nRisultato: %d / %d = %d\n", numeratore, denominatore, risultato );
   } 

}
