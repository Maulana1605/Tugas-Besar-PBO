package soal2;

public class MainSepeda {
    public static void main(String[] args){
        Sepeda sepeda1 = new Sepeda("S001", "Mountain Bike (MTB)", 3, 20000);
        Sepeda sepeda2 = new Sepeda("S002", "Road Bike", 2, 25000);

        System.out.println("=== DATA RENTAL SEPEDA ===");
        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}