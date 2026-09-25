package Tugas;

public class Menu {
    private int idMenu;
    private String namaMenu;
    private double harga;

    public Menu(int idMenu, String namaMenu, double harga) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getDetailMenu() {
        return "ID: " + idMenu + " | " + namaMenu + " - Rp " + harga;
    }
}
