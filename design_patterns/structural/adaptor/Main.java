package design_patterns.structural.adaptor;

public class Main {

    public static void main(String[] args) {

        PrinterAdapter printerAdapter = new PrinterAdapter("print here~1");
        printerAdapter.print();

    }
}
