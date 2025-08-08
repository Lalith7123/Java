package design_patterns.structural.composite;

public class Main {

    public static void main(String[] args) {

        File file1 = new File("resume.pdf");
        File file2 = new File("photo.jpg");
        File file3 = new File("maths.txt");
        File file4 = new File("dummy.txt");

        ParentDirectory personalDir = new ParentDirectory("personal");
        personalDir.newFile(file1);
        personalDir.newFile(file2);

        ParentDirectory professionalDir = new ParentDirectory("professional");
        professionalDir.newFile(file3);

        ParentDirectory rootDir = new ParentDirectory("root");
        rootDir.newFile(personalDir);
        rootDir.newFile(professionalDir);
        rootDir.newFile(file4);
        rootDir.deleteFile(file4);
        rootDir.show();
    }
}
