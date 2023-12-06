package ProgGakadaMenu;

class Mobil extends Kendaraan {
    protected String merk;
    protected String warna;

    public Mobil(String nomorPlat, String merk, String warna) {
        super(nomorPlat);
        this.merk = merk;
        this.warna = warna;
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

    @Override
    public String toString() {
        return super.toString() + "\nMerk: " + merk + "\nWarna: " + warna;
    }
}

