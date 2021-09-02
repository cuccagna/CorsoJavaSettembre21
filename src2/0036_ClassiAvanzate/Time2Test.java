public class Time2Test 
{
   public static void main( String args[] )
   {
      Time2 t1 = new Time2();             // 00:00:00
      Time2 t2 = new Time2( 2 );          // 02:00:00
      Time2 t3 = new Time2( 21, 34 );     // 21:34:00
      Time2 t4 = new Time2( 12, 25, 42 ); // 12:25:42
      Time2 t5 = new Time2( 27, 74, 99 ); // 00:00:00
      Time2 t6 = new Time2( t4 );         // 12:25:42

      System.out.println( "Costruito con:" );
      System.out.println( "t1: tutti gli argomenti di default" );
      System.out.printf( "   %s\n", t1.toUniversalString() );
      System.out.printf( "   %s\n", t1.toString() );

      System.out.println( 
         "t2: hour specificato; minute e second di default" );
      System.out.printf( "   %s\n", t2.toUniversalString() );
      System.out.printf( "   %s\n", t2.toString() );

      System.out.println( 
         "t3: hour and minute specificati; second di default" );
      System.out.printf( "   %s\n", t3.toUniversalString() );
      System.out.printf( "   %s\n", t3.toString() );

      System.out.println( "t4: hour, minute e second specificati" );
      System.out.printf( "   %s\n", t4.toUniversalString() );
      System.out.printf( "   %s\n", t4.toString() );

      System.out.println( "t5: valori tutti non validi passati//specificati" );
      System.out.printf( "   %s\n", t5.toUniversalString() );
      System.out.printf( "   %s\n", t5.toString() );

      System.out.println( "t6: oggetto Time2 t4 specificato" );
      System.out.printf( "   %s\n", t6.toUniversalString() );
      System.out.printf( "   %s\n", t6.toString() );
   }
}
