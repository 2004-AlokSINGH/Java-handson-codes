package day7ByteIo;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("demo1.txt")) { // Use try-with-resources to auto-close
            String st = "kljadldlkajas hello java";
            fw.write(st);
            System.out.println("File created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
