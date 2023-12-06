package ProgAdaMenu;
class Motor extends Kendaraan {

    public Motor(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        super(nomorPlat, merk, warna, kapasitasMesin);
    }

    @Override
    public void masuk() {
        System.out.println("\nMotor dengan nomor plat " + getNomorPlat() + " \nmasuk ke tempat parkir.");
    }

    @Override
    public void keluar() {
        System.out.println("\nMotor dengan nomor plat " + getNomorPlat() + " \nkeluar dari tempat parkir.");
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // @Override
    // public String toString() {
    // return super.toString() + "\nKapasitas mesin: " + kapasitasMesin;
    // }
}
