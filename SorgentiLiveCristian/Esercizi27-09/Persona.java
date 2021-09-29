public class Persona {
    private String nome;
    private String cognome;
    private Automobile macchina;

    public Persona(String nomePersona,String cognomePersona, Automobile macchinaPersona){
        nome = nomePersona;
        cognome = cognomePersona;
        macchina = macchinaPersona;
        //setMacchina(macchinaPersona)
    }

/*     Questo fa una deep copy dell'oggetto in modo che se modifico l'oggetto macchina
    passato dall'esterno la modifica non si ripercuote sull'oggetto Automibile che
    hai come variabile d'istanza
 */    /* public void setMacchina(Automobile auto){
        macchina = new Automobile(auto.getCilindrata(),auto.getTarga());
    } */

    public String toString(){
        return String.format("Il tizio di nome %s %s ha un'automobile con le seguenti caratteristiche:%s\n",nome,cognome,macchina);
    }
}

