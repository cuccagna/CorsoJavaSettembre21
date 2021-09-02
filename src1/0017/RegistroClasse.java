public class RegistroClasse {

    //Metodo della classe che visualizza un messaggio di benvenuto
    //non ritorna niente al chiamante perciò è void.
    //public è il modificatore d'accesso che significa che questo metodo
    //visualizzaMessaggio() può essere acceduto anche fuori dalla classe
    //(previa creazione di un oggetto di quella classe).  Se mettessi private
    //al posto di public vuol dire che quel metodo può essere acceduto
    //solo da dentro la classe.
    public void visualizzaMessaggio()
    {
        System.out.println("Benvenuto all'applicazione Registro do Classe");
    }
}
