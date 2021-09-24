public class OrarioTest {
    public static void main(String[] args) {
        Orario orario = new Orario();

        System.out.print("L'orario in formato universale e': ");
        System.out.println(orario.formatoUniversale());

        System.out.print("L'orario in formato americano e': ");
        System.out.println(orario.toString());

        orario.setOrario(13,27,6);

        System.out.print("L'orario in formato universale e': ");
        System.out.println(orario.formatoUniversale());

        System.out.print("L'orario in formato americano e': ");
        System.out.println(orario.toString());

        orario.setOrario(78,99,99);

        System.out.print("L'orario in formato universale e': ");
        System.out.println(orario.formatoUniversale());

        System.out.print("L'orario in formato americano e': ");
        System.out.println(orario.toString());
    }
}
