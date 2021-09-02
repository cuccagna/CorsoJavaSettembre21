public class Scope {
    private int x =1;

    public void inizia(){
        int x = 5;
        //qui la variabile locale x oscura la variabile d'istanza omonima x
        System.out.printf("Variabile locale x nel metodo inizia è %d\n",x);

        usaVariabileLocale();
        usaCampo();
        usaVariabileLocale();
        usaCampo();

        System.out.printf("Variabile locale x nel metodo inizia è %d\n",x);
    }

    public void usaVariabileLocale(){
        int x = 25;

        System.out.printf("Variabile locale x nel metodo usaVariabileLocale è %d\n",x);
        ++x; //Modifica la variabile locale in questo metodo
        System.out.printf("Variabile locale x prima di uscire dal metodo usaVariabileLocale è %d\n",x);

    }

    public void usaCampo(){
        System.out.printf("Campo x nel metodo usaCampo è %d\n",x);
        x*=10; //Modifica il campo x della classe Scope
        System.out.printf("Campo x prima di uscire metodo usaCampo è %d\n",x);

    }
}
