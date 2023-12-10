package Calculator;

import java.util.Scanner;

/** The NumberCruncherApp class serves as the entry point
 *  and interacts with the user, creating an instance of the Calculator class
 *  and performing calculations based on user input.
 *  */

public class NumberCruncherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NCArOperations ncaroperations = new NCArOperations();
        //after set up the methods in NC, here you can call the method afterward

        //Input of first number and parse it into double - input is always string
        System.out.println("Input a first number: ...");
        ncaroperations.a = Double.parseDouble(scanner.nextLine()); //from the string to double
        //Input of second number and parse it into double
        System.out.println("Enter a second number: ... ");
        ncaroperations.b = Double.parseDouble(scanner.nextLine());

        //Ask user for an operator to know what calculate
        System.out.println("Enter a number in the way you want to calculate it:");
        System.out.println("1 + ");
        System.out.println("2 - ");
        System.out.println("3 * ");
        System.out.println("4 / ");
        //Insert the selected number from USER into a variable (1,2,3,4,5)
        int options = Integer.parseInt(scanner.nextLine());

        //Close the scanner when you're done using it
        //scanner.close();







    }
}
