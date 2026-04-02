public class RekeningBank {

    private int nomorRekening;
    private double saldo;

    public RekeningBank(int nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public int getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(int nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah < 0) {
            System.out.println("Jumlah tidak boleh negatif");
        } else {
            saldo += jumlah;
        }
    }

    public void info() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        RekeningBank rekening = new RekeningBank(123456789, 1000000);
        rekening.info();
        rekening.setor(500000);
        rekening.info();
    }

}