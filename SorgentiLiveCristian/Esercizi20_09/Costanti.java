public class Costanti {
    public static void main(String[] args) {
        final int COSTANTE_INTERA = 1;
    }
}

//Classe con una variabile d'istanza costante
//Può essere anche inizializzata nel costruttore
//ma se poi non la inizializzi nel costruttore errore
//Se inizializzi invece subito una variabile d'istanza
//deve dichiarla anche static oltre che final
class VariabileIstanzaCostante{
    final double saldo;

    public VariabileIstanzaCostante(){
        saldo = 305;
    }
}


enum Stato {CONTINUA,VITTORIA,SCONFITTA};
/* final String CONTINUA = "CONTINUA";
final String VITTORIA = "VITTORIA";
final String SCONFITTA = "SCONFITTA"; */

Stato statoGioco = Stato.CONTINUA;
