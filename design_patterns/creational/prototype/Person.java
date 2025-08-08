package design_patterns.creational.prototype;

import java.util.Collections;

public class Person implements Cloneable {

    private final String name;
    public Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.address = address.clone();
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}