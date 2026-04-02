public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang("123456789", "Buku", "ATK");
        barang.stok = 10;// barang.stok tidak dikenali di class ini walaupun package sama namun private
                         // menutup keberadaannya.
        barang.setStok(-15);
        barang.setHargaSatuan(-20000);
        barang.tampilkanDataBarang();
        barang.setStok(10);
        barang.kurangiStok(15);
        barang.setHargaSatuan(10000);
        barang.tampilkanDataBarang();
    }
}
