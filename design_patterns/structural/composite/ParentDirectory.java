package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ParentDirectory implements Directory{

    private final String dirName;
    private final List<Directory> directories = new ArrayList<>();

    public ParentDirectory(String dirName){
        this.dirName = dirName;
    }

    public void newFile(Directory directory){
        directories.add(directory);
    }

    public void deleteFile(Directory directory){
        directories.remove(directory);
    }
    public void show(){
        System.out.println("Directory Name: " + dirName);
        directories.forEach(Directory::show);
    }

}
