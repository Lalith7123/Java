package design_patterns.structural.adaptor;

public class PrinterAdapter implements Printer{

    private final OldPrinter oldPrinter;

    public PrinterAdapter(String message){
        oldPrinter = new OldPrinter(message);
    }

    public void print(){
        this.oldPrinter.printInOldWay();
    }
}
