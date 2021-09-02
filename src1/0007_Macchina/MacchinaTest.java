public class MacchinaTest {
    public static void main(String[] args) {
        
        Macchina myCar = new Macchina();
        System.out.printf("\nLa velocità della mia macchina è %f" , myCar.getVelocita());
        myCar.incrementaVelocita(10);
        System.out.printf("\nLa velocità della mia macchina è %f" , myCar.getVelocita());
    }

}
