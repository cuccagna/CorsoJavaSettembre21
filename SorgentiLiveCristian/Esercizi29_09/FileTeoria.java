import java.io.BufferedWriter;
import java.io.FileReader;

public class FileTeoria {
    public static void main(String[] args) {
        //Per leggere da file testuali puoi usare
    /*     Reader,InputStreamReader,FileReader,BufferReader
        Per scriverci puoi usare
        Writer,FileWriter,OutputStreamWriter,BufferedWriter

        Di Reader i metodi più importanti sono:
        read() legge un singolo carattere e torna -1 all'EOF
        read(char [])  legger un array di caratteri (in base alla dimensione dell'array)
        skip(long)  salta la lettura di un numero di caratteri indicato come parametro
        close()

        Di Writer i metodi più importanti sono:
        write(int)  scrive un singolo carattere
        write(char  []) scrive il contenuto dell'array di char nel file
        write(String) scrive la stringa nel file
        close */

        /* Esistono anche le classi Scanner per leggere
        e PrintWriter per scrivere che forse sono le più
        semplici per gestire file */
        //Ricorda di usare un try catch
        /* FileReader reader = new FileReader("Cartella/Sootocartella/nomeFile.txt");
        Scanner in = new Scanner(reader);

        String linea;
        while(in.hasNextLine())
        {
            linea =  in.nextLine();
        }

        in.close(); */
    }
}
