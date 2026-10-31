package soal1;

public class MainBuku {
    public static void main(String[] args) {
        // Instansiasi objek buku
        Buku buku1 = new Buku("B001", "The Elements of User Experience", "Jesse James Garrett", 135000);
        Buku buku2 = new Buku("B002", "Otodidak Web Programming: Membuat Web Application dari Nol sampai Jadi", "Muhammad Ibnu Sa`ad", 99000);
        Buku buku3 = new Buku("B003", "Responsive Web Design with HTML5 and CSS3", "Ben Frain", 120000);

        System.out.println("=== DATA INVENTARIS BUKU ===");
        buku1.tampilData();
        buku2.tampilData();
        buku3.tampilData();
    }
}