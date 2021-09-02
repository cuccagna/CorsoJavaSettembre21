public class Data 
{
   private int mese; // 1-12
   private int giorno;   // da 1 a 31 in base al mese
   private int anno;  // qualsiasi anno

   // costruttore: chiama controllaMese() per conferma un valore valido per il mese 
   // chiama controllaGiorno() per controllare un valore corretto per il giorno
   public Data( int ilMese, int ilGiorno, int lAnno )
   {
      mese = controllaMese( ilMese ); // valida mese
      anno = lAnno; // potresti validare anche l'anno
      giorno = controllaGiorno( ilGiorno ); // valida giorno

      System.out.printf( 
         "Oggetto data nel costruttore di Data %s\n", this );
   } 

   // metodo per controllare la validità del mese
   //Nota che il metodo è privato è inaccessibile all'esterno
   private int controllaMese( int ilMese )
   {
      if ( ilMese > 0 && ilMese <= 12 ) // valida mese
         return ilMese;
      else // mese non è valido
      { 
         System.out.printf( 
            "Mese (%d) non valido, lo imposto a  1.", ilMese );
         return 1; // mantiene l'oggetto in unostato consistente
      } // fine else
   } // fine metodo controllaMese()

   // metodo per controllare la validità del giorno in base al mese e all'anno
   private int controllaGiorno( int ilGiorno )
   {
      int giorniPerMese[] = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   
      // controlla se il giorno è valido per il mese in questione
      if ( ilGiorno > 0 && ilGiorno <= giorniPerMese[ mese ] )
         return ilGiorno;
   
      // cntrolla per un anno bisestile
      if ( mese == 2 && ilGiorno == 29 && ( anno % 400 == 0 || 
           ( anno % 4 == 0 && anno % 100 != 0 ) ) )
         return ilGiorno;
   
      System.out.printf( "Giorno (%d) non valido, impostato a 1.", ilGiorno );
      return 1;  // mantieni l'oggetto in uno stato consistente
   } 
   
   // ritorna una stringa nel formato mese/giorno/anno
   public String toString()
   { 
      return String.format( "%d/%d/%d", mese, giorno, anno ); 
   } // fine metodo toString
}
