package pertemuan1;

import java.util.Scanner;

public class BioDataDiri {

    public static void main(String[] args) {
        // Deklarasi variabel
        String nama, nim, kelas, prodi, fakultas;

        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = scanner.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = scanner.nextLine();
        System.out.print("Masukkan Program Studi: ");
        prodi = scanner.nextLine();
        System.out.print("Masukkan Fakultas: ");
        fakultas = scanner.nextLine();

        // Output data diri
        System.out.println("\nBiodata Diri");
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Kelas     : " + kelas);
        System.out.println("Prodi     : " + prodi);
        System.out.println("Fakultas  : " + fakultas);

        // Menutup scanner
        scanner.close();
    }
}
