package Tugas;
import java.util.ArrayList;

public class Restoran {
private int idRestoran;
    private String namaRestoran;
    private ArrayList daftarMenu;

    public Restoran(int idRestoran, String namaRestoran) {
        this.idRestoran = idRestoran;
        this.namaRestoran = namaRestoran;
        this.daftarMenu = new ArrayList();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void tampilkanMenu() {
        System.out.println("=== Menu Restoran: " + namaRestoran + " ===");
        // Menggunakan explicit casting untuk menghindari type mismatch
        for (Object obj : daftarMenu) {
            Menu m = (Menu) obj;
            System.out.println(m.getDetailMenu());
        }
    }
}