public class Esercitazione4N2Test {
    public static void main(String[] args) {
        Esercitazione4N2 impiegato1 = new Esercitazione4N2("Aldo" , "Baglio" , 2345.78);
        Esercitazione4N2 impiegato2 = new Esercitazione4N2("Massimo","Della Pena",1803.67);

        System.out.printf("Il salario del primo impiegato e' %.2f\nIl salario del secondo impiegato e' %.2f",impiegato1.getPagaMensile(),impiegato2.getPagaMensile());
        
        /* double pagaIniziale = impiegato1.getPagaMensile();
        double pagaIncrementata = pagaIniziale * 1.1;
        impiegato1.setPagaMensile(pagaIncrementata); */

        //Quello sopra è del tutto equivalente a questo
        impiegato1.setPagaMensile(impiegato1.getPagaMensile() * 1.1);

        impiegato2.setPagaMensile(impiegato2.getPagaMensile() * 1.1);

        System.out.printf("\nIl salario del primo impiegato e' %.2f\nIl salario del secondo impiegato e' %.2f",impiegato1.getPagaMensile(),impiegato2.getPagaMensile());

    }
}
