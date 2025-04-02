package day7ByteIo;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Ensure version control in serialization

    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (optional, if needed)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override toString() for readable output
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
