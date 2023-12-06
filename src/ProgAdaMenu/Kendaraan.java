package ProgAdaMenu;
abstract class Kendaraan {
    private String nomorPlat;
    protected String merk;
    protected String warna;
    protected int kapasitasMesin;

    public Kendaraan(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.warna = warna;
        this.kapasitasMesin = kapasitasMesin;
    }

    public abstract void masuk();

    public abstract void keluar();

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

    @Override
    public String toString() {
        return "\nNomor plat: " + nomorPlat + "\nmerk: " + merk + "\nwarna: " + warna + "\nkapasitas Mesin: " + kapasitasMesin;
    }
}
