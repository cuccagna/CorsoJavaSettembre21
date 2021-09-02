// Craps.java
// classe Craps  simula il gioco di dadi craps.

//classe Random per estrarre numeri casuali
import java.util.Random;

public class Craps 
{
   // crea il generatore di numeri casuali da usare nel metodo tiraDadi()
   private Random numeriCasuali = new Random(); 

   // enumeration con costanti che rappresenta lo stato del gioco
   //è una classe infatti quando compili trovi 3 file .class e non 2
   //un enum è static di default e quindi condiviso tra tutti gli oggetti
   //di questa classe.
   //Nota che non puoi creare un oggetto enum con new Status(...) anche
   //se Status è una classe.
   //Una classe enum può essere molto più complicata di così con
   //variabili d'istanza (che devono essere final),un costruttore e set e get e anche altri metodo.
   //Poi fai Status stato = Status.CONTINUE;
   //e poi potrai fare stato.getCampo();
   private enum Status { CONTINUA, VITTORIA, SCONFITTA };

   // costanti possono essere definite anche come final static per le variabili
   // d'istanza. Queste le uso per identificare particolari somme dei dati
   private final static int OCCHI_SERPENTE = 2; //Espressione per indicare 2 a i dadi
   private final static int TRE = 3;
   private final static int SETTE = 7;
   private final static int UNDICI = 11;
   private final static int BOX_CARS = 12; //Gergo per dire due 6

   // gioca una partita di craps
   public void play()
   {
      int mioPunteggio = 0; // punteggio se nè vinci nè perdi al primo giro
      //Essendo enum quindi Status una classe è un nuovo tipo che posso usare
      //per dichiarare una costante di quel tipo enum 
      Status statoGioco; // può contenere CONTINUA, VITTORIA, SCONFITTA

      int sommaDadi = tiraDadi(); // primo tiro dei dadi

      // determina lo stato del gioco e il punteggio basato sul primo tiro 
      switch ( sommaDadi ) 
      {
         case SETTE: // vinci con 7 al primo tiro
         case UNDICI: // vinci con 11 al primo tiro         
            statoGioco = Status.VITTORIA;
            break;
         case OCCHI_SERPENTE: // perdi con 2 al primo tiro
         case TRE: // perdi con 3 al primo tiro
         case BOX_CARS: // perdi con 12 al primo tiro
            statoGioco = Status.SCONFITTA;
            break;
         default: // non hai nè vinto nè perso così ricorda il punteggio     
            statoGioco = Status.CONTINUA; // il gioco non è finito
            mioPunteggio = sommaDadi; // memorizza il punteggio fatto al primo tiro
            System.out.printf( "Il punteggio è %d\n", mioPunteggio );
            break; 
      } // fine switch 

      // finchè il gioco non è finito
      while ( statoGioco == Status.CONTINUA ) // nè vinci nè perdi
      { 
         sommaDadi = tiraDadi(); // tira di nuovo i dadi

         // determina il nuovo stato del gioco
         if ( sommaDadi == mioPunteggio ) // vinci facendo il punteggio fatto al primo tiro
            statoGioco = Status.VITTORIA;
         else
            if ( sommaDadi == SETTE ) // perdi facendo 7
               statoGioco = Status.SCONFITTA;
      } // fine while 

      // visualizza messaggio di vittoria o sconfitta
      if ( statoGioco == Status.VITTORIA )
         System.out.println( "Il giocatore ha vinto" );
      else
         System.out.println( "Il giocatore ha perso" );
   } // fine metodo play()

   // tira i dadi, calcola la somma e visualizza il risultato
   public int tiraDadi()
   {
      // pick random die values
      int dado1 = 1 + numeriCasuali.nextInt( 6 ); // tiro del primo dado
      int dado2 = 1 + numeriCasuali.nextInt( 6 ); // tiro del secondo dado

      int somma = dado1 + dado2; // somma dei due dadi tirati

      // display results of this roll
      System.out.printf( "Il giocatore ha totalizzato %d + %d = %d\n", 
      dado1, dado2, somma );

      return somma; 
   } // fine metodo tiraDadi
} // fine classe Craps
