
public class RegistroClasseTest4 {
    public static void main(String[] args) {
        //Creo due oggetti diversi della stessa classe
        //Ricorda che ognuno avrà una copia diversa e separata della
        //variabile d'istanza courseName (e di qualunque altra, solo che
        //nell'esempio c'è solo una variabile d'istanza) 
        //Queste due chiamate chiamo entrambe il costruttore
        //che inizializza courseName, la variabile d'istanza
        RegistroClasse4 registro1 = new RegistroClasse4("Java");
        RegistroClasse4 registro2 = new RegistroClasse4("C++");

        System.out.printf("\n\nIl nome  del corso per registro1 è %s\n",registro1.getCourseName());
        System.out.printf("\n\nIl nome  del corso per registro2 è %s\n\n",registro2.getCourseName());
        
    }
}
