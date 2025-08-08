package design_patterns.structural.composite;

public class File implements Directory{

    private final String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    public void show(){
        System.out.println("File: " + fileName);
    }
}
