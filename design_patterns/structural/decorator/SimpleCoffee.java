package design_patterns.structural.decorator;

public class SimpleCoffee implements Coffee{

    public String description(){
        return "Get Your Simple Coffee";
    }

    public int price(){
        return 5;
    }
}
