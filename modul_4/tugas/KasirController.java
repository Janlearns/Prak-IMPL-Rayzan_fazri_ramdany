public class KasirController {
    private Barang model;
    private KasirView view;

    public KasirController(Barang model, KasirView view) {
        this.model = model;
        this.view = view;
    }

    public void setNamaBarang(String nama) {
        model.setNama(nama);
    }

    public String getNamaBarang() {
        return model.getNama();
    }

    public void setHargaBarang(int harga) {
        model.setHarga(harga);
    }

    public int getHargaBarang() {
        return model.getHarga();
    }

    public void setStokBarang(int stok) {
        model.setStok(stok);
    }

    public int getStokBarang() {
        return model.getStok();
    }

    public void updateView() {
        view.printInfoBarang(model.getNama(), model.getHarga(), model.getStok());
    }

    public void prosesPembelian(int jumlahBeli) {
        int stokSaatIni = model.getStok();
        model.setStok(stokSaatIni - jumlahBeli);
        view.printInfoPembayaran(jumlahBeli * model.getHarga());
    }
}