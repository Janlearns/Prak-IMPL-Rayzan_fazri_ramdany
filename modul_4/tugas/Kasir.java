import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        // Membuat objek Model
        Barang model = retriveBarangFromDatabase();

        // Membuat objek View
        KasirView view = new KasirView();

        // Membuat objek Controller
        KasirController controller = new KasirController(model, view);

        // Menampilkan data awal
        System.out.println("--- Informasi Awal Barang ---");
        controller.updateView();
        System.out.println("-----------------------------");

        // Simulasi transaksi
        Scanner in = new Scanner(System.in);
        System.out.println("\n--- Transaksi Pembelian ---");
        System.out.print("Jumlah barang : ");
        int qty = in.nextInt();
        controller.prosesPembelian(qty);
        System.out.println("---------------------------");

        // Menampilkan data setelah transaksi
        System.out.println("\n--- Informasi Barang Setelah Transaksi ---");
        controller.updateView();
        System.out.println("------------------------------------------");
    }

    private static Barang retriveBarangFromDatabase() {
        Barang barang = new Barang();
        barang.setNama("GeForce GTX 1060Ti");
        barang.setHarga(3000);
        barang.setStok(10);
        return barang;
    }
}
