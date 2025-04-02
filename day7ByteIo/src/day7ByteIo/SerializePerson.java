package day7ByteIo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person("John Doe", 25);
        Person person2 = new Person("Alice Smith", 30);

        try (FileOutputStream fos = new FileOutputStream("person.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Writing objects to file
            oos.writeObject(person1);
            oos.writeObject(person2);

            System.out.println("Person objects have been serialized and stored in person.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
