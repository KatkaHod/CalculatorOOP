package FirstOOP;
import java.util.Scanner;

public class HelloObjects {
    public HelloObjects() {
    }

    public static void main(String[] args) {// do not forget to use main method
        Greeting greeting = new Greeting();
        greeting.Greet("Patrick"); //I am calling the Greet method from class Greeting
        greeting.Greet("Lukas");



    }
}