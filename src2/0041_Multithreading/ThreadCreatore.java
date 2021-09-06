import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadCreatore
{
   public static void main( String[] args )
   {
    //Esiste automaticamente un thread, che possiamo chiamare main thread, che si
    //occupa dell'esecuzione di questo codice. Quindi oltre ai threads che creiamo
    //noi esiste questo "main thread" che viene creato automaticamente.
     StampaTask task1 =  new StampaTask( "thread1" );
     StampaTask task2 =  new StampaTask( "thread2" );
     StampaTask task3 =  new StampaTask( "thread3" );

      System.out.println( "I threads iniziano" );

      //Questo prepara per la creazione dei threads che avverrà quando chiami execute
      ExecutorService threadEsecutore = Executors.newCachedThreadPool();
      
      //Questo crea un thread e lo associa all'oggetto di tipo Runnable (in realtà lo
      //associa a un oggetto della classe StampaTask che però implementa l'interfaccia
      //Runnable)  in modo che quando il thread passa nello stato "Running" il metodo
      // run() di questo oggetto passato ad execute() sarà automaticamente invocato ed
      //eseguito.  Nota che quindi la chiamata ad execute() ritorna subito cioè non
      //provoca l'immediata esecuzione di run().
      threadEsecutore.execute(task1);
      threadEsecutore.execute(task2);
      threadEsecutore.execute(task3);

      //Mette i thread nello stato terminated quando questi
      //avranno terminato di eseguire il loro metodo run()
      threadEsecutore.shutdown();
      System.out.println( "Threads iniziati, thread main termina.\n" );
   } 
} 
     

