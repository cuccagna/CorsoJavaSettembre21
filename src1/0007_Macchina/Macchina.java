public class Macchina {
    private double velocita;

    public Macchina(){
        System.out.println("Sono nel costruttore");
        velocita = 67.3;
    }

    public void incrementaVelocita(double inc){
        velocita += inc;
    }

    public double getVelocita(){
        return velocita;
    }
    
}
