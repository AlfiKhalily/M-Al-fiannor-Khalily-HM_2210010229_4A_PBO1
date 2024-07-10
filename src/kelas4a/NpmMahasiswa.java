
package kelas4a;
 //mengimpor kelas Scanner dari paket java.util
import java.util.Scanner;
public class NpmMahasiswa {

    private String npm;

    // Konstruktor InputNpm yang menerima parameter npm
    public NpmMahasiswa(String npm) {
        // Memastikan bahwa npm tidak null dan memiliki panjang tepat 10 karakter
        if (npm == null || npm.length() != 10) {
            throw new IllegalArgumentException("NPM harus memiliki panjang tepat 10 karakter.");
        }
        // Memastikan bahwa npm hanya terdiri dari angka
        if (!npm.matches("\\d+")) {
            throw new IllegalArgumentException("NPM harus hanya terdiri dari angka.");
        }
        this.npm = npm;  // Menyimpan nilai npm
    }

    // Metode untuk memparsing NPM
    public void parseNPM() {
        // Ambil 2 huruf awal dan konversi menjadi tahun masuk
        String tahunMasukStr = npm.substring(0, 2);
        int tahunMasuk = Integer.parseInt(tahunMasukStr);
        System.out.println("Tahun Masuk = " + (2000 + tahunMasuk));

        // Ambil angka ke-3 dan ke-4 untuk kode fakultas
        String kodeFakultasStr = npm.substring(2, 4);
        int kodeFakultas = Integer.parseInt(kodeFakultasStr);
        if (kodeFakultas == 10) {
            System.out.println("Kode Fakultas = Teknologi Informasi");
        } else {
            System.out.println("Kode Fakultas = Tidak dikenal");
        }

        // Ambil angka ke-5 dan ke-6 untuk kode program studi
        String kodeProdiStr = npm.substring(4, 6);
        int kodeProdi = Integer.parseInt(kodeProdiStr);
        switch (kodeProdi) {
            case 1:
                System.out.println("Nama Prodi = Teknologi Informatika");
                break;
            case 2:
                System.out.println("Nama Prodi = Sistem Informasi");
                break;
            default:
                System.out.println("Nama Prodi = Tidak dikenal");
                break;
        }

        // Ambil 4 angka terakhir untuk urutan masuk
        String urutanMasuk = npm.substring(6);
        System.out.println("Urutan Masuk = " + urutanMasuk);
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();
        try {
            // Memastikan bahwa npm memiliki panjang tepat 10 karakter
            if (npm.length() != 10) {
                throw new IllegalArgumentException("Error: NPM harus memiliki panjang tepat 10 karakter.");
            }
            // Memastikan bahwa npm hanya terdiri dari angka
            if (!npm.matches("\\d+")) {
                throw new IllegalArgumentException("Error: NPM harus hanya terdiri dari angka.");
            }
            // Membuat objek InputNpm dan memparsing NPM
            NpmMahasiswa parser = new NpmMahasiswa(npm);
            parser.parseNPM();
        } catch (IllegalArgumentException e) {
            // Menampilkan pesan error jika terjadi kesalahan
            System.out.println(e.getMessage());
        }
    }
}

