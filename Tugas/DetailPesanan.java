package Tugas;

public class DetailPesanan {
    private Menu menu;
    private int jumlah;
    private double subtotal;

    public DetailPesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
        this.subtotal = hitungSubtotal();
    }

    public double hitungSubtotal() {
        if (menu != null) {
            return menu.getHarga() * jumlah;
        }
        return 0;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
