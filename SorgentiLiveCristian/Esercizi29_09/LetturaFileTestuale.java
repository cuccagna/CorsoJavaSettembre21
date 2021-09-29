import java.io.FileReader;
import java.io.IOException;

public class LetturaFileTestuale {
    public static void main(String[] args) {
        try(
            FileReader reader = new FileReader("Files\\MioFileTesto.txt");
            ){
            int carattere;

            while((carattere = reader.read()) != -1){
                System.out.print((char) carattere);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
