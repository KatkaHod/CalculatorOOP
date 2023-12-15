package Calculator;

import java.util.Scanner;


/** The Class NumberCruncherApp calculates the input from the user
 *  There is instance from the class NCArOperations to communicate with calculation methods
 *  The calculation method is selected by the user by entering numbers between 1-4.
 *  The output of this class-app is: Print the Total/Sum, difference, product or quotient
 *  */

public class NumberCruncherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Instance of Class - The purpose of this is to call the calculation methods
        NCArOperations ncaroperations = new NCArOperations();

        //Greeting of the user
        System.out.println("Welcome to the calculator!");

        //a new variable "continue" to use calculator again - User has to input YES to continue
        String con = "yes";
        //while - execute a block of code as long as a given condition is true
        while (con.equals("yes")) {

        //Input of first number and parse it into double - input is always string
        System.out.println("Input a first number: ");
        ncaroperations.a = Double.parseDouble(scanner.nextLine()); //from the string to double
        //Input of second number and parse it into double
        System.out.println("Enter a second number: ");
        ncaroperations.b = Double.parseDouble(scanner.nextLine());

        //Ask user for a number that represent the calculation method
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
                result = ncaroperations.add();
                break;
            case 2:
                result = ncaroperations.subtract();
                break;
            case 3:
                result = ncaroperations.multiply();
                break;
            case 4:
                result = ncaroperations.divide();
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
