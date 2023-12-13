package ProgAdaMenu;

// Kelas ini merepresentasikan tempat parkir dengan batasan kapasitas tertentu.
// array vehicles yang menyimpan objek kendaraan yang terparkir.
class ParkingLot {
    private Kendaraan[] vehicles; // Array untuk menyimpan kendaraan yang terparkir
    protected int capacity; // Kapasitas maksimum tempat parkir
    protected int occupiedSlots; // Jumlah slot terisi saat ini

    // Konstruktor untuk inisialisasi objek ParkingLot dengan kapasitas tertentu
    public ParkingLot(int capacity) {
        this.vehicles = new Kendaraan[capacity];
        this.capacity = capacity;
        this.occupiedSlots = 0;
    }

    // Metode addVehicle() untuk menambahkan kendaraan ke tempat parkir.
    public void addVehicle(Kendaraan vehicle) {
        // Menampilkan pesan jika tempat parkir penuh
        if (occupiedSlots == capacity) {
            System.out.println("\nTempat parkir penuh.");
        }

        // Menambahkan kendaraan ke dalam array
        vehicles[occupiedSlots++] = vehicle;
        System.out.println("\nKendaraan " + vehicle + " \nditambahkan ke tempat parkir.");
    }

    // Metode removeVehicle() untuk menghapus kendaraan berdasarkan nomor plat.
    public void removeVehicle(String licensePlate) {
        for (int i = 0; i < occupiedSlots; i++) {
            if (vehicles[i].getNomorPlat().equals(licensePlate)) {
                vehicles[i] = null;
                occupiedSlots--;

                // Menggeser kendaraan ke depan setelah menghapus
                for (int j = i; j < occupiedSlots; j++) {
                    vehicles[j] = vehicles[j + 1];
                }

                break;
            }
        }

        // Menampilkan pesan jika tempat parkir kosong atau kendaraan dihapus
        if (occupiedSlots == 0) {
            System.out.println("\nTempat parkir kosong.");
        } else {
            System.out.println("\nKendaraan dengan nomor plat " + licensePlate + " \ndihapus dari tempat parkir.");
        }
    }

    // Metode untuk menampilkan kendaraan yang terparkir
    public void showVehicles() {
        if (occupiedSlots == 0) {
            System.out.println("\nTempat parkir kosong.");
        } else {
            System.out.println("\nKendaraan yang terparkir:");

            // Menampilkan kendaraan yang terparkir
            for (int i = 0; i < occupiedSlots; i++) {
                System.out.println(vehicles[i]);
            }
        }
    }
}
