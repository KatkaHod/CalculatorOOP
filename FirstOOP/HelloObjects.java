package FirstOOP;

public class HelloObjects {
    public HelloObjects() {
    }

    public static void main(String[] args) { // do not forget to use main method

        Greeting greeting = new Greeting();
        // new variable greeting, Objects are stored in variables, the class name is used as a data typ
        // The key word -new- creates a new instance of class Greeting
        // I sign the new instance to new variable - greeting )
        //When is instance created, is called constructor Greeting()

        //greeting.greet(); // call the method from the new variable greeting

        Greeting.greet("Patrick");
        Greeting.greet("Elleanor");







    }
}