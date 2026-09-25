package RumahSakit;

import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main(String[] args) {
        Pegawai17 ani = new Pegawai17("1234", "dr. Ani");
        Pegawai17 bagus = new Pegawai17("4567", "dr. Bagus");
        Pegawai17 desi = new Pegawai17("1234", "Ns. Desi");
        Pegawai17 eka = new Pegawai17("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);
        System.out.println(pasien1.getInfo());

        Pasien pasien2 = new Pasien("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
