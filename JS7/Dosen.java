package JS7;

public class Dosen extends Pegawai {
    public String nidn;

    // Constructor berparameter yang memanggil super() dari parent class
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    // Method Overriding
    @Override
    public String getInfo() {
        return "NIDN  : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}
