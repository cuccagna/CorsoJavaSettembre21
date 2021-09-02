
public class Account
{   
   //Variabile d'istanza
   private double balance; 

   
   public Account( double initialBalance )
   {
      //Inizializza il bilancio solo se il valore passato è positivo
      if ( initialBalance > 0.0 ) 
         balance = initialBalance; 
   } 

   //Aggiungi soldi al bilancio attuale
   public void credit( double amount )
   {      
      balance = balance + amount; 
   } 

   
   public double getBalance()
   {
      return balance; 
   } 

} 

