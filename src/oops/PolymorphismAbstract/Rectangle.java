package oops.PolymorphismAbstract;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = Math.max(0, width);
        this.height = Math.max(0, height);
    }

    @Override
    public String name() { return "Rectangle"; }

    @Override
    public double area() { return width * height; }

    @Override
    public String toString() {
        return String.format("%s(color=%s, w=%.2f, h=%.2f, area=%.2f)", name(), color(), width, height, area());
    }
}


