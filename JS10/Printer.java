package JS10;

public class Printer {
    public void cetak(Printable printable) {
        System.out.println("Mencetak...\n" + printable.getPrintableContent());
        System.out.println("Memeriksa ketersediaan tinta");
        System.out.println("Memeriksa ketersediaan kertas");
        System.out.println("Pencetakan selesai\n");
    }
}
