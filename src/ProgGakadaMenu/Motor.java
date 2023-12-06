package ProgGakadaMenu;

class Motor extends Kendaraan {
    protected int kapasitasMesin;

    public Motor(String nomorPlat, int kapasitasMesin) {
        super(nomorPlat);
        this.kapasitasMesin = kapasitasMesin;
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

    @Override
    public String toString() {
        return super.toString() + "\nKapasitas mesin: " + kapasitasMesin;
    }
}