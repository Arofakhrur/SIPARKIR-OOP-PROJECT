package ProgAdaMenu;

// Kelas Mobil adalah subkelas dari Kendaraan.
class Mobil extends Kendaraan {

    // Konstruktor untuk inisialisasi nilai atribut dari superclass Kendaraan
    public Mobil(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        super(nomorPlat, merk, warna, kapasitasMesin);
    }

    // Implementasi method abstrak masuk() dari kelas Kendaraan
    @Override
    public void masuk() {
        System.out.println("Mobil dengan nomor plat " + getNomorPlat() + " masuk ke tempat parkir.");
    }

    // Implementasi method abstrak keluar() dari kelas Kendaraan
    @Override
    public void keluar() {
        System.out.println("Mobil dengan nomor plat " + getNomorPlat() + " keluar dari tempat parkir.");
    }

    // Getter tambahan untuk mendapatkan nilai atribut merk dari luar kelas
    public String getMerk() {
        return merk;
    }

    // Getter tambahan untuk mendapatkan nilai atribut warna dari luar kelas
    public String getWarna() {
        return warna;
    }

    // Getter tambahan untuk mendapatkan nilai atribut kapasitasMesin dari luar kelas
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

}
