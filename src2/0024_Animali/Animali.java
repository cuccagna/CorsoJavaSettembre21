public class Animali {
    private static int numAnimali;

    public Animali()
    {
        ++numAnimali;
    }

    public static void saluta()
    {
        System.out.println("Ciao. Fuori gli animali dagli zoo!\n");
    }

    public static int getNumAnimali()
    {
        return numAnimali; 
    }
    
}
