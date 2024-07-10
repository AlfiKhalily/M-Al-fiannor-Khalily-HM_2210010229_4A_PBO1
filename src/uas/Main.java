package uas;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kendaraan> kendaraanList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan = -1;

        // Menambahkan data awal
        kendaraanList.add(new Mobil("Toyota", 2021, 4));
        kendaraanList.add(new Motor("Yamaha", 2020, "150cc"));
        kendaraanList.add(new Bus("Mercedes", 2019, 50));

        while (pilihan != 0) {
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
        }

        scanner.close();
    }
}
