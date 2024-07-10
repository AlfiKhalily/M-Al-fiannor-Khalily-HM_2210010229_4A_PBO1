 
package utspbo;


public class Elektronik extends Produk {
    private int garansi; // dalam bulan

    // Constructor
    public Elektronik(String nama, double harga, int stok, int garansi) {
        super(nama, harga, stok); // memanggil constructor dari superclass
        this.garansi = garansi;
    }

    // Accessor dan Mutator
    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    // Override method
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // memanggil metode tampilkanInfo dari superclass
        System.out.println("Garansi: " + garansi + " bulan");
    }
}


