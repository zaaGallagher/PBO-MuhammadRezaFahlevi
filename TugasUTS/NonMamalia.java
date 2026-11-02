package TugasUTS;

public class NonMamalia extends Hewan {
    public String jenisKulit;

    public NonMamalia() {
        super();
    }

    public NonMamalia(String nama, String habitat, String jenisMakanan, String jenisKulit) {
        super(nama, habitat, jenisMakanan); 
        this.jenisKulit = jenisKulit;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis Kulit   : " + this.jenisKulit + "\n";
        return info;
    }

    public void bertelur() {
        System.out.println(this.nama + " berkembang biak dengan cara bertelur.");
    }
}
