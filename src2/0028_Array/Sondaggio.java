public class Sondaggio {
    public static void main(String[] args) {
        int risposte[] = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 
            10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 
            4, 8, 6, 8, 10 };
         int frequenze[] = new int[ 11 ]; 
   
         
         
         for ( int numDomanda = 0; numDomanda < risposte.length; numDomanda++ )
            ++frequenze[ risposte[ numDomanda ] ];
   
         System.out.printf( "%s%10s\n", "Risposta", "Frequenze" );
      
         
         for ( int risposta = 1; risposta < frequenze.length; risposta++ )
            System.out.printf( "%8d%10d\n", risposta, frequenze[ risposta ] );
    }
}
