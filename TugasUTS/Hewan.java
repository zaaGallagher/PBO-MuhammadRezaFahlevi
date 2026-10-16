package TugasUTS;

public class Hewan {
    public String nama;
    public String habitat;
    public String jenisMakanan;

    // 1. Method Overloading: Constructor tanpa parameter
    public Hewan() {
        System.out.println("Objek Hewan baru dibuat (tanpa parameter).");
    }

    // 2. Method Overloading: Constructor dengan parameter
    public Hewan(String nama, String habitat, String jenisMakanan) {
        this.nama = nama;
        this.habitat = habitat;
        this.jenisMakanan = jenisMakanan;
    }

    // Method yang akan di-override di subclass
    public String getInfo() {
        String info = "Nama Hewan    : " + this.nama + "\n";
        info += "Habitat       : " + this.habitat + "\n";
        info += "Jenis Makanan : " + this.jenisMakanan + "\n";
        return info;
    }
}
