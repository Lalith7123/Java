package design_patterns.creational.singleton;

public class VendorMachine {

    private static VendorMachine vendorMachine;
    public final String productName = "cookie";
    public final long price = 20;
    private int quantity = 5;

    private VendorMachine(){

    }

    public void buyCookie(){
        --quantity;
    }

    public static VendorMachine getVendorMachine(){
        if(vendorMachine == null){
            vendorMachine = new VendorMachine();
        }
        return vendorMachine;
    }

    @Override
    public String toString() {
        return "VendorMachine{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
