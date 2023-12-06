package ProgAdaMenu;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingLot parkiran = new ParkingLot(5);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Hapus Kendaraan");
            System.out.println("3. Tampilkan Kendaraan");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Handling newline

            switch (pilihan) {
                case 1:
                    tambahKendaraan(scanner, parkiran);
                    break;
                case 2:
                    System.out.print("Masukkan nomor plat kendaraan yang ingin dihapus: ");
                    String nomorPlat = scanner.nextLine();
                    parkiran.removeVehicle(nomorPlat);
                    break;
                case 3:
                    parkiran.showVehicles();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Masukkan tidak valid.");
                    break;
            }
        }
        scanner.close();
    }

    public static void tambahKendaraan(Scanner scanner, ParkingLot parkiran) {
        System.out.print("Jenis kendaraan (1. Mobil / 2. Motor): ");
        int jenis = scanner.nextInt();
        scanner.nextLine(); // Handling newline

        System.out.print("Nomor plat: ");
        String nomorPlat = scanner.nextLine();

        System.out.print("Merk: ");
        String merk = scanner.nextLine();

        System.out.print("Warna: ");
        String warna = scanner.nextLine();

        if (jenis == 1) {
            System.out.print("Kapasitas mesin: ");
            int kapasitasMesin = scanner.nextInt();
            scanner.nextLine(); // Handling newline

            Kendaraan mobil = new Mobil(nomorPlat, merk, warna, kapasitasMesin);
            parkiran.addVehicle(mobil);
        } else if (jenis == 2) {
            System.out.print("Kapasitas mesin: ");
            int kapasitasMesin = scanner.nextInt();
            scanner.nextLine(); // Handling newline

            Kendaraan motor = new Motor(nomorPlat, merk, warna, kapasitasMesin);
            parkiran.addVehicle(motor);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
