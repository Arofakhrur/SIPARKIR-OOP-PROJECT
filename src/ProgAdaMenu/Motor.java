package ProgAdaMenu;

// Kelas Motor adalah subkelas dari Kendaraan.
class Motor extends Kendaraan {

    public Motor(String nomorPlat, String merk, String warna, int kapasitasMesin) {
        super(nomorPlat, merk, warna, kapasitasMesin);
    }

    // Metode masuk() dan keluar() di-overwrite untuk memberikan aksi spesifik yang
    // terjadi saat mobil masuk dan keluar dari tempat parkir.
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

}
