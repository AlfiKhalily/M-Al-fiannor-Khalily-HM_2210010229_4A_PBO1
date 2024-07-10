
package pertemuan3;


public class Main {
     public static void main(String[] args) {
        // Membuat objek dari class Book
        Book book1 = new Book("Java Programming", "John Doe", 300);
        Book book2 = new Book("Python Basics", "Jane Smith", 250);

        // Memanggil method displayInfo untuk menampilkan informasi buku
        System.out.println("Book 1:");
        book1.displayInfo();
        System.out.println("\nBook 2:");
        book2.displayInfo();

        // Mengubah informasi buku menggunakan setter
        book1.setTitle("Java Programming (Revised Edition)");
        book1.setPages(350);

        // Menampilkan informasi buku setelah diubah
        System.out.println("\nBook 1 after update:");
        book1.displayInfo();
    }
}
