public class EsercizioFattoDateSuIf-ElseCosaStampa {
    public static void main(String[] args) {
        //System.out.println("Ciao");

        int x = 9;
        int y = 11;

        if(x<10)
        if(y>10)
        System.out.println("*****");
        System.out.println("#####");
        System.out.println("$$$$$");

        y=9;
        x=11;

        //Questo stampa cancelletti e dollari
        if(x<10)
        if(y>10)
        System.out.println("*****");
        System.out.println("#####");
        System.out.println("$$$$$");



        
        x=9;
        y=11;

        if(x<10)
        {
            if(y>10)
                System.out.println("*****");
        }
        else{
            System.out.println("#####");
            System.out.println("$$$$$");
        }


        x=11;
        y=9;

        if(x<10)
        {
            if(y>10)
                System.out.println("*****");
        }
        else{
            System.out.println("#####");
            System.out.println("$$$$$");
        }

    }
}
