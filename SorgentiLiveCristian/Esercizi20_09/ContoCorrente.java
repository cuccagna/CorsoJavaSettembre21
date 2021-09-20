public class ContoCorrente {
    private double saldo;

    public ContoCorrente(double saldoIniziale){
        System.out.printf("Il valore iniziale di saldo nel costruttore è %.2f\n",getSaldo());
        setSaldo(saldoIniziale);
    }

    public void setSaldo(double mioSaldo){
        saldo = mioSaldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void accredita(double cifra){
        //saldo +=cifra;
        saldo = saldo + cifra;
    }
}
