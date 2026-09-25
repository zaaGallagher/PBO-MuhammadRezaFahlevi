package Tugas;

public class Main {
 public static void main(String[] args) {
        Restoran resto = new Restoran(1, "Restoran Nusantara");
        
        Menu menu1 = new Menu(101, "Nasi Goreng Special", 25000);
        Menu menu2 = new Menu(102, "Es Teh Manis", 5000);
        Menu menu3 = new Menu(103, "Ayam Bakar Madu", 30000);

        resto.tambahMenu(menu1);
        resto.tambahMenu(menu2);
        resto.tambahMenu(menu3);

        resto.tampilkanMenu();
        System.out.println();

        Pelanggan pelanggan1 = new Pelanggan(1, "Muhammad Reza Fahlevi");

        Pesanan pesanan1 = new Pesanan(501, "2026-09-25");
        
        pesanan1.tambahItem(new DetailPesanan(menu1, 2)); // 2 Nasi Goreng
        pesanan1.tambahItem(new DetailPesanan(menu2, 2)); // 2 Es Teh

        pelanggan1.buatPesanan(pesanan1);

        System.out.println("=== Informasi Pesanan Pelanggan ===");
        System.out.println("Nama Pelanggan : " + pelanggan1.getNama());
        
        for (Object objP : pelanggan1.getRiwayat()) {
            Pesanan p = (Pesanan) objP;
            System.out.println("ID Pesanan     : " + p.getIdPesanan());
            System.out.println("Tanggal        : " + p.getTglPesanan());
            System.out.println("Daftar Item:");
            
            for (Object objDp : p.getItemPesanan()) {
                DetailPesanan dp = (DetailPesanan) objDp;
                System.out.println(" - " + dp.getMenu().getNamaMenu() + " x " + dp.getJumlah() + " = Rp " + dp.getSubtotal());
            }
            System.out.println("Total Bayar    : Rp " + p.getTotalBayar());
        }
    }
}
