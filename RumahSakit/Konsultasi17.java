package RumahSakit;

import java.time.LocalDate;

public class Konsultasi17 {
    private LocalDate tanggal;
    private Pegawai17 dokter;
    private Pegawai17 perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai17 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai17 dokter) {
        this.dokter = dokter;
    }

    public Pegawai17 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai17 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + (dokter != null ? dokter.getInfo() : "-");
        info += ", Perawat: " + (perawat != null ? perawat.getInfo() : "-");
        info += "\n";
        return info;
    }
}