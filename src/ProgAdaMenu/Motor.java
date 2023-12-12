package ProgAdaMenu;

// Kelas Motor adalah subkelas dari Kendaraan.
class Motor extends Kendaraan {

    // Konstruktor untuk inisialisasi nilai atribut dari superclass Kendaraan
    public Motor(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        super(nomorPlat, merk, warna, kapasitasMesin);
    }

    // Implementasi method abstrak masuk() dari kelas Kendaraan
    @Override
    public void masuk() {
        System.out.println("\nMotor dengan nomor plat " + getNomorPlat() + " \nmasuk ke tempat parkir.");
    }

    // Implementasi method abstrak keluar() dari kelas Kendaraan
    @Override
    public void keluar() {
        System.out.println("\nMotor dengan nomor plat " + getNomorPlat() + " \nkeluar dari tempat parkir.");
    }

    // Getter tambahan untuk mendapatkan nilai atribut kapasitasMesin dari luar kelas
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

}
