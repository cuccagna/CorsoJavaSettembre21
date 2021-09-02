public class RilanciareEccezioni {
    
   public static void main( String args[] )
   {
      try 
      { 
         throwEccezione(); 
      } 
      catch ( Exception eccezione ) 
      {
         System.err.println( "Exception handled in main" );
      } 

      noThrowEccezione();
   } 

   
   public static void throwEccezione() throws Exception
   {
      try 
      { 
         System.out.println( "Metodo throwEccezione" );
         throw new Exception(); 
      } 
      catch ( Exception exception ) 
      {
         System.err.println(
            "Eccezione gestita nel metodo throwEccezione" );
         throw exception; 

         

      } 
      finally 
      {
         System.err.println( "Finally executed in throwEccezione" );
      } 

      

   } 

   
   public static void noThrowEccezione()
   {
      try 
      { 
         System.out.println( "Metodo noThrowEccezione" );
      } 
      catch ( Exception eccezione ) 
      {
         System.err.println( eccezione );
      } 
      finally 
      {
         System.err.println( 
            "Finally eseguito in noThrowEccezione" );
      } 

      System.out.println( "Fine del metodo noThrowEccezione" );
   } 

}
