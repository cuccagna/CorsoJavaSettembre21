import javax.swing.JFrame;

public class CampoDiTestoTest
{
   public static void main( String args[] )
   { 
      CampoDiTesto CampoDiTestoFinestra = new CampoDiTesto(); 
      CampoDiTestoFinestra.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      CampoDiTestoFinestra.setSize( 350, 100 ); // imposta la dimensione del frame
      CampoDiTestoFinestra.setVisible( true ); // visualizza il frame
   } 
}
