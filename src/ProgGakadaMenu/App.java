package ProgGakadaMenu;

public class App {
    public static void main(String[] args) {
        // Membuat objek parkiran dengan kapasitas 5
        ParkingLot parkiran = new ParkingLot(5);

        // Membuat beberapa kendaraan
        Kendaraan mobil1 = new Mobil("B 1234 CD", "Toyota", "Merah");
        Kendaraan mobil2 = new Mobil("B 5678 FG", "Honda", "Biru");
        Kendaraan motor1 = new Motor("N 5678 EF", 150);
        Kendaraan motor2 = new Motor("BL 5128 GAB", 125);

        // Memasukkan kendaraan ke tempat parkir
        parkiran.addVehicle(mobil1);
        parkiran.addVehicle(mobil2);
        parkiran.addVehicle(motor1);
        parkiran.addVehicle(motor2);

        // Menampilkan kendaraan yang terparkir
        parkiran.showVehicles();

        // Menghapus kendaraan dari tempat parkir
        parkiran.removeVehicle("B 1234 CD");

        // Menampilkan kendaraan setelah penghapusan
        parkiran.showVehicles();
    }
}

abstract class Kendaraan {
    private String nomorPlat;

    public Kendaraan(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public abstract void masuk();

    public abstract void keluar();

    public String getNomorPlat() {
        return nomorPlat;
    }

    @Override
    public String toString() {
        return "\nNomor plat: " + nomorPlat;
    }
}
