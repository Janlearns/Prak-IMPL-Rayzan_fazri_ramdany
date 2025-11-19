public class KasirView {
    public void printInfoBarang(String nama, int harga, int stok) {
        System.out.println("Nama Barang  : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Stok Barang  : " + stok);
    }

    public void printInfoPembayaran(int totalBayar) {
        System.out.println("Jumlah Bayar : " + totalBayar);
    }
}