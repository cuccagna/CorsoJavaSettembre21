public class PersonaTest {
    public static void main(String[] args) {
        Automobile autoTizio = new Automobile(1800,"AX564746");
        Persona tizio = new Persona("Marco","Rossi",autoTizio);

        System.out.println(tizio);
    }
}
