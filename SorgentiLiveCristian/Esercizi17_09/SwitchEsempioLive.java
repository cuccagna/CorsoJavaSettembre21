import java.util.Scanner;

public class SwitchEsempioLive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numStudenti = 0;
        int totale=0;
        int voto;
        int aVoto,bVoto,cVoto,dVoto,fVoto;
        aVoto=bVoto=cVoto=dVoto=fVoto=0;

        System.out.println("Inserisci i voti degli studenti tra 0-100\n"+
                           "Quando hai finito premi CTRL-Z-INVIO su Windows\n"+
                           "CTRL-D-INVIO se seu su un MAC o LINUX\n");

        while(input.hasNext()){
            voto = input.nextInt();
            ++numStudenti;
            totale = totale + voto;

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

                default:
                    ++fVoto;
                break;
            }
        }//fine while

        double mediaVotoClasse;
        if(numStudenti != 0)
            mediaVotoClasse = (double) totale / numStudenti;

        //Qui stampi la media della classe
        //Altra stampa in cui stampi a video le varie variabili aVoto,bVoto ecc.
    }
}
