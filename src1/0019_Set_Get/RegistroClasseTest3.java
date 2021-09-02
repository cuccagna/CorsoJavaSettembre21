import java.util.Scanner;

public class RegistroClasseTest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prego, inserisca il nome del corso:");
        String nomeCorso = input.nextLine();
        input.close();

        //Sintassi per creare un oggetto di una classe qualunque è
        //nomeClasse nomeOggetto = new nomeClasse()
        //Nota che registro qui è un nome arbitrario, potevi chiamarlo
        //anche topolino
        RegistroClasse3 registro = new RegistroClasse3();
        //registro.getCourseName() torna la variabile d'istanza che di default è null
        //quindi stampa null
        System.out.printf("\n\nIl nome iniziale del corso è %s\n\n",registro.getCourseName());
        //La sintassi è nomeOggetto.nomeMetodoDellaClasse();
        //Qui chiamo il metdo setCourseName che imposta la variabile d'istanza
        //della classe al valore appena inserito dall'utente
        registro.setCourseName(nomeCorso);
        registro.visualizzaMessaggio(nomeCorso);
    }
}
