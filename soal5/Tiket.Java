package soal5;

public class Tiket {
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public Tiket(String kodeTiket, String namaFilm, String jenisTiket, double hargaTiket, int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    public double hitungTotal {
        return hargaTiket * jumlahTiket;
    }

    publicvoid tampilStruk() {
        System.out.println("=== STRUK PEMESANAN TIKET ===");
        System.out.println("Kode Tiket      : " + kodeTiket);
        System.out.println("Film            : " + namaFilm);
        System.out.println("Jenis Tiket     : " + jenisTiket);
        System.out.println("Harga Satuan    : Rp. " + hargaTiket);
        System.out.println("Jumlah          : " + jumlahTiket);
        System.out.println("-----------------------------");
        System.out.println("Total Bayar     : Rp. " + hitungTotal());
        System.out.println("-----------------------------");
    }
}