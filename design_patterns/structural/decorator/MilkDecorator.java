package design_patterns.structural.decorator;

public class MilkDecorator implements Coffee{

    private final Coffee coffee;

    public MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public String description(){
        return coffee.description() + " with little extra milk!";
    }
    public int price(){
        return coffee.price() + 2;
    }
}
