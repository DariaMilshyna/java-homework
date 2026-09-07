package java_hw_7.task1;

public class Application {

    public static void main(String[] args) {

        Figure square = new Square(5);
        Figure triangle = new Triangle(6, 4, 5, 5, 6);
        Figure circle = new Circle(3);

        System.out.println("Square:");
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println();

        System.out.println("Triangle:");
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        System.out.println();

        System.out.println("Circle:");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}