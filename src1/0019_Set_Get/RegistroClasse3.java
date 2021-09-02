public class RegistroClasse3 {

    /*Variabile d'istanza, essendo private non è accessibile
      da fuori la classe. Dentro i metodi della classe è accessibile
      cioè posso scrivere direttamente courseName anche se è buona norma
      accederla in lettura sempre con getCourseName() cioè usa i metodi
      get per accedere alla variabile d'istanza anche dentro la classe*/
    private String courseName;

    /*get ritorna la variabile d'istanza. Convenzione nome getNomeVariabileIstanza
      tipo di ritorno coerente con il tipo della variabile d'istanza*/
    public String getCourseName()
    {
        return courseName;
    }

    /*Set analogo a a get ma serve per inizializzare la variabile d'istanza*/
    public void setCourseName(String name)
    {
        courseName = name;
    }

    public void visualizzaMessaggio(String nomeCorso)
    {
        
        System.out.printf("\nBenvenuto all'applicazione Registro di Classe per\n %s\n ",
                            getCourseName());
    }
}
