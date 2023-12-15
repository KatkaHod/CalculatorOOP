package FirstOOP;

public class HelloObjectsApp {
    public HelloObjectsApp() {
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