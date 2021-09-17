import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Esercitazione2N1 {
    public static void main(String[] args) {
        double lato1;
        double lato2;
        double lato3;
        double latoMassimo;
        double sommaAltriDueLati;
        Scanner inserisci = new Scanner(System.in);

        System.out.println("Prego, inserire il primo lato:");
        lato1 = inserisci.nextDouble();

        System.out.println("Prego, inserire il secondo lato:");
        lato2 = inserisci.nextDouble();

        System.out.println("Prego, inserire il terzo lato:");
        lato3 = inserisci.nextDouble();

        inserisci.close();

        latoMassimo = lato1;
        sommaAltriDueLati = lato2 + lato3;

        if(lato2 > latoMassimo){
            latoMassimo = lato2;
            sommaAltriDueLati = lato1 + lato3;
        }

        if(lato3 > latoMassimo){
            latoMassimo = lato3;
            sommaAltriDueLati = lato1 + lato2;
        }

        
        String isTriangolo = "non ";
        if(latoMassimo < sommaAltriDueLati)
            isTriangolo = "";

            /* if(latoMassimo < sommaAltriDueLati)
                stampa è un triandolo
            else
                stampa non è un triangolo */

            System.out.printf("La tripletta di valori\nlato1 = %.2f\n"+
                              "lato2 = %.2f\nlato3 = %.2f\n%spuo' essere un triangolo"
                              ,lato1,lato2,lato3,isTriangolo);

    }
}
