package Tugas;
import java.util.ArrayList;

public class Pesanan {
   private int idPesanan;
    private String tglPesanan;
    private ArrayList  itemPesanan;
    private double totalBayar;

    public Pesanan(int idPesanan, String tglPesanan) {
        this.idPesanan = idPesanan;
        this.tglPesanan = tglPesanan;
        this.itemPesanan = new ArrayList();
        this.totalBayar = 0;
    }

    public void tambahItem(DetailPesanan item) {
        itemPesanan.add(item);
        this.totalBayar = hitungTotal();
    }

    public double hitungTotal() {
        double total = 0;
        for (Object obj : itemPesanan) {
            DetailPesanan item = (DetailPesanan) obj;
            total += item.getSubtotal();
        }
        return total;
    }

    public int getIdPesanan() {
        return idPesanan;
    }

    public String getTglPesanan() {
        return tglPesanan;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public ArrayList getItemPesanan() {
        return itemPesanan;
    }
}
