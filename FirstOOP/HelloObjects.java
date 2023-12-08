package FirstOOP;
import java.util.Scanner;

public class HelloObjects {
    public HelloObjects() {
    }

    public static void main(String[] args) {// always write main method
        Greeting greeting = new Greeting(); //create new instance

        greeting.text = "Hi User"; //value for a string
        System.out.println(greeting.Greet("Lukas"));
        System.out.println(greeting.Greet("Laura"));

        greeting.text = "Welcome";
        System.out.println(greeting.Greet("Lukas"));
        System.out.println(greeting.Greet("Laura"));

    }
}