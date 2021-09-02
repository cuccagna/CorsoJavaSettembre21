public class PassArray {
    public static void main( String args[] )
    {
       int array[] = { 1, 2, 3, 4, 5 };
       
       System.out.println( 
          "Effetti di passare l'intero array:\n" +
          "I valori originali dell'array sono:" );
 
       
       for ( int valore : array )
          System.out.printf( "   %d", valore );
    
       modificaArray( array ); 
       System.out.println( "\n\nI valori dell'array dopo la modifica nella funzione sono:" );
 
       
       for ( int value : array )
          System.out.printf( "   %d", value );
    
       System.out.printf( 
          "\n\nEffetti di passare un singolo elemento dell'array (nel caso il tipo sia primitivo):\n" +
          "array[3] prima di  modificaElemento: %d\n", array[ 3 ] );
    
       modificaElemento( array[ 3 ] ); 
       System.out.printf( 
          "array[3] dopo modificaElemento: %d\n", array[ 3 ] );
    } 
    
    
    public static void modificaArray( int array2[] )
    {
       for ( int contatore = 0; contatore < array2.length; contatore++ )
          array2[ contatore ] *= 2;
    } 
    
    
    public static void modificaElemento( int elemento )
    {
       elemento *= 2;
       System.out.printf( 
          "Valore dell'elemento in modificaElemento: %d\n", elemento );
    } 
}
