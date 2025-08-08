package design_patterns.creational.builder;

public class Mobile {

    private final String OS;
    private final String processor;
    private final int ram;
    private final int storage;
    private final int battery;


    public Mobile(String OS, String processor, int ram, int storage, int battery) {
        this.OS = OS;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "OS='" + OS + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", battery=" + battery +
                '}';
    }
}
