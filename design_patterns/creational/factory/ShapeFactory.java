package design_patterns.creational.factory;

public class ShapeFactory {

    private ShapeFactory(){
    }

    public static Shape getInstance(String shape){
        if(shape.equalsIgnoreCase("Circle"))
            return new Circle();
        else
            return new Rectangle();
    }

}
