package src1;
import java.util.Scanner;
public class Doubleprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"Windows-1250");
        System.out.println("Enter a number:...");
        String value = scanner.nextLine();
        int number = Integer.parseInt(value);
        number = (number + 2) * 5;

        System.out.println("This is the result:..");
        System.out.println(number);



    }
}
