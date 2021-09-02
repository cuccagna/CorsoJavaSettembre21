public class Impiegato2Test {
    public static void main( String args[] )
   {
      ImpiegatoSuCommissione2 impiegato1 = new ImpiegatoSuCommissione2( 
         "Bob", "Lewis", "333-33-3333", 5000, .04 );
      
      System.out.println();
      ImpiegatoSuCommissionePiuBase2 impiegato2 = 
         new ImpiegatoSuCommissionePiuBase2( 
         "Lisa", "Jones", "555-55-5555", 2000, .06, 800 );
      
      System.out.println();
      ImpiegatoSuCommissionePiuBase2 impiegato3 = 
         new ImpiegatoSuCommissionePiuBase2( 
         "Mark", "Sands", "888-88-8888", 8000, .15, 2000 );

         System.out.printf("Gli impiegati creati sono:\n\n%s\n\n%s\n\n%s\n\n",
         impiegato1,
         impiegato2,
         impiegato3);
   }

   
}
