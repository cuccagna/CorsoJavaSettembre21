

public class CrearePackage {
    public static void main(String[] args) {
        Le classi Java sono contenute nei package ad esempio Scanner è in java.util 
        Adesso vediamo come creare un package proprio. Cioè ho un'applicazione Java
        creata da me e voglio renderla riutilizzabile come fosse un API. Devo crearmi
        un package. Come si fa?

        Innanzitutto perchè si usa un package:
        1) Consentono di dare un nome univoco alla classe
        Infatti ad esempio il nome di Scanner è il package più
        il nome della classe come qui sotto:
        java.util.Scanner inserisci = new java.util.Scanner(System.in);

        2)Riusare il software (cioè crearti una libreria)

        3) Creare classi e membri di una classe accessibili solo a livello di package
    
    Passi per creare un package/Api/libreria:

    1) Creare le tue classi come public. Perchè una classe non pubblica senza
       modificatore di accesso tipo
       class MiaClasse{......}
       è accessibile solo a livello di package cioè solo da altre classi nello
       stesso package. Affinchè sia accessibile anche dall'esterno la classe deve
       essere public.
       Come prima istruzione deve contenere
       package percorsoPackageSeparatoDaPunti;

       C'è una convenzione da seguire per i nomi di package cioè nome del dominio al contrario:
       com.aubay
       it.labfortraining.corsoJava.NonaLezione

       Eventuali import nel tuo codice vanno messi dopo l'istruzione package

       Nell'esempio voglio rendere riusabile la classe Time1.java e metterla
       nel package 
       it.labfortraining.corsoJava.crearePackage;

    2)Compilare la classe

    Quando compili una classe che ha l'istruzione package viene creata la struttura
    di cartelle indicate nel package. Nell'esempio del package it.labfortraining.corsoJava.crearePackage;
     verrà creata la struttura:
     it->labfortraining->CorsoJava->crearePackage
    Normalmente una classe si compila con questo comando
    javac Time1.java

    Invece per creare una libreria/Api/package usa il flag -d che serve per dirgli
    in quale percorso o cartella mettere il package che stai creando
    Qui con il . gli indico di creare la struttura a partire dalla directory corrente
    javac -d . Time1.java 

    Notare che se la classe Time1 avesse altri riferimenti ad oggetti di altre classi
    che andranno pure nel package dovrai fare
    javac -d . Time1.java AltraClasse1.java AltraClasse2.java   ecc.

3) Poi in un secondo momemnto voglio usare il package da un'altra applicazione Java.
   Diciamo che voglio usarlo dall'applicazione di Test Time1PackageDataTest.java

   Dovrò fare
   import it.labfortraining.corsoJava.crearePackage.Time1;

   Quando invoco il compilatore (javac) grazie all'import nel file Time1PackageDataTest.java
   il compilatore sa che Time1.class sta in it.labfortraining.corsoJava.crearePackage
   ma non sa dove è localizzata la cartella it
   Il compilatore di default cerca in alcuni percorsi noti, che sono quelli dovo
   sono messe le API di java. Nel nostro esempio però ho messo it sul Desktop quindi
   per specificare al compilatore un percorso aggiuntivo dove andare a cercare 
   i riferimenti (cioè dove cercare l'inizio del package cio la cartella it) userò
   il cosiddetto classpath che conterrà una lista ulteriore di percorsi dove andare
   a guardare e questo classpath può essere:
      1) Una variabile d'ambiente
      2)Impostato da riga di comando col flag -classpath  

      A -classpath  o -cp deve fare seguito una lista di percorsi o directory
      separate da ; in Windows e da : in MAC e UNIX

      Nell'esempio dare
      javac -classpath . Time1PackageTest.java

      Qualora Time1PackageTest.java fosse nella cartella C:\Users\Cristian che
      è un livello sopra il Desktop (dove c'è la cartella it dove inizia il package)
      dovevi dare il comando
      javac -classpath ./Desktop Time1PackageTest.java

    4) Quando si esegue (comando java) si deve fare una cosa simile a quando si compila.
       Devi indicare alla JVM dove stanno i .class della tua applicazione ma questa
       volta devi indicare non solo i .class relativi al package ma anche quelli
       della tua applicazione (cioè Time1PackageTest.class nll'esempio).
       Per farlo devi usare ancora il classpath.
       Nell'esempio ipotizzando che Time1PackageTest sia in C:\Users\Cristian e 
       l'inizio del package (cartella it) sul Desktop dovrai dare ipotizzando
       di stare nel percorso C:\Users\Cristian:

       java -classpath .;.\Desktop 
       

     JAR
    Un file con estensione .jar è un archivio (tipo i .zip) e serve a distribuire
    velocemente codice Java. Un .jar non è altro che un package (con dentro i .class
    e un file con estensione .manifest)

    Come si crea?
    Noi lo creiamo in modo da creare un eseguibile (in modo che funziona con doppio
     click).

    Prendiamo i file PigLatinTest.java e PigLatin.java
    portali sul Desktop e dai 
    javac PigLatinTest.java e PigLatin.java
    Creo un file che chiamo Manifest.mf dove dentro metto
    Manifest-Version: 1.0
    Main-Class: PigLatinTest

    Nota che è necessario anche lasciare una riga vuota finale
    Poi faccio
    jar cvfm NomeArchivio.jar Manifest.mf *.class

    Per vedere se ha funzionato
    java -jar NomeArchivio.jar

    Se fai doppio click sul .jar creato dovrebbe eseguirlo,  tuttavia se il tuo
    programma fa affidamento al prompt dei comandi per funzionare il SO potrebbe
    non farti partire l'esecuzione per motivi di sicurezza.

    Come si usa un .jar?
    Cioè qualcuno ti passa un .jar e devi utilizzare nella tua applicazione uno 
    o più file .class contenuti nel .jar

    Il procedimento è molto simile a come visto prima per usare un package.
    Per dettagli ed un esempio vedere:
    https://stackoverflow.com/questions/460364/how-to-use-classes-from-jar-files
    }
}
