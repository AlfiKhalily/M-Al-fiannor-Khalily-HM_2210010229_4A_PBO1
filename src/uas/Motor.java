
package uas;


// Inheritance (Pewarisan dari kelas Kendaraan)
public class Motor extends Kendaraan {
    private String tipeMesin;

    public Motor(String merk, int tahun, String tipeMesin) {
        super(merk, tahun); // Memanggil constructor dari kelas induk (Kendaraan)
        this.tipeMesin = tipeMesin;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public void setTipeMesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Motor - Merk: " + getMerk() + ", Tahun: " + getTahun() + ", Tipe Mesin: " + tipeMesin);
    }
}
