public class IstogrammaArray {
    public static void main(String[] args) {
        int array[] = {0,0,0,0,0,0,1,2,4,2,1};
        System.out.println("Report della distribuzione dei voti");

        for(int contatore=0 ; contatore < array.length ; contatore++){
            if(contatore == 10)
                System.out.printf("%5d:",100);
            else
                System.out.printf("%02d-%02d:",contatore*10,contatore*10+9);
            
            for(int asterischi = 0 ; asterischi < array[contatore] ; asterischi++)
                System.out.print("*");

            System.out.println();
        }
    }
}
