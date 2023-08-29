package billgates;
import java.util.Scanner;
public class Bill_gates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Hi, what is your name?..: ");

        String first_input = scanner.nextLine();

        System.out.println("What are you like?");
        String second_input = scanner.nextLine();

        System.out.print(first_input + " is " + " a " + second_input + " person");
        System.out.println();
        System.out.println("Bye, have a nice day " + first_input);
    }
}
