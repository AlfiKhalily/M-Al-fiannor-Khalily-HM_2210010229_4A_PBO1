
package utspbo;


public class Main {
    public static void main(String[]args){
        Produk produk1 = new Produk ("Buku TUlis",5000, 100);
        Elektronik produk2 = new Elektronik("Televisi", 300000,10,  24);
        
        tampilkanInfoProduk(produk1);
        tampilkanInfoProduk(produk2);
      
    }
    //Method Polymorphis
    public static void tampilkanInfoProduk(Produk produk){
        produk.tampilkanInfo();
        System.out.println();
        
    }
}
