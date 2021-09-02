public class InizializzatoreArray {
    public static void main(String[] args) {
        int primoArray[] = {32 , 26 , 11 , -3 , 31 , 45,78};
        System.out.printf("%6s%8s\n","Indice","Valore");

        for(int contatore = 0 ; contatore < primoArray.length ; contatore++)
        {
            System.out.printf("%6d%8d\n", contatore , primoArray[contatore]);
        }
    }
}
