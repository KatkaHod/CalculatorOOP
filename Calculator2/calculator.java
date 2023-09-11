package Calculator2;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in,"Windows-1250");
        System.out.println("Hi, welcome to the improved calculator!");

        System.out.println("Please write a first number: ");
        Double a = Double.parseDouble(scanner.nextLine()); //input of first No.

        System.out.println("Please write a second number: ");
        Double b = Double.parseDouble(scanner.nextLine()); // input of second number

        System.out.println("Choose below how you want to calculate, range from 1-100 ");

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
if ((options >= 1) && (options <= 100)) {
    System.out.println("The result is: " + result);
}
else {
    System.out.println("Invalid input, try again ");
}


        }
}
