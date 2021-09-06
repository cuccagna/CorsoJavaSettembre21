import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
/*Maniera più efficiente per
  leggere da file*/

public class FileTestuale3 {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Files/MioFileTesto.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}