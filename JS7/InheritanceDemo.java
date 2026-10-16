package JS7;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Instansiasi objek dosen menggunakan constructor berparameter
        Dosen dosen2 = new Dosen("34329837", "Yansy Ayuningtyas", 3000000, "1989432439");
        
        // Menampilkan seluruh info yang menggabungkan method parent dan child
        System.out.println(dosen2.getAllInfo());
    }
}
