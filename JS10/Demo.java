package JS10;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

        // Uji Coba Heterogenous Collection
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(dosen1);
        daftarPegawai.add(tendik1);
        System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
        
        System.out.println("\n--- Uji Coba Polymorphic Arguments & instanceOf ---");
        train(dosen1);
        train(tendik1);
    }

    public static void train(Pegawai pegawai) {
        System.out.println("\nMemberikan pelatihan untuk pegawai:");
        pegawai.displayInfo();
        System.out.println("- Mengenalkan lingkungan kampus");
        System.out.println("- Menginfokan SOP/Juknis");
        
        // Memastikan objek aslinya adalah Dosen sebelum downcasting/menjalankan kode khusus
        if (pegawai instanceof Dosen) {
            System.out.println("- Memberikan pelatihan pedagogik");
        }
    }
}