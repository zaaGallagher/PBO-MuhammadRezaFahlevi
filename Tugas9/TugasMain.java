package Tugas9;

public class TugasMain {
    public static void main(String[] args) {
        // 1. Uji Coba Kartu Kredit
        System.out.println("--- KARTU KREDIT ---");
        KartuKredit cc = new KartuKredit("4455-1122-3344", "Reza Fahlevi", 10000000);
        System.out.println("Sisa Limit Awal : " + cc.cekSaldo());
        cc.bayar(2000000); // Melakukan pembayaran
        System.out.println("Sisa Limit Baru : " + cc.cekSaldo());
        cc.bayarTagihan(500000);

        System.out.println("\n--- E-WALLET ---");
        // 2. Uji Coba E-Wallet
        EWallet gopay = new EWallet("081234567890", "123456");
        gopay.topUp(500000); // Mengisi saldo awal
        System.out.println("Saldo E-Wallet  : " + gopay.cekSaldo());
        gopay.bayar(150000); // Melakukan pembayaran
        System.out.println("Sisa Saldo      : " + gopay.cekSaldo());
    }
}
