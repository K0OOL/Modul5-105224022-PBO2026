public class MainMaha {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Budi";
        System.out.println(mhs.nama);
        mhs.setNim("123456789");
        System.out.println(mhs.getNim());
        mhs.setNamaOr("Buda");
        System.out.println(mhs.getNamaOr());
    }
}
