package soal4;

import java.util.ArrayList;

public class MainPemeriksaan {
    public static  void main(String[] args) {
        // Deklarasi ArrayList
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();

        // objek pemeriksaan
        daftarPemeriksaan.add(new Pemeriksaan("P001", "Andi", "Dr.Siska", 150000));
        daftarPemeriksaan.add(new Pemeriksaan("P002", "Siti", "Dr.Santoso", 200000));
        daftarPemeriksaan.add(new Pemeriksaan("P003", "Abdul", "Dr.Yeni", 150000));

        System.out.println("=== DAFTAR ANTEAN ===");
        
        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
        }
    }
}