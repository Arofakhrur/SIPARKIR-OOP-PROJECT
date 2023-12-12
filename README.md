Package dan Main Class: File utama program ini terdapat dalam kelas App di package ProgGakadaMenu. Kode utama untuk simulasi tempat parkir ada di sini.

Parent Class - Kendaraan :
Kelas Kendaraan adalah kelas abstrak yang menjadi induk dari kelas Mobil dan Motor. Ini mendefinisikan atribut dan metode umum seperti nomor plat, merk, warna, dan kapasitas mesin.
Method-method pada kelas Kendaraan seperti getNomorPlat(), getMerk(), getWarna(), dan getKapasitasMesin() berfungsi sebagai accessor (getter) untuk mendapatkan nilai atribut dari luar kelas.

Kelas Mobil (Mobil) :
Kelas Mobil adalah subkelas dari Kendaraan.
Metode masuk() dan keluar() di-overwrite untuk memberikan aksi spesifik yang terjadi saat mobil masuk dan keluar dari tempat parkir.
Kelas ini memiliki metode accessor tambahan getkapasitasMesin(), namun tampaknya memiliki atribut kapasitasMesin yang tidak terpakai karena sudah di-handle oleh kelas induk.

Kelas Motor (Motor) :
Kelas Motor juga adalah subkelas dari Kendaraan.
Metode masuk() dan keluar() di-overwrite dengan aksi spesifik saat motor masuk dan keluar dari tempat parkir.
Hanya memiliki satu metode accessor getKapasitasMesin() yang relevan dengan atributnya.
Kelas ParkingLot:

Kelas ini merepresentasikan tempat parkir dengan batasan kapasitas tertentu.
Memiliki array vehicles yang menyimpan objek kendaraan yang terparkir.
Metode addVehicle() untuk menambahkan kendaraan ke tempat parkir.
Metode removeVehicle() untuk menghapus kendaraan berdasarkan nomor plat.
Metode showVehicles() untuk menampilkan kendaraan yang terparkir.
Penting untuk dicatat: Terdapat beberapa kebingungan dalam penggunaan atribut merk dan warna yang di-declare kembali di kelas turunan (Mobil dan Motor). Kedua atribut ini sebenarnya sudah ada di kelas induk Kendaraan. Penggunaan ulang atribut yang sama pada kelas turunan dapat mengakibatkan konfusi atau ketidaksesuaian data.

Saran untuk perbaikan :
Sebaiknya, gunakan atribut merk dan warna yang sudah ada dari kelas induk Kendaraan pada kelas turunan Mobil dan Motor.
Pastikan semua metode dan atribut yang ada di kelas turunan relevan dan konsisten dengan kebutuhan kelas tersebut.