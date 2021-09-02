public class RegistroClasse2 {

    //Metodo della classe che visualizza un messaggio di benvenuto
    //non ritorna niente al chiamante perciò è void.
    //public è il modificatore d'accesso che significa che questo metodo
    //visualizzaMessaggio() può essere acceduto anche fuori dalla classe
    //(previa creazione di un oggetto di quella classe).  Se mettessi private
    //al posto di public vuol dire che quel metodo può essere acceduto
    //solo da dentro la classe.
    //Il metodo prende un parametro , devi scrivere il tipo e poi il nome
    //in questo caso il tipo è String un tipo riferimento presistente in Java
    //(è una classe/tipo creata da altri programmatori ed a tua disposizione).
    //Il nome non deve corrispondere a quello del chiamante
    public void visualizzaMessaggio(String nomeCorso)
    {
        System.out.printf("\nBenvenuto all'applicazione Registro di Classe per\n %s\n ",
                            nomeCorso);
    }
}
