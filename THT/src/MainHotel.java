public class MainHotel {
    public static void main(String[] args) {

        System.out.println("==========================================================");
        System.out.println("   SIMULASI SISTEM RESERVASI HOTEL");
        System.out.println("==========================================================");

        System.out.println("\n[KAMAR 1] Membuat kamar dengan Constructor Kilat...");
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 3);

        System.out.println("\n[KAMAR 1] Uji Setter: mencoba harga -10000...");
        kamar1.setHargaPerMalam(-10000);

        System.out.println("\n----------------------------------------------------------");
        System.out.println("[KAMAR 2] Membuat kamar dengan Constructor Lengkap...");
        KamarHotel kamar2 = new KamarHotel("202", "Suite", 2, 250000);
        System.out.println("\n[KAMAR 2] Mencoba pesan untuk 4 tamu (kapasitas maks 2)...");
        kamar2.pesanKamar(4);

        System.out.println("\n[KAMAR 2] Mencoba pesan untuk 2 tamu (sesuai kapasitas)...");
        kamar2.pesanKamar(2);

        System.out.println("\n[KAMAR 2] Mencoba pesan lagi tanpa parameter (sudah dipesan)...");
        kamar2.pesanKamar();

        System.out.println("\n----------------------------------------------------------");
        System.out.println("[KAMAR 1] Hitung tagihan 2 malam + voucher PROMO (harus GAGAL diskon)...");
        double tagihan1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.printf("\tTotal tagihan Kamar 1 (2 malam): Rp%,.0f%n", tagihan1);

        System.out.println("\n[KAMAR 2] Hitung tagihan 4 malam + voucher PROMO (harus BERHASIL diskon 20%)...");
        double tagihan2 = kamar2.hitungTotalBayar(4, "PROMO");

        System.out.printf("\tTotal tagihan Kamar 2 (4 malam, diskon): Rp%,.0f%n", tagihan2);

        System.out.println("\n==========================================================");
        System.out.println("   KONDISI AKHIR KEDUA KAMAR");
        System.out.println("==========================================================");
        kamar1.cetakInfo();
        System.out.println();
        kamar2.cetakInfo();
    }
}