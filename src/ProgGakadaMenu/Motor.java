package ProgGakadaMenu; // Mendefinisikan paket (package) tempat kelas ini berada

// Kelas Motor adalah subkelas dari Kendaraan.
class Motor extends Kendaraan {
    // Constructor untuk membuat objek Motor dengan atribut dari superclass
    // Kendaraan
    public Motor(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        super(nomorPlat, merk, warna, kapasitasMesin); // Memanggil constructor superclass
    }

    // Implementasi metode masuk() dari superclass Kendaraan
    @Override
    public void masuk() {
        System.out.println("\nMotor dengan nomor plat " + getNomorPlat() + " \nmasuk ke tempat parkir.");
    }

    // Implementasi metode keluar() dari superclass Kendaraan
    @Override
    public void keluar() {
        System.out.println("\nMotor dengan nomor plat " + getNomorPlat() + " \nkeluar dari tempat parkir.");
    }

    // Getter untuk mendapatkan nilai atribut 'kapasitasMesin' dari superclass
    // Kendaraan
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // Override metode toString untuk memberikan informasi tambahan tentang Motor
    @Override
    public String toString() {
        return super.toString() + "\nKapasitas mesin: " + kapasitasMesin;
    }
}
