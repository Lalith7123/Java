package design_patterns.structural.proxy;

public class DocumentProxy implements Document{

    private Document document;
    private final String fileName;

    public DocumentProxy(String fileName){
        this.fileName = fileName;
    }

    public void show(){
        if(document == null){
            document = new RealDocument(fileName);
        }
        document.show();
    }


}
