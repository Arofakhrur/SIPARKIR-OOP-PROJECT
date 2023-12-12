package ProgGakadaMenu; // Mendefinisikan paket (package) tempat kelas ini berada

// Kelas Mobil adalah subkelas dari Kendaraan.
class Mobil extends Kendaraan {
    protected String merk; // Atribut merek mobil
    protected String warna; // Atribut warna mobil

    // Constructor untuk membuat objek Mobil dengan atribut dari superclass
    // Kendaraan
    public Mobil(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        super(nomorPlat, merk, warna, kapasitasMesin); // Memanggil constructor superclass
    }

    // Implementasi metode masuk() dari superclass Kendaraan
    @Override
    public void masuk() {
        System.out.println("Mobil dengan nomor plat " + getNomorPlat() + " masuk ke tempat parkir.");
    }

    // Implementasi metode keluar() dari superclass Kendaraan
    @Override
    public void keluar() {
        System.out.println("Mobil dengan nomor plat " + getNomorPlat() + " keluar dari tempat parkir.");
    }

    // Getter untuk mendapatkan nilai atribut 'merk' mobil
    public String getMerk() {
        return merk;
    }

    // Getter untuk mendapatkan nilai atribut 'warna' mobil
    public String getWarna() {
        return warna;
    }

    // Getter untuk mendapatkan nilai atribut 'kapasitasMesin' dari superclass
    // Kendaraan
    public int getkapasitasMesin() {
        return kapasitasMesin;
    }

}
