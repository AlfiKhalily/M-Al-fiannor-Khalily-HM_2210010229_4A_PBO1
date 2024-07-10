
package pertemuan4;


public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override metode draw untuk menunjukkan polymorfisme
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + getColor());
    }
}

