import java.io.FileWriter;
import java.io.IOException;

public class FileTestuale4 {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Files\\Scrittura.txt", true);
            writer.write("Ciao mondo");
            writer.write("\r\n");   // vai a capo
            writer.write("Arrivederci!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}
