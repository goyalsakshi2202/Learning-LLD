package oops.PolymorphismAbstract;

import java.util.*;

public class PolymorphismAbstractDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("red", 3));
        shapes.add(new Rectangle("blue", 4, 5));
        shapes.add(new Circle("green", 1.5));
        shapes.add(new Rectangle("yellow", 2, 6));

        System.out.println("Abstract class polymorphism: shared color state + dynamic dispatch\n");
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }

        double totalArea = totalArea(shapes);
        System.out.printf("\nTotal area = %.2f\n", totalArea);
    }

    static double totalArea(List<Shape> shapes) {
        double sum = 0.0;
        for (Shape s : shapes) sum += s.area();
        return sum;
    }
}


