package ProgAdaMenu;

// Import library BufferedReader untuk menerima input dari pengguna
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Mendefinisikan kelas utama App
public class App {
    // Method utama main yang melemparkan IOException
    public static void main(String[] args) throws IOException {
        
        // Membuat objek BufferedReader untuk input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Membuat objek ParkingLot dengan kapasitas 5
        ParkingLot parkiran = new ParkingLot(5);

        // Inisialisasi variabel boolean untuk kontrol loop
        boolean exit = false;

        // Loop utama program
        while (!exit) {
            // Menampilkan menu kepada pengguna
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Hapus Kendaraan");
            System.out.println("3. Tampilkan Kendaraan");
            System.out.println("4. Keluar");

            try {
                // Meminta pengguna untuk memilih menu (1-4)
                System.out.print("Pilih menu (1-4): ");
                int pilihan = Integer.parseInt(reader.readLine());

                // Switch case untuk menangani pilihan pengguna
                switch (pilihan) {
                    // Kasus 1: Menambahkan kendaraan
                    case 1:
                        tambahKendaraan(reader, parkiran);
                        break;
                    // Kasus 2: Menghapus kendaraan
                    case 2:
                        System.out.print("Masukkan nomor plat kendaraan yang ingin dihapus: ");
                        String nomorPlat = reader.readLine();
                        parkiran.removeVehicle(nomorPlat);
                        break;
                    // Kasus 3: Menampilkan kendaraan
                    case 3:
                        parkiran.showVehicles();
                        break;
                    // Kasus 4: Keluar dari program
                    case 4:
                        exit = true;
                        break;
                    // Default: Menangani masukan yang tidak valid
                    default:
                        System.out.println("Masukkan tidak valid.");
                        break;
                }
            } catch (NumberFormatException e) {
                // Menangani pengecualian jika input bukan angka (1-4)
                System.out.println("Masukkan tidak valid. Harap masukkan angka (1-4).");
            }
        }
        // Menutup objek BufferedReader setelah selesai menggunakan program
        reader.close();
    }

    // Method untuk menambahkan kendaraan ke dalam parkiran
    public static void tambahKendaraan(BufferedReader reader, ParkingLot parkiran) throws IOException {
        // Meminta pengguna memasukkan jenis kendaraan, nomor plat, merk, dan warna
        System.out.print("Jenis kendaraan (1. Mobil / 2. Motor): ");
        int jenis = Integer.parseInt(reader.readLine());

        System.out.print("Nomor plat: ");
        String nomorPlat = reader.readLine();

        System.out.print("Merk: ");
        String merk = reader.readLine();

        System.out.print("Warna: ");
        String warna = reader.readLine();

        // Memeriksa jenis kendaraan yang dimasukkan dan menambahkan data kendaraan sesuai dengan jenisnya
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
            // Menampilkan pesan jika pilihan jenis kendaraan tidak valid
            System.out.println("Pilihan salah.");
        }
    }
}
