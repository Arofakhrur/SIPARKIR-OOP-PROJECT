package ProgGakadaMenu;

// Parent Class - Kendaraan
// Kelas Kendaraan adalah kelas abstrak yang menjadi induk dari kelas Mobil dan Motor
abstract class Kendaraan {
    private String nomorPlat; // Atribut nomor plat, hanya dapat diakses di kelas ini
    protected String merk; // Atribut merk, dapat diakses di kelas ini dan turunannya
    protected String warna; // Atribut warna, dapat diakses di kelas ini dan turunannya
    protected int kapasitasMesin; // Atribut kapasitas mesin, dapat diakses di kelas ini dan turunannya

    // Constructor untuk inisialisasi atribut-atribut kelas Kendaraan
    public Kendaraan(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        this.nomorPlat = nomorPlat; // Inisialisasi nilai nomorPlat dari parameter
        this.merk = merk; // Inisialisasi nilai merk dari parameter
        this.warna = warna; // Inisialisasi nilai warna dari parameter
        this.kapasitasMesin = kapasitasMesin; // Inisialisasi nilai kapasitasMesin dari parameter
    }

    // Method untuk masuk ke kendaraan (belum diimplementasikan)
    public abstract void masuk();

    // Method untuk keluar dari kendaraan (belum diimplementasikan)
    public abstract void keluar();

    // Method untuk mendapatkan nomor plat kendaraan
    public String getNomorPlat() {
        return nomorPlat;
    }

    // Method untuk mendapatkan merek kendaraan
    public String getMerk() {
        return merk;
    }

    // Method untuk mendapatkan warna kendaraan
    public String getWarna() {
        return warna;
    }

    // Method untuk mendapatkan kapasitas mesin kendaraan
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // Method yang memberikan informasi tentang kendaraan dalam bentuk teks
    @Override
    public String toString() {
        return "\nNomor plat: " + nomorPlat + "\nmerk: " + merk +
                "\nwarna: " + warna +
                "\nkapasitas Mesin: " + kapasitasMesin;
    }
}
