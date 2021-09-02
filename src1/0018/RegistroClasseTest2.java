import java.util.Scanner;

public class RegistroClasseTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prego, inserisca il nome del corso:");
        String nomeCorso = input.nextLine();
        input.close();

        //Sintassi per creare un oggetto di una classe qualunque è
        //nomeClasse nomeOggetto = new nomeClasse()
        //Nota che registro qui è un nome arbitrario, potevi chiamarlo
        //anche topolino
        RegistroClasse2 registro = new RegistroClasse2();
        //La sintassi è nomeOggetto.nomeMetodoDellaClasse();
        registro.visualizzaMessaggio(nomeCorso);
    }
}
