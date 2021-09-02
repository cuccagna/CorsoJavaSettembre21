public class RegistroClasseTest {
    public static void main(String[] args) {
        //Sintassi per creare un oggetto di ina classe qualunque è
        //nomeClasse nomeOggetto = new nomeClasse()
        //Nota che registro qui è un nome arbitrario, potevi chiamarlo
        //anche topolino
        RegistroClasse registro = new RegistroClasse();
        //La sintassi è nomeOggetto.nomeMetodoDellaClasse();
        //Dentro le parentesi possono andarci eventuali argomenti/parametri
        //che in questo caso non ci sono perchè come puoi vedere in
        //RegistroClasse.java visualizzaMessaggio() non prende parametri.
        registro.visualizzaMessaggio();
    }
}
