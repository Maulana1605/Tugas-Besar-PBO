package soal3;

public class MainMenu {

    public static void main(String[] args) {
        // Menggunakan constructor berparameter
        Menu menu1 = new Menu("M001", "Nasi Goreng", 15000, "Makanan");
       
        int jumlahPesanan = 2;
        System.out.println("=== STRUK PESANAN KAFE SYTRA ===");
        menu1.tampilMenu();
        System.out.println("Jumlah Pesanan  : " + jumlahPesanan);
        System.out.println("Total Harga     : Rp. " + menu1.hitungHarga(jumlahPesanan));
    }
}