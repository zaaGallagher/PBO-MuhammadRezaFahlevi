package JS9;

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.merk = "Samsung";
        tv1.harga = 5000000;
        tv1.jenisLayar = "LED";
        tv1.volume = 10;
        System.out.println(tv1.getInfo());

        Kulkas kulkas1 = new Kulkas();
        kulkas1.merk = "LG";
        kulkas1.harga = 3000000;
        kulkas1.jumlahPintu = 2;
        System.out.println(kulkas1.getInfo());
    }
}