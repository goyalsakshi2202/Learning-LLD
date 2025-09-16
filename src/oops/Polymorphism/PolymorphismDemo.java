package oops.Polymorphism;

import java.util.*;

public class PolymorphismDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(1.5));
        shapes.add(new Rectangle(2, 6));

        System.out.println("Polymorphism demo: one list, many shapes, same calls\n");
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


