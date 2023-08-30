package squareroot;

import java.util.Scanner;

public class squareroot_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Write a number to exponetiate: ");

        String value = scanner.nextLine();
        int number = Integer.parseInt(value);


        System.out.println(number * number);

        }
}

