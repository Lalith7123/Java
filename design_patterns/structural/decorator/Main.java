package design_patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " " + coffee.price());
        MilkDecorator milkDecorator = new MilkDecorator(coffee);
        System.out.println(milkDecorator.description() + " " + milkDecorator.price());

    }
}
