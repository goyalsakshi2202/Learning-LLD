package oops.Polymorphism;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = Math.max(0, radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public String toString() {
        return String.format("%s(r=%.2f, area=%.2f)", name(), radius, area());
    }
}


