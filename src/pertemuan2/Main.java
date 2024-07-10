
package pertemuan2;


public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Book
        Book book1 = new Book("Java Programming", "Alfi", 300);
        Book book2 = new Book("Python Basics", "Khalily", 250);

        // Memanggil method displayInfo untuk menampilkan informasi buku
        System.out.println("Book 1:");
        book1.displayInfo();
        System.out.println("\nBook 2:");
        book2.displayInfo();
    }
}

