package design_patterns.structural.proxy;

public class Main {

    public static void main(String[] args) {

        DocumentProxy documentProxy = new DocumentProxy("proxy_file.txt");
        documentProxy.show();
        documentProxy.show();
    }
}
