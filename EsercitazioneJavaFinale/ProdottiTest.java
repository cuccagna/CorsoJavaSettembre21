
public class ProdottiTest {
    public static void main(String[] args) {

        Prodotti prodotto1 = new Prodotti("234567", "panino", 5);
        Prodotti prodotto2 = new Prodotti("456789", "piadina", 4);
        Prodotti prodotto3 = new Prodotti("678943", "panzerotto", 2);
        //Prodotti prodotto4 = new Prodotti("456789","pizza",4); eccezione lanciata per codice duplicato
        prodotto1.applicaSconto();
        System.out.printf("questo e' il prezzo scontato:%.2f\n ",prodotto1.applicaSconto());
        Prodotti prodotto5 = (Prodotti) prodotto1.clone(); 
        prodotto1.setPrezzo(4);
        System.out.printf("questo e' il prodotto 1:\n%s\nprodotto 5:\n%s\n",prodotto1,prodotto5);
        
        //faccio vedere che la copia con l operatore = anziche' con clone fa una shallow copy(copia superficiale)
        Prodotti prodotto6 = prodotto1;
        System.out.printf("\nprodotto1 dopo della shallow copy:\n%s", prodotto1);
        System.out.printf("\nprodotto6 dopo della shallow copy:\n%s", prodotto6);
        prodotto1.setPrezzo(3);
        System.out.printf("\nprodotto1 dopo della shallow copy e dopo la modifica del prezzo:\n%s", prodotto1);
        System.out.printf("\nprodotto6 dopo della shallow copy e dopo la modifica del prezzo:\n%s", prodotto6);
        

        System.out.printf("prodotto1 == prodotto6 e' %b con la shallow copy\nprodotto1 == prodotto5 e' %b con la deep copy(clone)\n", prodotto1 == prodotto6,prodotto1 == prodotto5);


        //testiamo il metodo equals per confrontare due oggetti prodotto. Nota la differenza col confronto con ==.
        Prodotti prodotto7 = (Prodotti) prodotto2.clone();
        System.out.printf("\nprodotto2 == prodotto7 e' %b\nprodotto2.equals(prodotto7) e' %b\n", prodotto2 == prodotto7,prodotto7.equals(prodotto2));

        //creo un prodotto alimentare
        Data scadenzaProdotto8 = new Data(1,12,2021);
        ProdottiAlimentari prodotto8 = new ProdottiAlimentari(scadenzaProdotto8,"2345678","fagioli",3);
        //ProdottiAlimentari prodotto8 = new ProdottiAlimentari(new Data(12,1,2022),"2345678","fagioli",3);  
        ProdottiNonAlimentari prodotto9 = new ProdottiNonAlimentari("alluminio", "3452678","stagnola",2);
        Data dataAttuale = new Data();
        int giorniDiDifferenza = scadenzaProdotto8.getDifference(dataAttuale);
        System.out.printf("i giorni di differenza tra\n%s\ne\n%s\ne'di:\n%d giorni", scadenzaProdotto8,dataAttuale,giorniDiDifferenza);
        //System.out.printf("verifico che la data attuale non sia stata modificata da getDifference():\nore:%d\n",dataAttuale.c.get(Calendar.HOUR_OF_DAY));
        System.out.printf("%sprezzo scontato:%.2f", prodotto8,prodotto8.applicaSconto());
        System.out.printf("\n\n%sprezzo scontato:%.2f", prodotto9,prodotto9.applicaSconto());
        ProdottiNonAlimentari prodotto10 = new ProdottiNonAlimentari("vetro", "3457678","botte",4);
        System.out.printf("\n\n%sprezzo scontato:%.2f", prodotto10,prodotto10.applicaSconto());

        ListaSpesa listaSpesa1 = new ListaSpesa();
        listaSpesa1.start();
        System.out.printf("\nLa spesa totale è %.2f\n",listaSpesa1.calcolaTotale());

        /*Nella classe ListaSpesa deve permettere l'inserimento del prodotto (codice a barre, oppure nome del prodotto) tramite Scanner oppure se preferisci tramite interfaccia grafica
        Devi avere un file con dentro i vari prodotti in cui in ogni riga del file hai un prodotto e ogni prodotto avrà il codice a barre,la descrizione,il prezzo e il materiale o la data di scadenza.
        Potresti avere un'ulteriore campo per specificare se il prodotto è alimentare oppure no,Quando l'utente inserisce un prodotto devi verificare nel file che esiste,Se esiste ti crei un oggetto della classe idonea/corretta per calcolare lo sconto eventuale e farti tornare quindi il prezzo del prodotto
        e man man ti calcoli così l'ammontare della spesa, Però lo sconto lo devi applicare solo se l'utente ha la tessera fedeltà,Come verifichi se l'utente ha la tessera fedeltà?
        Crei un altro file con ogni riga che rappresenta un codice di una tessera fedeltà E prima di fare inserire all'utente i prodotti chiedi all'utente se ha una tesserra fedeltà.
        e in caso affermativo fargli inserire il codice della tessera Verifichi leggendo dal file che il codice esiste E in questo caso puoi applicare gli sconti eventualmente
        Se il codice non esiste, lo segnali all'utente, e gli dici se vuole riprovare il reinserimento del codice o vuole procedere senza tessera fedeltà.*/








        
        
    }
}
