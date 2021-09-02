
public class OperatoriLogici 
{
   public static void main( String args[] )
   {
      // crea tabella di verità operator && (AND logico)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional AND (&&)", "false && false", ( false && false ),
         "false && true", ( false && true ), 
         "true && false", ( true && false ),
         "true && true", ( true && true ) );

      // crea tabella di verità operator || (OR logico)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional OR (||)", "false || false", ( false || false ),
         "false || true", ( false || true ),
         "true || false", ( true || false ),
         "true || true", ( true || true ) );

      // crea tabella di verità operator & (AND logico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical AND (&)", "false & false", ( false & false ),
         "false & true", ( false & true ),
         "true & false", ( true & false ),
         "true & true", ( true & true ) );

      // crea tabella di verità operatore | (OR logico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical inclusive OR (|)",
         "false | false", ( false | false ),
         "false | true", ( false | true ),
         "true | false", ( true | false ),
         "true | true", ( true | true ) );

      // crea tabella di verità operator ^ (OR esclusivo logico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical exclusive OR (^)", 
         "false ^ false", ( false ^ false ),
         "false ^ true", ( false ^ true ),
         "true ^ false", ( true ^ false ),
         "true ^ true", ( true ^ true ) );

      // crea tabella di verità operatore ! (NOT logico)
      System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
         "!false", ( !false ), "!true", ( !true ) );
   } // end main
} // end class OperatoriLogici


