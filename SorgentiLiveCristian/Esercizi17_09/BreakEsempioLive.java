public class BreakEsempioLive {
    public static void main(String[] args) {
        int contatore;

        for(contatore = 1 ; contatore <= 10 ; contatore++){
            if(contatore == 5)
                break;

            System.out.printf("%d ",contatore);
            //contatore++
        }

        System.out.printf("contatore=%d",contatore);
    }
}
