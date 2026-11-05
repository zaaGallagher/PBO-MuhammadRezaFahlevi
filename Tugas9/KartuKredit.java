package Tugas9;

public class KartuKredit implements MetodePembayaran {
    private String nomorKartu;
    private String namaPemilik;
    private double limitKredit;
    private double tagihan;

    // Constructor untuk inisialisasi data
    public KartuKredit(String nomorKartu, String namaPemilik, double limitKredit) {
        this.nomorKartu = nomorKartu;
        this.namaPemilik = namaPemilik;
        this.limitKredit = limitKredit;
        this.tagihan = 0.0;
    }

    @Override
    public boolean bayar(double jumlah) {
        if (this.tagihan + jumlah <= this.limitKredit) {
            this.tagihan += jumlah;
            System.out.println("Pembayaran Kartu Kredit berhasil. Tagihan bertambah.");
            return true;
        } else {
            System.out.println("Pembayaran gagal! Limit kredit tidak mencukupi.");
            return false;
        }
    }

    @Override
    public double cekSaldo() {
        // Mengembalikan sisa limit yang masih bisa digunakan
        return this.limitKredit - this.tagihan;
    }

    public void bayarTagihan(double jumlah) {
        this.tagihan -= jumlah;
        System.out.println("Pembayaran tagihan kartu kredit sebesar " + jumlah + " berhasil dilakukan.");
    }
}
