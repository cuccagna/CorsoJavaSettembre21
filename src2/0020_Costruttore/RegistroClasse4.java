public class RegistroClasse4 {
    private String courseName;

    //Costruttore della classe
    //chiamato quando fai RegistroClasse4 nomeOggetto = RegistroClasse4("nomeCorso");
    public RegistroClasse4(String nome)
    {
        courseName = nome;
    }

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
