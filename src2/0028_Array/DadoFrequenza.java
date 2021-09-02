import java.util.Random;

public class DadoFrequenza {
    public static void main(String[] args) {
        final int NUMERO_LANCI = 6000;
        Random numeroCasuale = new Random();
        int frequenze[] = new int[6]; //inizializzato di default a zero
        int facciaEstratta;

        for(int lancio=0 ; lancio < NUMERO_LANCI ; lancio++){
            facciaEstratta = numeroCasuale.nextInt(6) + 1;
            ++frequenze[facciaEstratta-1];
        }

        System.out.printf("%s%10s\n","Facce","Frequenze");

        for(int faccia = 0 ; faccia < frequenze.length ; faccia++){
            System.out.printf("%5d%10s\n",faccia+1 ,frequenze[faccia]);
        }
    }
}
