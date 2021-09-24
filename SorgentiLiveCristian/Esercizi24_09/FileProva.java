public class FileProva {
    public static void main(String[] args) {
        int a[] = new int[20];
        Cane array[] = new Cane[20];
        for(int indice=0 ; indice<array.length ; indice++)
            array[indice] = new Cane("rosso","Zlatan");

        String myString = new String("Ciao");
        String myString2 = new String("Ciao");

        if(myString == myString2)
          //torna false
        
          if(myString.equals(myString2))
          //torna true


        myString = "Ciao";
    }
}
