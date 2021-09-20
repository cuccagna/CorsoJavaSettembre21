public class ContoCorrenteTest {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente(1000);
        ContoCorrente conto2 = new ContoCorrente(300);
        //Istruzione per leggere il saldo
        
        //Istruzione per leggere il saldo qualora fosse pubblca la varuabile d'istanza saldo
        //mioSaldo=conto1.saldo;

        //Istruzioni per leggere il saldo
        double saldoConto1;
        saldoConto1 = conto1.getSaldo();

        System.out.printf("Il saldo del conto1 e' %.2f\n",saldoConto1);

        conto1.setSaldo(1500);
        double saldoConto1DopoChiamataGet;
        saldoConto1DopoChiamataGet = conto1.getSaldo();
        System.out.printf("Il saldo del conto1 dopo la modifica e' %.2f\n",saldoConto1DopoChiamataGet);

        conto1.accredita(220.5);
        double nuovoSaldoDopoAccredito;
        nuovoSaldoDopoAccredito = conto1.getSaldo();
        System.out.printf("Il saldo del conto1 dopo la modifica e' %.2f\n",nuovoSaldoDopoAccredito);

        System.out.printf("Il saldo del conto2 dopo la modifica e' %.2f\n",conto2.getSaldo());
        //il saldo di conto2 dopo l'accredito diventa 400
        //ma il saldo di conto1 non viene modificato. Resta 1720,50
        conto2.accredita(100);
        
    }
}
