package ProgAdaMenu;

//Parent Class-Kendaraan
// Kelas Kendaraan adalah kelas abstrak yang menjadi induk dari kelas Mobil dan Motor

//Method-method pada kelas Kendaraan seperti getNomorPlat(), getMerk(), getWarna(), dan getKapasitasMesin() berfungsi sebagai accessor (getter) untuk mendapatkan nilai atribut dari luar kelas.
abstract class Kendaraan {
    // Atribut-atribut yang digunakan oleh kelas turunan
    private String nomorPlat;
    protected String merk;
    protected String warna;
    protected int kapasitasMesin;

    // Konstruktor untuk inisialisasi nilai atribut
    public Kendaraan(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.warna = warna;
        this.kapasitasMesin = kapasitasMesin;
    }

    // Method abstrak yang akan diimplementasikan di kelas turunan
    public abstract void masuk();

    public abstract void keluar();

    // Getter untuk mendapatkan nilai atribut dari luar kelas
    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // Representasi string dari objek Kendaraan
    @Override
    public String toString() {
        return "\nNomor plat: " + nomorPlat + "\nmerk: " + merk + "\nwarna: " + warna + "\nkapasitas Mesin: "
                + kapasitasMesin;
    }
}
