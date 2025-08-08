package design_patterns.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("Chennai");
        Person person = new Person("lalith", address);
        Person person1 = person.clone(); // Deep Cloning
        person1.address.address = "Mumbai";
        System.out.println(person);
    }
}
