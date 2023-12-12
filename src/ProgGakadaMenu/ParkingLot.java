package ProgGakadaMenu; // Mendefinisikan paket (package) tempat kelas ini berada

class ParkingLot {
    private Kendaraan[] kendaraan; // Array untuk menyimpan kendaraan yang terparkir
    private int capacity; // Kapasitas total tempat parkir
    private int occupiedSlots; // Slot yang sudah terisi

    // Constructor untuk membuat objek ParkingLot dengan kapasitas tertentu
    public ParkingLot(int capacity) {
        this.kendaraan = new Kendaraan[capacity]; // Inisialisasi array kendaraan
        this.capacity = capacity; // Set kapasitas tempat parkir
        this.occupiedSlots = 0; // Awalnya belum ada slot yang terisi
    }

    // Fungsi untuk menambahkan kendaraan ke tempat parkir
    public void addVehicle(Kendaraan vehicle) {
        if (occupiedSlots == capacity) {
            System.out.println("\nTempat parkir penuh.");
            return;
        }

        kendaraan[occupiedSlots++] = vehicle; // Tambahkan kendaraan ke array
        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println("Kendaraan " + vehicle + " \nditambahkan ke tempat parkir.");
        System.out.println("└───────────────────────────────────────────────────────────┘");
    }

    // Fungsi untuk menghapus kendaraan dari tempat parkir berdasarkan nomor plat
    public void removeVehicle(String licensePlate) {
        for (int i = 0; i < occupiedSlots; i++) {
            if (kendaraan[i].getNomorPlat().equals(licensePlate)) {
                kendaraan[i] = null; // Hapus kendaraan dari slot
                occupiedSlots--;

                for (int j = i; j < occupiedSlots; j++) {
                    kendaraan[j] = kendaraan[j + 1]; // Geser kendaraan ke posisi yang tepat setelah penghapusan
                }

                break;
            }
        }

        if (occupiedSlots == 0) {
            System.out.println("\nTempat parkir kosong.");
        } else {
            System.out.println("\nKendaraan dengan nomor plat " + licensePlate + " \ndihapus dari tempat parkir.");
        }
    }

    // Fungsi untuk menampilkan kendaraan yang terparkir
    public void showVehicles() {
        if (occupiedSlots == 0) {
            System.out.println("\nTempat parkir kosong.");
        } else {
            System.out.println("\nKendaraan yang terparkir:");

            for (int i = 0; i < occupiedSlots; i++) {
                System.out.println(kendaraan[i]); // Tampilkan informasi kendaraan
            }
        }
    }
}
