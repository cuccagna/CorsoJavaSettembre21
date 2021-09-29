public class Automobile {
    private int cilindrata;
    private String targa;

    public Automobile(int cilindrataAuto , String targaAuto){
        cilindrata = cilindrataAuto;
        targa      = targaAuto;
    }

    public String toString(){
        return String.format("Caratteristiche dell'automobile:\ncilindrata:%d\ntarga:%s",cilindrata,targa);
    }
}
