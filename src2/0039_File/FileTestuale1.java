import java.io.FileReader;
import java.io.IOException;
 
/*Legge 1 carattere alla volta dal file (già esistente nella cartella Files)
   MioFileTesto.txt e lo stampa a video
   */
public class FileTestuale1 {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Files\\MioFileTesto.txt");
            int carattere;
 
            while ((carattere = reader.read()) != -1) {
                System.out.print((char) carattere);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
