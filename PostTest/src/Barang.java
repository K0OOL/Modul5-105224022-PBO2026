public class Barang {

    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;
    protected String kategori;

    public Barang(String idBarang, String namaBarang, String kategori) {
        setIdBarang(idBarang);
        setNamaBarang(namaBarang);
        setKategori(kategori);
        this.stok = 0;
        this.hargaSatuan = 0;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int newStok) {
        if (newStok < 0) {
            System.out.println("Stok tidak boleh negatif.");
        } else {
            this.stok = newStok;
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Jumlah stok harus positif.");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok - jumlah >= 0) {
                this.stok -= jumlah;
            } else {
                System.out.println("Stok tidak mencukupi.");
            }
        } else {
            System.out.println("Jumlah stok harus positif.");
        }
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(double newHargaSatuan) {
        if (newHargaSatuan <= 0) {
            System.out.println("Harga satuan tidak boleh nol atau negatif.");
        } else {
            this.hargaSatuan = newHargaSatuan;
        }
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tampilkanDetailBarang() {
        System.out.println("\nID Barang\t: " + idBarang);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Kategori\t: " + kategori);
        System.out.println("Stok\t\t: " + stok);
        System.out.println("Harga Satuan\t: " + hargaSatuan + "\n");
    }

    public void tampilkanDataBarang() {
        System.out.println("\nID Barang\t: " + idBarang);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Stok\t\t: " + stok);
        System.out.println("Harga Satuan\t: " + hargaSatuan + "\n");
    }

}
