public class ImpiegatoTest {
    public static void main( String args[] )
   {
      Data dataCompleanno = new Data( 7, 24, 1949 );
      Data dataAssunzione = new Data( 3, 12, 1988 );
      Impiegato impiegato = new Impiegato( "Marco", "Rossi", dataCompleanno, dataAssunzione );

      System.out.println( impiegato ); 
   }
}
