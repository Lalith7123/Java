package design_patterns.creational.builder;

public class Main {

    public static void main(String[] args) {

        Mobile mobile = new MobileBuilder()
                .setOS("Android 16")
                .setRam(4)
                .setStorage(64)
                .setBattery(4500)
                .build();
        System.out.println(mobile);
    }

}
