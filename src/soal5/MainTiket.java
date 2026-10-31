package soal5;

import java.util.ArrayList;

public class MainTiket {
    public static void main (String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        // Data Film (untuk menambahkan daftar film ke ArrayList)
        daftarTiket.add(new Tiket("F001", "Avangers: Endgame", "REGULAR", 60000, 2));

        // Melakukan interasi dan mencetak struk
        for (Tiket t : daftarTiket){
            t.tampilStruk();
        }
    }
}

class Tiket {
    private final String kode;
    private final String namaFilm;
    private final String jenis;
    private final int harga;
    private final int jumlah;

    Tiket(String kode, String namaFilm, String jenis, int harga, int jumlah) {
        this.kode = kode;
        this.namaFilm = namaFilm;
        this.jenis = jenis;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    void tampilStruk() {
        System.out.println("Kode tiket: " + kode);
        System.out.println("Nama film: " + namaFilm);
        System.out.println("Jenis tiket: " + jenis);
        System.out.println("Jumlah tiket: " + jumlah);
        System.out.println("Total harga: " + (harga * jumlah));
    }
}