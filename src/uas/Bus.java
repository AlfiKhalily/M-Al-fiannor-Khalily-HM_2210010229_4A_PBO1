
package uas;


// Inheritance (Pewarisan dari kelas Kendaraan)
public class Bus extends Kendaraan {
    private int kapasitasPenumpang;

    public Bus(String merk, int tahun, int kapasitasPenumpang) {
        super(merk, tahun); // Memanggil constructor dari kelas induk (Kendaraan)
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Bus - Merk: " + getMerk() + ", Tahun: " + getTahun() + ", Kapasitas Penumpang: " + kapasitasPenumpang);
    }
}


