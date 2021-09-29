import java.io.*;

public class ScriviFileALeggiAScriviB {
    public static void main(String[] args) {
        String fileInput = "Files/filebinario.bin";
        String fileOutput ="Files/filebinarioOut.bin";

        try{
            creaFileEScrivici(fileInput);
        }
        catch(IOException ioException){
            ioException.printStackTrace();
            System.exit(1);
        }
        

        try(
            InputStream inputStream = new FileInputStream(fileInput);
            OutputStream outputStream = new FileOutputStream(fileOutput);
        )
        {
            int byteLetto;
            while((byteLetto = inputStream.read()) != -1){
                outputStream.write(byteLetto);
            }
        }
        catch(IOException eccezione){
            eccezione.printStackTrace();
        }
    }

    public static void creaFileEScrivici(String fileInput) throws IOException{
        /* Se scrivi OutputStream streamOutput = new FileOutputStream(fileInput,true);
        cioè aggiungi il parametro true  quando scrivi quello che scrivi verrà
        appeso al precedente contenuto.
        Inoltre se il file nonn esiste viene creato */
        OutputStream streamOutput = new FileOutputStream(fileInput);
        streamOutput.write(66); 

        /* Esiste un'altra versione di write che prende un array di byte
        write(byte[]) */
        byte stringaConvertitaInArrayByte[] = "Ieri il Milan\nha perso la gara di Champions\nin casa".getBytes();
        streamOutput.write(stringaConvertitaInArrayByte);
        streamOutput.close();
    }
}
