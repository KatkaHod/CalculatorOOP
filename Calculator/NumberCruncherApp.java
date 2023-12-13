package Calculator;

import java.util.InputMismatchException;
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

        //Greeting of the user
        System.out.println("Welcome to the calculator!");

        String con = "yes"; // a new variable "continue" to use calculator again - User has to input YES to continue
        while (con.equals("yes")) {  //while - execute a block of code as long as a given condition is true

        //Input of first number and parse it into double - input is always string
        System.out.println("Input a first number: ");
        ncaroperations.a = Double.parseDouble(scanner.nextLine()); //from the string to double
        //Input of second number and parse it into double
        System.out.println("Enter a second number: ");
        ncaroperations.b = Double.parseDouble(scanner.nextLine());

        //Ask user for an operator to know what calculate
        System.out.println("Enter a number in the way you want to calculate it: ");
        System.out.println("1 + ");
        System.out.println("2 - ");
        System.out.println("3 * ");
        System.out.println("4 / ");

        //Insert the selected number from USER into a variable (1,2,3,4)
        int options = Integer.parseInt(scanner.nextLine());

        //I have to insert the value 0, the result of the user input is inserted into this variable
        double result = 0;
        switch (options) {
            case 1:
                result = ncaroperations.addition();
                break;
            case 2:
                result = ncaroperations.subtraction();
                break;
            case 3:
                result = ncaroperations.multiplication();
                break;
            case 4:
                result = ncaroperations.division();
                break;

            default: //In case the user enter a wrong value
                System.out.println("Wrong input, please choose again number between 1 - 4.");

        } //End of switch statement

        //Print the result
        System.out.println("The result is : " + result);

        System.out.println("Write -yes- to proceed again");
        con = scanner.nextLine();

        } //End of the while control flow statement


    } //End of the public static main
} //End of the class
