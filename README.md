# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kendaraan`, `Motor`,`Mobil`,`Bus`, dan `Main` adalah contoh dari class.

```bash
public class Kendaraan {
    ...
}

public class Motor extends Kendaraan {
    ...
}

public class Mobil extends Kendaraan {
    ...
}

public class Bus extends Kendaraan {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Mobil toyota2021 = new Mobil("Toyota", 2021, 4);` adalah salah satu contoh pembuatan object pada class `Mobil``.

```bash
Mobil toyota2021 = new Mobil("Toyota", 2021, 4);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `jumlahPintu` adalah contoh atribut pada class `Mobil`.

```bash
  private int jumlahPintu;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil` .

```bash
    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun); 
        this.jumlahPintu = jumlahPintu;
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJumlahPintu adalah contoh method mutator pada class `Mobil`.

```bash
public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJumahPintu` adalah contoh method accessor pada class `Mobil`.

```bash
public int getJumlahPintu() {
        return jumlahPintu;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk` dan `tahun` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String merk;
 private int tahun;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Mobil` mewarisi `Kendaraan` dengan sintaks `extends`.

```bash
public class Mobil extends Kendaraan  {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo` di `Mobil` merupakan override dari method `tampilkanInfo` di `Kendaraan`.

```bash
@Override
    public void tampilkanInfo() {
        System.out.println("Mobil - Merk: " + getMerk() + ", Tahun: " + getTahun() + ", Jumlah Pintu: " + jumlahPintu);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch-case`.

```bash
 switch (pilihan) {
                case 1:
                    // Menambahkan mobil
                    System.out.print("Masukkan merk mobil: ");
                    String merkMobil = scanner.nextLine();
                    System.out.print("Masukkan tahun mobil: ");
                    int tahunMobil = scanner.nextInt();
                    System.out.print("Masukkan jumlah pintu mobil: ");
                    int jumlahPintu = scanner.nextInt();
                    kendaraanList.add(new Mobil(merkMobil, tahunMobil, jumlahPintu));
                    break;
                case 2:
                    // Menambahkan motor
                    System.out.print("Masukkan merk motor: ");
                    String merkMotor = scanner.nextLine();
                    System.out.print("Masukkan tahun motor: ");
                    int tahunMotor = scanner.nextInt();
                    scanner.nextLine();  // Membersihkan buffer
                    System.out.print("Masukkan tipe mesin motor: ");
                    String tipeMesin = scanner.nextLine();
                    kendaraanList.add(new Motor(merkMotor, tahunMotor, tipeMesin));
                    break;
                case 3:
                    // Menambahkan bus
                    System.out.print("Masukkan merk bus: ");
                    String merkBus = scanner.nextLine();
                    System.out.print("Masukkan tahun bus: ");
                    int tahunBus = scanner.nextInt();
                    System.out.print("Masukkan kapasitas penumpang bus: ");
                    int kapasitasPenumpang = scanner.nextInt();
                    kendaraanList.add(new Bus(merkBus, tahunBus, kapasitasPenumpang));
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do - while`  untuk menampilkan menu dan meminta input pengguna hingga pengguna memilih untuk keluar.

```bash
do {
    // Menampilkan menu dan meminta input pengguna
    // ...
} while (pilihan != 0);


```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan variabel `merkMobil` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan merk mobil: ");
String merkMobil = scanner.nextLine();
System.out.print("Masukkan tahun mobil: ");
int tahunMobil = scanner.nextInt();
System.out.print("Masukkan jumlah pintu mobil: ");
int jumlahPintu = scanner.nextInt();
kendaraanList.add(new Mobil(merkMobil, tahunMobil, jumlahPintu));

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `String[] daftarKendaraan = new String[3];
` adalah contoh penggunaan array.

```bash
String[] daftarKendaraan = new String[3];

```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
                System.out.println("\nPilih jenis kendaraan untuk ditambahkan:");
                System.out.println("1. Mobil");
                System.out.println("2. Motor");
                System.out.println("3. Bus");
                System.out.println("0. Keluar");
                System.out.print("Pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();  // Membersihkan buffer

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan merk mobil: ");
                        String merkMobil = scanner.nextLine();
                        System.out.print("Masukkan tahun mobil: ");
                        int tahunMobil = scanner.nextInt();
                        System.out.print("Masukkan jumlah pintu mobil: ");
                        int jumlahPintu = scanner.nextInt();
                        scanner.nextLine();  // Membersihkan buffer
                        kendaraanList.add(new Mobil(merkMobil, tahunMobil, jumlahPintu));
                        break;
                    case 2:
                        System.out.print("Masukkan merk motor: ");
                        String merkMotor = scanner.nextLine();
                        System.out.print("Masukkan tahun motor: ");
                        int tahunMotor = scanner.nextInt();
                        scanner.nextLine();  // Membersihkan buffer
                        System.out.print("Masukkan tipe mesin motor: ");
                        String tipeMesin = scanner.nextLine();
                        kendaraanList.add(new Motor(merkMotor, tahunMotor, tipeMesin));
                        break;
                    case 3:
                        System.out.print("Masukkan merk bus: ");
                        String merkBus = scanner.nextLine();
                        System.out.print("Masukkan tahun bus: ");
                        int tahunBus = scanner.nextInt();
                        System.out.print("Masukkan kapasitas penumpang bus: ");
                        int kapasitasPenumpang = scanner.nextInt();
                        scanner.nextLine();  // Membersihkan buffer
                        kendaraanList.add(new Bus(merkBus, tahunBus, kapasitasPenumpang));
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }

                if (pilihan != 0) {
                    System.out.println("\nApakah Anda ingin melihat semua data kendaraan?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    System.out.print("Pilihan: ");
                    int lihatData = scanner.nextInt();
                    scanner.nextLine();  // Membersihkan buffer
                    if (lihatData == 1) {
                        System.out.println("\nData Kendaraan:");
                        for (Kendaraan k : kendaraanList) {
                            k.tampilkanInfo();
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Harap masukkan angka yang sesuai.");
                scanner.nextLine(); // Membersihkan buffer input yang salah
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M. Al-fiannor Khalily H.M
NPM: 2210010229
Kelas  : TI 4A Reg Pagi BJM
