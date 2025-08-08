package design_patterns.creational.prototype;

public class Address implements Cloneable{
    public String address;

    public Address(String address){
        this.address = address;
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone(); //deep cloning
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
