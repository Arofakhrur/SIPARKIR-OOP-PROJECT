package ProgAdaMenu;
class ParkingLot {
    private Kendaraan[] vehicles;
    private int capacity;
    private int occupiedSlots;

    public ParkingLot(int capacity) {
        this.vehicles = new Kendaraan[capacity];
        this.capacity = capacity;
        this.occupiedSlots = 0;
    }

    public void addVehicle(Kendaraan vehicle) {
        if (occupiedSlots == capacity) {
            System.out.println("\nTempat parkir penuh.");
        }

        vehicles[occupiedSlots++] = vehicle;
        System.out.println("\nKendaraan " + vehicle + " \nditambahkan ke tempat parkir.");
    }

    public void removeVehicle(String licensePlate) {
        for (int i = 0; i < occupiedSlots; i++) {
            if (vehicles[i].getNomorPlat().equals(licensePlate)) {
                vehicles[i] = null;
                occupiedSlots--;

                for (int j = i; j < occupiedSlots; j++) {
                    vehicles[j] = vehicles[j + 1];
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

    public void showVehicles() {
        if (occupiedSlots == 0) {
            System.out.println("\nTempat parkir kosong.");
        } else {
            System.out.println("\nKendaraan yang terparkir:");

            for (int i = 0; i < occupiedSlots; i++) {
                System.out.println(vehicles[i]);
            }
        }
    }
}
