public class AnimaliTest {
    public static void main(String[] args) {

        Animali an1 = new Animali();
        System.out.printf("\nIl numero di animali corrente è %d\n",Animali.getNumAnimali());
        Animali an2 = new Animali();
        //La chiamata del metodo static può avvenire sia tramite la sintassi NomeClasse.nomeMetodo() che con quella classica nomeOggetto.nomeMetodo()
        //Notare che numAnimali con la seconda stampa è 2, se non fosse stato static
        //invece avrebbe stampato 1 perchè le due variabili d'istanza sarebbe state
        //due copie diverse, invece una variabile d'istanza static è sempre la stessa
        //e se la prima volta l'ho incrementata ed ha valore 1, la seconda volta
        //che chiamo il costruttore troverò questa variabile static a 1 , poi la
        //incremento un'altra volta da cui il valore finale 2
        System.out.printf("\nIl numero di animali corrente è %d\n",an2.getNumAnimali());


        Animali.saluta();
        //Animali.incrementaAnimali();
    }
}
