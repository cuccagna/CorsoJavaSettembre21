import java.util.Scanner;

public class SwitchEsempio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n",
        "Inserisci i voti degli studenti tra 0-100",
        "Quando hai finito premi CTRL-Z-INVIO se sei su Windows o",
        "CTRL-D-INVIO se sei su un MAC o LINUX"
        );

        int voto;
        int numStudenti = 0;
        int totale=0;
        int aVoto,bVoto,cVoto,dVoto,fVoto;
        aVoto=bVoto=cVoto=dVoto=fVoto=0;

        while(input.hasNext()){
            voto = input.nextInt();
            ++numStudenti;
            totale += voto;
            /*
            Dentro le parentesi dello switch deve andarci un'espressione che restituisce
            un intero uno short o un byte o un char. O puoi metterci una costante dei
            tipi appena menzionati.
            Nelle etichette dei case devono andarci costanti, non puoi metterci variabili.
            (Al massimo puoi metterci una costante di tipo enum)
            Due o più etichette case corrispondono a degli or cioè viene eseguito il codice
            corrispondente se il valore dentro lo switch è uguale  auno qualsiasi dei case
            multipli.

            Nota che nei case non servono le parentesi cioè puoi mettere più istruzione
            anche senza parentesi.

            Se non metti il break tutti le istruzioni dei case a seguire di quello per cui
            c'è corrispondenza saranno eseguiti a prescindere da se c'è corrispondenza o
            meno per quei case (di solito non vuoi questo comportamento quindi non scordare i break)

            default è eseguito quando per nessuno dei case c'è corrispondenza. è buona norma
            metterlo sempre
            */
            switch(voto/10){
                case 10:
                case 9:
                    ++aVoto;
                    break;

                case 8:
                    ++bVoto;
                    break;

                case 7:
                    ++cVoto;
                    break;

                case 6:
                    ++dVoto;
                    break;

                default: //Questo significa tutti gli altri casi (QUindi voti tra 0-59)
                    ++fVoto;
                    break; //superfluo puoi non metterlo
            }
        }

        input.close();

        System.out.printf("\n\nIl numero totale di voti inseriti è %d\n",numStudenti);
        double mediaVotoClasse = 0.00;
        //Qui evito la divisione per zero
        if(numStudenti != 0)
            mediaVotoClasse = ((double) totale) / numStudenti;

        System.out.printf("\nLa media voto della classe è %.2f\n" , mediaVotoClasse);
    
        System.out.printf("\n\n%s\nA: %d\nB: %d\nC: %d\nD: %d\nF: %d\n\n",
        "Report degli studenti classificati in base ai voti ottenuti:",
        aVoto,
        bVoto,
        cVoto,
        dVoto,
        fVoto);
    }
}
