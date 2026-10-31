package soal2;

public class Sepeda {
    // Atribut private
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;
    
    // Constructor
    public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    // Metode untuk menghitung total biaya sewa
    public double hitungHarga() {
        return lamaSewa * hargaPerJam;
    }

    // Metode tampil data
    public void tampilData() {
        System.out.println("Kode Sepeda     : " + kodeSepeda);
        System.out.println("Jenis Sepeda    : " + jenisSepeda);
        System.out.println("Lama Sewa       : " + lamaSewa + " Jam");
        System.out.println("Harga/Jam       : Rp. " + hargaPerJam);
        System.out.println("Total Biaya   : Rp " + hitungHarga());
    }
}