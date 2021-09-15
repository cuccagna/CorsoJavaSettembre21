public class Esercit2N4{
    public static void main(String[] args) {
        int righe=5;
        System.out.printf("%-5s%-8s%-9s%-10s\n","N","10*N","100*N","1000*N");
        int contatore=1;

        while(contatore<=righe){
            System.out.printf("%-5d%-8d%-9d%-10d\n",contatore,contatore*10,contatore*100,contatore*1000);
            contatore++;
        }
    }
}