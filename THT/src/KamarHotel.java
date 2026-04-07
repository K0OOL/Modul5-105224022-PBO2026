public class KamarHotel {

    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        setTipeKamar(tipeKamar);
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        setTipeKamar(tipeKamar);
        setHargaPerMalam(hargaPerMalam);
        this.isTersedia = true;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") ||
                tipeKamar.equalsIgnoreCase("Premium") ||
                tipeKamar.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipeKamar.substring(0, 1).toUpperCase() + tipeKamar.substring(1).toLowerCase();
        } else {
            System.out.println("[PERINGATAN] Tipe kamar \"" + tipeKamar +
                    "\" tidak valid! Tipe hanya boleh: Reguler, Premium, atau Suite.");
            System.out.println("             Tipe kamar otomatis diatur menjadi: Reguler");
            this.tipeKamar = "Reguler";
        }
    }

    public void setKapasitasMaksimal(int kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println("[PERINGATAN] Harga Rp" + hargaPerMalam +
                    " terlalu rendah! Harga minimal adalah Rp50.000.");
            System.out.println("             Harga otomatis diatur menjadi: Rp50.000");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    public void setTersedia(boolean isTersedia) {
        this.isTersedia = isTersedia;
    }

    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("[SUKSES] Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("[PERINGATAN] Kamar " + nomorKamar +
                    " sudah dipesan dan tidak tersedia saat ini.");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("[PERINGATAN] Kamar " + nomorKamar +
                    " sudah dipesan dan tidak tersedia saat ini.");
            return;
        }
        if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("[DITOLAK] Pemesanan gagal! Jumlah tamu (" + jumlahTamu +
                    " orang) melebihi kapasitas maksimal kamar " + nomorKamar +
                    " (" + kapasitasMaksimal + " orang). Status kamar tetap TERSEDIA.");
        } else {
            isTersedia = false;
            System.out.println("[SUKSES] Kamar " + nomorKamar + " berhasil dipesan untuk " +
                    jumlahTamu + " tamu.");
        }
    }

    public void batalPesan() {
        isTersedia = true;
        System.out.println("[INFO] Pemesanan kamar " + nomorKamar +
                " dibatalkan. Kamar kini tersedia kembali.");
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hargaPerMalam * jumlahMalam;

        if (kodeVoucher.equalsIgnoreCase("PROMO")) {
            if (jumlahMalam >= 3) {
                double diskon = total * 0.20;
                double bayar = total - diskon;
                System.out.println("[VOUCHER] Kode \"PROMO\" berhasil! Diskon 20% sebesar Rp" +
                        String.format("%,.0f", diskon) + " diterapkan.");
                return bayar;
            } else {
                System.out.println("[VOUCHER DITOLAK] Kode \"PROMO\" membutuhkan minimal 3 malam." +
                        " Anda hanya memesan " + jumlahMalam + " malam. Tagihan normal diterapkan.");
                return total;
            }
        } else {
            System.out.println("[VOUCHER DITOLAK] Kode \"" + kodeVoucher +
                    "\" tidak dikenal. Tagihan normal diterapkan.");
            return total;
        }
    }

    public void cetakInfo() {
        System.out.println("══════════════════════════════════════════");
        System.out.println("         STRUK INFORMASI KAMAR            ");
        System.out.println("══════════════════════════════════════════");
        System.out.printf(" Nomor Kamar      : %-21s%n", nomorKamar);
        System.out.printf(" Tipe Kamar       : %-21s%n", tipeKamar);
        System.out.printf(" Kapasitas Maks.  : %-18s org%n", kapasitasMaksimal);
        System.out.printf(" Harga / Malam    : Rp%-19s%n",
                String.format("%,.0f", hargaPerMalam));
        System.out.printf(" Status           : %-21s%n",
                isTersedia ? "TERSEDIA" : "TIDAK TERSEDIA");
        System.out.println("══════════════════════════════════════════");
    }
}
