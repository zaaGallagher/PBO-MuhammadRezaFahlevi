package TugasUTS;

public class Mamalia extends Hewan {
    public int masaKehamilan;

    // 1. Method Overloading: Constructor tanpa parameter
    public Mamalia() {
        super(); // Memanggil constructor tanpa parameter parent
    }

    // 2. Method Overloading: Constructor dengan parameter
    public Mamalia(String nama, String habitat, String jenisMakanan, int masaKehamilan) {
        // 3. Memanggil constructor berparameter dari superclass
        super(nama, habitat, jenisMakanan); 
        this.masaKehamilan = masaKehamilan;
    }

    // 4. Method Overriding: Menggunakan getInfo() agar tidak "maksa"
    @Override
    public String getInfo() {
        String info = super.getInfo(); // Mengambil info dari superclass Hewan
        info += "Masa Kehamilan: " + this.masaKehamilan + " bulan\n";
        return info;
    }

    // Method khusus milik Mamalia sesuai diagram
    public void menyusui() {
        System.out.println(this.nama + " sedang menyusui anaknya.");
    }
}