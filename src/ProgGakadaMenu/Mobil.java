package ProgGakadaMenu;

// Kelas Mobil adalah subkelas dari Kendaraan.
class Mobil extends Kendaraan {
    protected String merk;
    protected String warna;

    public Mobil(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        super(nomorPlat, merk, warna, kapasitasMesin);
    }

    @Override
    public void masuk() {
        System.out.println("Mobil dengan nomor plat " + getNomorPlat() + " masuk ke tempat parkir.");
    }

    @Override
    public void keluar() {
        System.out.println("Mobil dengan nomor plat " + getNomorPlat() + " keluar dari tempat parkir.");
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getkapasitasMesin() {
        return kapasitasMesin;
    }

}
