package Calculator;
import java.util.Scanner;
public class FirstCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in,"Windows-1250");

        System.out.println("Hi, welcome to the improved calculator!");
        String con = "yes";
        while (con.equals("yes")) {

        System.out.println("Write a first number: ");
        Double a = Double.parseDouble(scanner.nextLine()); //input of first No.
        System.out.println("Write a second number: ");
        Double b = Double.parseDouble(scanner.nextLine()); // input of second number
        System.out.println("Choose number how you want to calculate ");
        System.out.println(" 1 +");
        System.out.println(" 2 - ");
        System.out.println(" 3 / ");
        System.out.println(" 4 * ");
        int options = Integer.parseInt(scanner.nextLine()); //now the user put an option who he wants

        double result = 0; //I have to declare a variable and add a value 0, cannot be empty. Than I can put the values.

        switch (options) {
            case 1:
            result = a + b;
            break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a / b;
                break;
            case 4:
                result = a * b;
                break;
        }

        if ((options > 0) && (options < 5)) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Input is not valid, choose between 1-4");
        }
            System.out.println("Do you want to calculate one more time? Yes / No ");
            con = scanner.nextLine();
        }
        System.out.println("Thanks for using this calculator!");
    }

}






