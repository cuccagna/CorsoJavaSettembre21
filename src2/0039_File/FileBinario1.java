import java.io.*;

/* Copia da un file all'altro un byte alla volta */
public class FileBinario1 {

    public static void main(String[] args) {
        
        //Per eseguire questo codice devi creare una cartella Files nella root
        //nel mio caso la root è EserciziCorso
        String inputFile = "Files/filebinario.bin";
        String outputFile = "Files/filebinarioOut.bin";
 
        try{
            creaFileEScrivici(inputFile);
        }
        catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }


        //Questo è un nuovo tipo di try catch detto try with resources
        try (
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
 
            int byteRead;
 
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void creaFileEScrivici(String inputFile) throws IOException{
        OutputStream outputStream = new FileOutputStream(inputFile);
        outputStream.write(65);
        byte myBinaryContent[]="Contenuto del file\nbinario.\nCiao".getBytes();
        outputStream.write(myBinaryContent);
        outputStream.close();
    }

}
