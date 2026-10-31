package soal3;

public class Menu {
    String kodeMenu;
    String namaMenu;
    double harga;
    String katagori;

    // 1. Constructor tanpa parameter
    public Menu() {
        this.kodeMenu = "_";
        this.namaMenu = "_";
        this.harga = 0;
        this.katagori = "_";
    }

    // 2. Constructor dengan parameter
    public Menu(String kodeMenu, String namaMenu, double harga, String katagori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.katagori = katagori;
    }

    // 3.Kalkulasi hara pesanan
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }

    public void tampilMenu() {
        System.out.println("Kode    : " + kodeMenu);
        System.out.println("Nama    : " + namaMenu);
        System.out.println("Katagori: " + katagori);
        System.out.println("Harga   : " + harga);
        System.out.println("-----------------------------");
    }
}