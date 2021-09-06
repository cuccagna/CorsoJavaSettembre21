import javax.swing.JOptionPane;

public class AddizioneGrafica {
    public static void main( String args[] )
   {
      // obtain user input from JOptionPane input dialogs
      String primoNumero = 
         JOptionPane.showInputDialog( "Inserisci il primo numero" );
      String secondoNumero =
          JOptionPane.showInputDialog( "Inserisci il secondo numero" );

      // convert String inputs to int values for use in a calculation
      int numero1 = Integer.parseInt( primoNumero ); 
      int numero2 = Integer.parseInt( secondoNumero );

      int somma = numero1 + numero2; // add numbers

      // display result in a JOptionPane message dialog
      JOptionPane.showMessageDialog( null, "La somma è " + somma, 
         "Somma dei due Interi", JOptionPane.PLAIN_MESSAGE );
   } // end method main

}
