package oops.PolymorphismAbstract;

public abstract class Shape {
    private final String color;

    protected Shape(String color) {
        this.color = color == null ? "none" : color;
    }

    public String color() { return color; }

    public String name() { return "Shape"; }

    public abstract double area();

    @Override
    public String toString() {
        return String.format("%s(color=%s, area=%.2f)", name(), color, area());
    }
}


