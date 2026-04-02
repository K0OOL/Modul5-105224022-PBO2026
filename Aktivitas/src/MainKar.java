public class MainKar {
    public static void main(String[] args) {
        Karyawan kar = new Karyawan("budi", "123456789", 1000000, "");
        kar.tampilkanDataKaryawan();
        kar.setGajiPokok(-1500000);
        kar.setDepartemen("HR");
        kar.tampilkanDataKaryawan();
        kar.setGajiPokok(2000000);
        kar.tampilkanDataKaryawan();
    }
}
