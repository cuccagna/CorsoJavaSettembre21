public class InitArray {
    public static void main(String[] args) {
        int primoArray[];//dichiara variabile atta a contenere un array di interi

        primoArray = new int[10]; //crea effettivamente l'array

        System.out.printf("%s%8s\n","Indice","Valore");

        for(int contatore = 0 ; contatore < primoArray.length ; contatore++)
        {
            System.out.printf("%6d%8d\n", contatore , primoArray[contatore]);
        }
    }
}
