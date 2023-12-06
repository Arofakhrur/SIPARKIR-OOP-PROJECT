package ProgAdaMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ParkingLot parkiran = new ParkingLot(5);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Hapus Kendaraan");
            System.out.println("3. Tampilkan Kendaraan");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            int pilihan = Integer.parseInt(reader.readLine());

            switch (pilihan) {
                case 1:
                    tambahKendaraan(reader, parkiran);
                    break;
                case 2:
                    System.out.print("Masukkan nomor plat kendaraan yang ingin dihapus: ");
                    String nomorPlat = reader.readLine();
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
        reader.close();
    }

    public static void tambahKendaraan(BufferedReader reader, ParkingLot parkiran) throws IOException {
        System.out.print("Jenis kendaraan (1. Mobil / 2. Motor): ");
        int jenis = Integer.parseInt(reader.readLine());

        System.out.print("Nomor plat: ");
        String nomorPlat = reader.readLine();

        System.out.print("Merk: ");
        String merk = reader.readLine();

        System.out.print("Warna: ");
        String warna = reader.readLine();

        if (jenis == 1 || jenis == 2) {
            System.out.print("Kapasitas mesin: ");
            int kapasitasMesin = Integer.parseInt(reader.readLine());

            if (jenis == 1) {
                Kendaraan mobil = new Mobil(nomorPlat, merk, warna, kapasitasMesin);
                parkiran.addVehicle(mobil);
            } else {
                Kendaraan motor = new Motor(nomorPlat, merk, warna, kapasitasMesin);
                parkiran.addVehicle(motor);
            }
        } else {
            System.out.println("Pilihan salah.");
        }
    }
}
