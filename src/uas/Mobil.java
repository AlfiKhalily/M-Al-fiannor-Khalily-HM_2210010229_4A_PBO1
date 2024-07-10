
package uas;


// Inheritance (Pewarisan dari kelas Kendaraan)
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun); // Memanggil constructor dari kelas induk (Kendaraan)
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil - Merk: " + getMerk() + ", Tahun: " + getTahun() + ", Jumlah Pintu: " + jumlahPintu);
    }
}

