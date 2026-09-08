package prakt3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if ((this.jumlahPinjaman + nominal) > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    // Modifikasi method angsur sesuai tugas 2
    public void angsur(int nominal) {
        int minimalAngsuran = (int) (this.jumlahPinjaman * 0.1);

        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            this.jumlahPinjaman -= nominal;
            if (this.jumlahPinjaman < 0) {
                this.jumlahPinjaman = 0;
            }
        }
    }
}