
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

//Estendi JFrame per creare un contenitore
public class CampoDiTesto extends JFrame 
{
   private JTextField campoTesto1; // text field with set size
   private JTextField campoTesto2; // text field constructed with text
   private JTextField campoTesto3; // text field with text and size
   private JPasswordField campoPassword; // campo di testo per la password (rispetto a un normale campo di testo nasconde con dei pallini quello che inserisci)

   
   public CampoDiTesto()
   {
      super( "Testing JTextField and JPasswordField" );//chiama il costruttore della superclasse
      setLayout( new FlowLayout() ); // chiama il metodo setLayout ereditato da Container cui passi un oggetto di una classe che implementa l'interfaccia  LayoutManager in questo caso FlowLayout
       //Un layout manager serve a disporre i vari componenti (campi di testo, bottoni, elenchi
       //e quant altro nel contenitore). Il layout manager usato qui, FlowLayout dispone i componenti
       //da sinistra a destra, se non c'è più spazio va a capo. E se fai un ridimensionamento
       //o ingrandimento gestisce anche la ridisposizione

      // campo di testo con dimensione impostata( 10 columns)
      campoTesto1 = new JTextField( 10 ); 
      add( campoTesto1 ); // aggiungi campoTesto1 al contenitore JFrame

      // costruisci campo di testo con testo di default
      campoTesto2 = new JTextField( "Inserisci testo qui" );
      add( campoTesto2 ); // aggiungi campoTesto2 al contenitore JFrame

      // costruisci campo di testo con testo di default e una dimensione impostata
      campoTesto3 = new JTextField( "Campo di testo non modificabile", 21 );
      campoTesto3.setEditable( false ); // disabilita la modifica con questo metodo
      add( campoTesto3 ); // aggiungi campoTesto3 al contenitore JFrame

      // costruisci campo di testo per password con testo di default (che sarà nascosto)
      campoPassword = new JPasswordField( "Testo nascosto" );
      add( campoPassword ); // aggiungi password al contenitore JFrame

      // registra il gestore degli eventi.
      //Qui ho un unico gestore, cioè un unico oggetto
      //per tutti i campi di testo. Potresti anche creare più oggetti
      //della classe CampoTestoGestore ognuno dei qualì potrebbe fungere
      //da gestore separato per ciascun componente (cioè campi di testo in questo codice)
      CampoTestoGestore gestore = new CampoTestoGestore();
      campoTesto1.addActionListener( gestore );
      campoTesto2.addActionListener( gestore );
      campoTesto3.addActionListener( gestore );
      campoPassword.addActionListener( gestore );
   } 

   // private inner class for event handling
   private class CampoTestoGestore implements ActionListener 
   {
      // processa gli eventi dei campi di testo
      public void actionPerformed( ActionEvent event )
      {
         String string = ""; // dichiara la stringa da visualizzare

         // l'utente ha premuto Invio nel  campoTesto1 
         if ( event.getSource() == campoTesto1 )
            string = String.format( "campoTesto1: %s",
               event.getActionCommand() );

         // l'utente ha premuto Invio nel  campoTesto2
         else if ( event.getSource() == campoTesto2 )
            string = String.format( "campoTesto2: %s",
               event.getActionCommand() );

         // l'utente ha premuto Invio nel  campoTesto3 
         else if ( event.getSource() == campoTesto3 )
            string = String.format( "campoTesto3: %s", 
               event.getActionCommand() );

         // l'utente ha premuto Invio nel  campo di testo per la password
         else if ( event.getSource() == campoPassword )
            string = String.format( "campoPassword: %s", 
               new String( campoPassword.getPassword() ) );

         // visualizza il contenuto testuale del componente JTextField o JPasswordField
         JOptionPane.showMessageDialog( null, string ); 
      } 
   } // fine private inner class CampoTestoGestore
} 


