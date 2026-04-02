public class RekeningBank {

    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = 0;
        setor(saldo);
    }

    public String getNomorRekening() {
        return nomorRekening;
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

    public void tarik(double jumlah) {
        if (jumlah < 0) {
            System.out.println("Jumlah tidak boleh negatif");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup");
        } else {
            saldo -= jumlah;
        }
    }

    public void info() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        RekeningBank rekening = new RekeningBank("123456789", 1000000);
        rekening.info();
        rekening.setor(500000);
        rekening.info();
        rekening.tarik(200000);
        rekening.info();
    }
}