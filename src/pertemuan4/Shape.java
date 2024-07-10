
package pertemuan4;


public class Shape {
    private String color;

    // Constructor untuk inisialisasi atribut color
    public Shape(String color) {
        this.color = color;
    }

    // Getter untuk color
    public String getColor() {
        return color;
    }

    // Setter untuk color
    public void setColor(String color) {
        this.color = color;
    }

    // Metode yang akan di-override (polymorfisme)
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

