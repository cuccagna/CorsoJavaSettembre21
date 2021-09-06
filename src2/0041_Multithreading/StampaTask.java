import java.util.Random;

public class StampaTask implements Runnable 
{
   private int tempoSleep; 
   private String nomeTask; 
   private final static Random generatore = new Random();
    
   public StampaTask( String name )
   {
      nomeTask = name; 
        
      
      tempoSleep = generatore.nextInt( 3000 ); 
   } 

   //Metodo automaticamente chiamato quando il Sistema Operativo manda nello
   //stato di "running" il thread associato all'oggetto corrispondente
   public void run()
   {
      try 
      {
         System.out.printf( "%s va in sleep per %d millisecondi.\n", 
            nomeTask, tempoSleep );
         //La seguente istruzione manda il thread nello stato "timed waiting"
         Thread.sleep( tempoSleep ); 
      } 
      catch ( InterruptedException exception )
      {
         System.out.printf( "%s %s\n", nomeTask,
            "terminato prematuramente dovuto a un' interrupt" );
      } 
        
      
      System.out.printf( "%s Sleeping terminato\n", nomeTask ); 
   } 
} 


