package oops.PolymorphismAbstract;

public class Circle extends Shape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = Math.max(0, radius);
    }

    @Override
    public String name() { return "Circle"; }

    @Override
    public double area() { return Math.PI * radius * radius; }

    @Override
    public String toString() {
        return String.format("%s(color=%s, r=%.2f, area=%.2f)", name(), color(), radius, area());
    }
}


