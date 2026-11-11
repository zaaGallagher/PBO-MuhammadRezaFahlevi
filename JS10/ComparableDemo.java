package JS10;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Dosen> daftarDosen = new ArrayList<>();
        // NIP diacak untuk melihat hasil sorting
        daftarDosen.add(new Dosen("321", "Bella", "0091"));
        daftarDosen.add(new Dosen("123", "Adila", "0081"));
        daftarDosen.add(new Dosen("231", "Petrus", "0071"));

        // Memanggil built-in interface untuk mengurutkan (sekarang urut berdasar NIP)
        Collections.sort(daftarDosen);

        System.out.println("--- DAFTAR DOSEN SETELAH DIURUTKAN (Berdasarkan NIP) ---");
        for (Dosen dosen : daftarDosen) {
            dosen.displayInfo();
            System.out.println("-----------------");
        }
    }
}