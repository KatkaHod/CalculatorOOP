package src;
import java.util.Scanner;

public class parrotcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in, "Windows-1250");
        System.out.println("Hallo, I am Parrot Eleanor and i like to repeat the words!");
        System.out.println("Write something and I will repeat it:  ");

        String input;
        input = scanner.nextLine();

        String output;
        output = input + ", " + input + "!";
        System.out.println(output);


    }

}
