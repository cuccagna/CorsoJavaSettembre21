import java.util.Scanner;

public class Massimo{
    public void determinaMassimo()
    {
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Inserire 3 numeri decimali separati da uno spazio\n");
        double numero1 = inserisci.nextDouble();
        double numero2 = inserisci.nextDouble();
        double numero3 = inserisci.nextDouble();
        inserisci.close();
        /*
            Un metodo di una classe può chiamare un metodo della STESSA
            classe direttamente senza creare un oggetto.
        */
        /*
            Nota la sintassi per passare più argomenti durante una chiamata di metod
            Serve separare più argomenti da virgola e non è necessario il tipo.
        */
        double result = calcolaMassimo(numero1,numero2,numero3); //chiamata (detta talvolta invocazione) di metodo
        stampaMassimo(result,numero1,numero2,numero3);
    }

    /* Sintassi della definizione di un metodo chiamato. Lista dei parametri
      separata da virgole, con previa obbligatoria indicazione del tipo.
      Modificatore d'accesso public o private già visto in precedenza.
      Poi tipo di ritorno in questo caso double. Se non ritorna niente
      scrivere void  poi nome del metodo in minuscolo in camelCase, non deve iniziare con numeri
      Corpo del metodo tra parentesi graffe.
      Se la lista dei parametri è vuota (metodo senza parametri) le parentesi rotonde
      vanno comunque messe.
      ERRORE TIPICO: mettere un ; così 
      public double calcolaMassimo(double n1 , double n2  double n3);
      {

      }
      Errore fatto perchè nella chiamata del metodo ci va il punto e virgola ma 
      qui nella definizione no. Metterlo è un errore di sintassi.
      */
      public void stampaMassimo(double m,double n1,double n2,double n3)
      {
        System.out.printf("\nIl valore massimo tra %f %f e %f è:\n%f",n1,n2,n3,m);
      }

    public double calcolaMassimo(double n1 , double n2 ,  double n3)
    {
        double massimo = n1;
        if(n2 > massimo)
            massimo = n2;

        if(n3>massimo)
            massimo = n3;

        return massimo;
    }
}