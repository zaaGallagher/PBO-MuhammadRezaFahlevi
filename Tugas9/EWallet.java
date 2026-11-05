package Tugas9;

public class EWallet implements MetodePembayaran {
    private String nomorHp;
    private double saldo;
    private String pin;

    // Constructor untuk inisialisasi data
    public EWallet(String nomorHp, String pin) {
        this.nomorHp = nomorHp;
        this.pin = pin;
        this.saldo = 0.0; // Saldo awal 0
    }

    @Override
    public boolean bayar(double jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            System.out.println("Pembayaran E-Wallet berhasil. Saldo terpotong.");
            return true;
        } else {
            System.out.println("Pembayaran gagal! Saldo E-Wallet tidak mencukupi.");
            return false;
        }
    }

    @Override
    public double cekSaldo() {
        return this.saldo;
    }

    public void topUp(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Top Up E-Wallet sebesar " + jumlah + " berhasil.");
    }
}
