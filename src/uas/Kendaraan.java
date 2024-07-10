
package uas;


public class Kendaraan {
    // Atribut
    private String merk;
    private int tahun;

    // Constructor
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Accessor (Getter)
    public String getMerk() {
        return merk;
    }

    // Accessor (Getter)
    public int getTahun() {
        return tahun;
    }

    // Mutator (Setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Mutator (Setter)
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Polymorphism (Method Overriding)
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    }
}

