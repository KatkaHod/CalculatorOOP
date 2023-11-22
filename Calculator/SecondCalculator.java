package Calculator;
import java.util.Scanner;
public class SecondCalculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in,"Windows-1250");

    System.out.println("Welcome to the calculator");
    System.out.println("Write the first number: ... "); //first value

    double a = Double.parseDouble(scanner.nextLine()); //from the string to double
//do not forget to write double like 5.12 not 5,12
    System.out.println("Write the second number:..."); //second value

    double b = Double.parseDouble(scanner.nextLine()); //from the string to double

        double sum = a + b; //a new variable double
        double minus = a - b;
        double multiplication = a * b;
        double division = a / b;

        System.out.println("The result of sum is..." + sum);

        System.out.println("The result of minus is..." + minus);

        System.out.println("The result of multiplication is..." + multiplication);

        System.out.println("The result of division is.." + division);

        System.out.println("Thank you for using the new calculator");

    }
}
