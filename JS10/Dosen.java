package JS10;

// Menambahkan implements Comparable<Dosen>
public class Dosen extends Pegawai implements Comparable<Dosen> {
    public String nidn;

    public Dosen() {
    }

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }

    // Jawaban Pertanyaan 2.10 No 3: Mengurutkan berdasarkan NIDN
    @Override
    public int compareTo(Dosen otherDosen) {
        return this.nidn.compareTo(otherDosen.nidn);
    }
}