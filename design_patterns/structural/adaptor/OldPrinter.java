package design_patterns.structural.adaptor;

public class OldPrinter {

    private final String message;

    public OldPrinter(String message){
        this.message = message;
    }
    public void printInOldWay(){
        System.out.println(message + " is printed!");
    }
}
