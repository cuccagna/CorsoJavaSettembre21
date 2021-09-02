

import java.util.Scanner;

public class AccountTest
{
   
   public static void main( String args[] ) 
   {
      // Creazione di due oggetti (di due conti correnti in pratica)
      Account account1 = new Account( 50.00 ); 
      Account account2 = new Account( -7.53 );  //Attenzione inizializzazione a un valore negativo che per via dell'if nel costrutorre della classe lascia la variabile d'istanza per questo oggetto non inizializzata

      
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() ); //Questo stampa 0, il valore di default per una variabile d'istanza double. Non è stato inizializzato a -7.53 per via dell'if nel costruttore
      
      
      Scanner input = new Scanner( System.in );
      double depositAmount; 

      //Inserisci la cifra che vuoi versare
      System.out.print( "Enter deposit amount for account1: " ); 
      depositAmount = input.nextDouble(); 
      System.out.printf( "\nadding %.2f to account1 balance\n\n", 
         depositAmount );
      account1.credit( depositAmount );  //aggiunge la cifra alla variabile d'istanza solo per l'oggetto account1 come puoi vedere dalla stampa successiva

      input.close();
      
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );

      System.out.print( "Enter deposit amount for account2: " ); 
      depositAmount = input.nextDouble(); 
      System.out.printf( "\nadding %.2f to account2 balance\n\n", 
         depositAmount );
      account2.credit( depositAmount ); 

      
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
         account2.getBalance() );
   } 

} 


