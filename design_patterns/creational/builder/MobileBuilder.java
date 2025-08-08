package design_patterns.creational.builder;

public class MobileBuilder {

    private String OS;
    private String processor;
    private int ram;
    private int storage;
    private int battery;


    public MobileBuilder(){

    }

    public MobileBuilder setOS(String OS){
        this.OS = OS;
        return this;
    }
    public MobileBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    public MobileBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public MobileBuilder setStorage(int storage){
        this.storage = storage;
        return this;
    }
    public MobileBuilder setBattery(int battery){
        this.battery = battery;
        return this;
    }

    public Mobile build(){
        //System.out.println(processor.toUpperCase());
        return new Mobile(OS, processor, ram, storage, battery);
    }

}
