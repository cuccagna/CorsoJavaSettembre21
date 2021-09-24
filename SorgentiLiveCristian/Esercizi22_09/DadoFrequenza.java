import java.util.Random;

public class DadoFrequenza {
    public static void main(String[] args) {
        final int NUMERO_LANCI = 5000;
        Random numeroCasuale = new Random();
        int frequenze[] = new int[6];
        int facciaEstratta;

        for(int lancio=0 ; lancio < NUMERO_LANCI ; lancio++)
        {
            facciaEstratta = numeroCasuale.nextInt(6) + 1;
            ++frequenze[facciaEstratta-1];
            //frequenze[facciaEstratta-1] = frequenze[facciaEstratta-1] + 1;
        }

        System.out.printf("%s%10s","Facce","Frequenze");
        for(int faccia = 0 ; faccia<frequenze.length ;faccia++)
            System.out.printf("%5d%10d",faccia+1,frequenze[faccia]);
    }
}
