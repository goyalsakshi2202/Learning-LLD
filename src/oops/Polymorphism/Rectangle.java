package oops.Polymorphism;

public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = Math.max(0, width);
        this.height = Math.max(0, height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return String.format("%s(w=%.2f, h=%.2f, area=%.2f)", name(), width, height, area());
    }
}


