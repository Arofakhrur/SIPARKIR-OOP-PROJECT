Keterhubungan antar class pada program tersebut :

- Class App berhubungan dengan class ParkingLot karena class App menggunakan object     ParkingLot untuk melakukan operasi-operasi terkait tempat parkir, seperti menambah, menghapus, dan menampilkan kendaraan.
- Class Kendaraan berhubungan dengan class Mobil dan class Motor karena class Mobil dan class Motor merupakan turunan dari class Kendaraan.

Method yang dipakai:

- Enkapsulasi{membungkus data dalam satu unit}:
1. Class Kendaraan memiliki atribut-atribut yang dideklarasikan sebagai private, sehingga hanya dapat diakses oleh method-method yang ada di dalam class Kendaraan.
2. Class ParkingLot memiliki atribut vehicles yang dideklarasikan sebagai private, sehingga hanya dapat diakses oleh method-method yang ada di dalam class ParkingLot.

- Polimorfisme{ method yang sama tetapi memiliki atribut berbeda}:
1. Class Mobil dan class Motor merupakan turunan dari class Kendaraan. Class Mobil dan class Motor memiliki method abstrak masuk() dan keluar() yang diimplementasikan secara berbeda di masing-masing kelas.

- Inheritance {Proses pewarisan data dan method dari suatu class yang telah ada kepada suaty class baru}:
1. Class Mobil dan class Motor merupakan turunan dari class Kendaraan. Class turunan mewarisi atribut dan method dari class induk.

- Abstraks {Kelas yang terletak di posisi tertinggi hierarki class}:
1. Class Kendaraan merupakan kelas abstrak. Class abstrak adalah kelas yang tidak dapat diinstansiasi. Class abstrak digunakan untuk mendefinisikan konsep umum dari suatu objek, dan kemudian konsep tersebut diimplementasikan di kelas turunannya.

Access modifier yang dipakai:

- Access modifier private :
1. Atribut-atribut di dalam class Kendaraan dideklarasikan sebagai private, sehingga hanya dapat diakses oleh method-method yang ada di dalam class Kendaraan.

2. Atribut vehicles di dalam class ParkingLot dideklarasikan sebagai private, sehingga hanya dapat diakses oleh method-method yang ada di dalam class ParkingLot.

- Access modifier protected :
1. Atribut merk, warna, dan kapasitasMesin di dalam class Kendaraan dideklarasikan sebagai protected, sehingga dapat diakses oleh method-method yang ada di dalam class Kendaraan dan class turunannya.

- Access modifier public :
1. Method-method di dalam class Kendaraan, class Mobil, dan class Motor dideklarasikan sebagai public, sehingga dapat diakses dari luar kelas.

- Fungsi apa saja yang dipakai dalam contoh di bawah ada fungsi try - catch:
1. Fungsi try-catch digunakan untuk menangani pengecualian (exception) .
Pada program tersebut, fungsi try-catch digunakan pada method tambahKendaraan() untuk menangani pengecualian jika input yang dimasukkan oleh pengguna tidak valid.

Kelas ParkingLot:
1. Kelas ini merepresentasikan tempat parkir dengan batasan kapasitas tertentu.
Memiliki array vehicles yang menyimpan objek kendaraan yang terparkir.

Overloading : Class yang memiliki lebih dari 1 method
Accessor method : adalah metode yang digunakan untuk mengakses data objek.