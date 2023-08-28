package src;
import java.util.Scanner;

public class parrotcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in, "Windows-1250");
        System.out.println("Hallo, I am Parrot Eleanor and i like to repeat the words!");
        System.out.println("Write something and I will repeat it:  ");

        //String input; I can use also this, the below is shorter version
        String input = scanner.nextLine();
        //We can assign a value to a variable already in its declaration
        //String output; And also this, but the below is shorter version
        String output = input + ", " + input + "!";
        System.out.println(output);


    }

}
