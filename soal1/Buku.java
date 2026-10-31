package soal1;

public class Buku {
    // Atribut
    String kodeBuku;
    String judul;
    String penulisan;
    double harga;

    // Constructor
    public Buku(String kodeBuku, String judul, String penulisan, double harga) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulisan = penulisan;
        this.harga = harga;
    }

    // Metode tampilan data
    public void tampilData() {
        System.out.println("Kode Buku   : " + kodeBuku);
        System.out.println("Judul       : " + judul);
        System.out.println("Penulisan   : " + penulisan);
        System.out.println("Harga       : Rp.  " + harga);
        System.out.println("---------------------------------");
    }
}