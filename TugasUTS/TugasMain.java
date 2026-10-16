package TugasUTS;

public class TugasMain {
    public static void main(String[] args) {
        // 5. Instansiasi 2 objek subclass (Mamalia)
        
        System.out.println("--- Objek 1 (Constructor Tanpa Parameter) ---");
        Mamalia hewan1 = new Mamalia(); 
        hewan1.nama = "Kucing";
        hewan1.habitat = "Darat";
        hewan1.jenisMakanan = "Karnivora";
        hewan1.masaKehamilan = 2;
        
        System.out.println(hewan1.getInfo());
        hewan1.menyusui();

        System.out.println("\n--- Objek 2 (Constructor Berparameter) ---");
        // Instansiasi langsung dengan constructor berparameter
        Mamalia hewan2 = new Mamalia("Sapi", "Darat", "Herbivora", 9); 
        
        System.out.println(hewan2.getInfo());
        hewan2.menyusui();
    }
}