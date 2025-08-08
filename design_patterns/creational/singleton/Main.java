package design_patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {

        VendorMachine vendorMachine = VendorMachine.getVendorMachine();
        System.out.println(vendorMachine);
        vendorMachine.buyCookie();
        System.out.println(vendorMachine);
        System.out.println(VendorMachine.getVendorMachine());
    }
}
