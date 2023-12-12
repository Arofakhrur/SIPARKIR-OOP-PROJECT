package ProgGakadaMenu;

public class App {
    public static void main(String[] args) {
        // Membuat objek parkiran dengan 5 slot kapasitas 
        ParkingLot parkiran = new ParkingLot(5);

        // Constructor Membuat beberapa kendaraan
        Kendaraan mobil1 = new Mobil("B 1234 CD", "Toyota", "Merah", 2500);
        Kendaraan mobil2 = new Mobil("B 5678 FG", "Honda", "Biru", 3000);

        Kendaraan motor1 = new Motor("Bl 1234 LO", "yamaha", "Hitam", 250);
        Kendaraan motor2 = new Motor("Bl 5678 IO", "Biru", "Putih", 250);

        // Memasukkan kendaraan ke tempat parkir
        parkiran.addVehicle(mobil1);
        parkiran.addVehicle(mobil2);
        parkiran.addVehicle(motor1);
        parkiran.addVehicle(motor2);

        // Menampilkan kendaraan yang terparkir
        System.out.println("┌───────────────────────────────┐");
        System.out.println("│    KENDARAN YANG TERPARKIR    │");
        System.out.println("└───────────────────────────────┘");
        parkiran.showVehicles();

        // Menghapus kendaraan dari tempat parkir
        parkiran.removeVehicle("B 1234 CD");

        System.out.println("┌──────────────────────────────────┐");
        System.out.println("│    UPDATE KENDARAAN TERPARKIR    │");
        System.out.println("└──────────────────────────────────┘");
        // Menampilkan kendaraan setelah penghapusan
        parkiran.showVehicles();
    }
}
