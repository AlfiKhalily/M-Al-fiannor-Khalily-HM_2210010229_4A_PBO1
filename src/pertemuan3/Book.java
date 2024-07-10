
package pertemuan3;


public class Book {
    // Atribut
    private String title;
    private String author;
    private int pages;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    // Method accessor (getter) untuk title
    public String getTitle() {
        return title;
    }

    // Method mutator (setter) untuk title
    public void setTitle(String title) {
        this.title = title;
    }

    // Method accessor (getter) untuk author
    public String getAuthor() {
        return author;
    }

    // Method mutator (setter) untuk author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method accessor (getter) untuk pages
    public int getPages() {
        return pages;
    }

    // Method mutator (setter) untuk pages
    public void setPages(int pages) {
        this.pages = pages;
    }
}
