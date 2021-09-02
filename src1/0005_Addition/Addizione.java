//package dove c'è la classe Scanner
import java.util.Scanner; 

public class Addizione 
{
   
   public static void main( String args[] )
   {
      /*Scanner è una classe creata da altri programmatori già disponibile
      ed utilizzabile. Non ci interessa conoscere il codice di questa classe
      ma i metodi e gli attributi a disposizione e sapere come funzionano
      Qui stiamo istanziando (cioè creando) un oggetto della classe Scanner
      e per funzionare vuole il parametro System.in (per fargli capire che vogliamo)
      leggere dallo standard input.

      input è un nome che scegliamo noi, può essere qualunque nome di identificatore.
      valido è il nome dell'oggetto.
      */
       Scanner input = new Scanner( System.in );

      int number1; 
      int number2; 
      int sum; 

      System.out.print( "Enter first integer: " ); 
      number1 = input.nextInt(); 

      System.out.print( "Enter second integer: " ); 
      number2 = input.nextInt(); 

      sum = number1 + number2; 

      System.out.printf( "Sum is %d\n", sum ); 
      input.close();

   } 

} 


