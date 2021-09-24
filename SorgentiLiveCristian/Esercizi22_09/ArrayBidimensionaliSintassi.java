public class ArrayBidimensionaliSintassi {
    public static void main(String[] args) {
        int arrayBidimensionale[][] = new int [3][5];

        for(int riga=0 ; riga<arrayBidimensionale.length ; riga++)
        {
            for(int colonna=0; colonna<arrayBidimensionale[riga].length ; colonna++){
                arrayBidimensionale[riga][colonna] //per accedere gli elementi
            }
        }

        int arrayBidim2[][]={{1,2},{4,5,6}}
        arrayBidim2[0][0]  per accedere al valore 1
        arrayBidim2[1][2] per accedere al valore 6
        1 2
        4 5 6
    }
}
