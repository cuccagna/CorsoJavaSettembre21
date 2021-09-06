import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
  Legge un carattere alla volta usando UTF-16 quindi interpreta ogni carattere
  come composto da due byte perchè UTF-16 un carattere è minimo 2 byte
  Rispetto a prima la lettura dello stesso file ma con codifica diversa
  produce un risultato diverso
 *
 */
public class FileTestuale2 {
 
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("Files\\MioFileTesto.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}