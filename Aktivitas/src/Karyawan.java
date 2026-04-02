public class Karyawan {

    private String nama;
    private String idKaryawan;
    private double gajiPokok;
    protected String departemen;

    public Karyawan(String nama, String idKaryawan, double gajiPokok, String departemen) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        setGajiPokok(gajiPokok);
        this.departemen = departemen;
    }

    public String getNama() {
        return nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double newGajiPokok) {
        if (newGajiPokok < 0) {
            System.out.println("gaji pokok tidak boleh negatif.");
        } else {
            this.gajiPokok = newGajiPokok;
        }
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void tampilkanDataKaryawan() {
        System.out.println("\nNama\t\t: " + nama);
        System.out.println("ID Karyawan\t: " + idKaryawan);
        System.out.println("Gaji Pokok\t: " + gajiPokok);
        System.out.println("Departemen\t: " + departemen + "\n");
    }
}
