public class StringheEsempi {
    public static void main(String[] args) {
        //Le stringhe in Java sono immutabili anche se questo esempio
        //potrebbe fare pensare il contrario
        String x = "corso Java";
        //L'operatore + quando uno degli operandi è una String
        //fa la concatenazione.
        //Altro esempio concatenazione Stringa con due numeri.
        //base32  
        int risultato = "base" + 3 + 2;
        
        x = x + " base";

        System.out.printf("newX = %s",x);

        //"ciao" è una stringa anonima costante che quando hanno lo stesso
        //contenuto come "ciao" in questo caso non vengono duplicati.
        //Quindi s1 ed s2 fanno riferimento alla stessa stringa
        String s1 = "ciao";
        String s2 = "ciao";

        //Invece
        String s3 = new String("ciao");
        String s4 = new String("ciao");

    }
}
