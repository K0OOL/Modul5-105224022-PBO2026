public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang("123456789", "Buku");
        barang.setStok(-15);
        barang.setHargaSatuan(-20000);
        barang.tampilkanDataBarang();
        barang.setStok(10);
        barang.setHargaSatuan(10000);
        barang.tampilkanDataBarang();
    }
}
