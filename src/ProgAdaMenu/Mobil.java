package ProgAdaMenu;
class Mobil extends Kendaraan {

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

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // @Override
    // public String toString() {
    //     return super.toString() + "\nMerk: " + merk + "\nWarna: " + warna;
    // }
}
