package design_patterns.creational.factory;

public class Main {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getInstance("circle");
        circle.display();
        Shape rectangle = ShapeFactory.getInstance("rectangle");
        rectangle.display();
    }
}
