package Tugas;
import java.util.ArrayList;

public class Pelanggan {
    private int idPelanggan;
    private String nama;
    private ArrayList riwayatPesanan;

    public Pelanggan(int idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.riwayatPesanan = new ArrayList<>();
    }

    public void buatPesanan(Pesanan p) {
        riwayatPesanan.add(p);
    }

    public ArrayList getRiwayat() {
        return riwayatPesanan;
    }

    public String getNama() {
        return nama;
    }
}
