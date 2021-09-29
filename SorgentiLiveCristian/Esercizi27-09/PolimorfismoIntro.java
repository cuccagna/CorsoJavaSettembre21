public class PolimorfismoIntro {
    public static void main(String[] args) {
        //Qui puoi chiamare tramite myPianeta solo metodi pubblici della classe Pianeti
        Pianeti myPianeta = new Pianeti(35.7,300);


        //Puoi chiamare con myPianeta2 solo i metodi della classe Pianeti e i metodi
        //della classe Sole ma solo quelli comuni a entrambi. Cioè non puoi chiamare
        //tramite myPianeta2 metodi specifici dlla classe Sole
        Pianeti myPianeta2 = new Sole(1000 , 300 , 372);

        //A Questo metodo puoi passare un qualunque oggetto che è un Pianeta
        //cioè che sia una sottoclasse di Pianeti
/* public void myMetodo(Pianeti parametro){

} */

        //Qui puoi chiamare tramite myPianeta3 metodi pubblici della classe Sole e anche quelli
        //della classe Pianeti
        Sole mypianeta3 = new Sole(1000 , 300 , 342)

        Pianeti myPianeti[] = new Pianeti [10];
        myPianeti[0] = new Sole(1000 , 300 , 372);
        myPianeti[1] = new Terra(.........);
        myPianeti[2] = new Sole(345,278,350);

        myPianeti[0].incrementaTemperatura(300);
    }
}
