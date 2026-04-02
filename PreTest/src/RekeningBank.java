public class RekeningBank {

    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = 0;
        setsaldo(saldo);
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setsaldo(double newSaldo) {
        if (newSaldo < 0) {
            System.out.println("saldo tidak boleh negatif.");
        } else {
            System.out.println("oke.");
            this.saldo += newSaldo;
        }
    }

    public void info() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }
}