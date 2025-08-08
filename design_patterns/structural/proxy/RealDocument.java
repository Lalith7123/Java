package design_patterns.structural.proxy;

public class RealDocument implements Document{

    private final String fileName;

    public RealDocument(String fileName){
        this.fileName = fileName;
        load();
    }

    public void load(){
        System.out.println("Document " + fileName + " is loading...");
    }

    public void show(){
        System.out.println("Document " + fileName + " is printing...");
    }
}
