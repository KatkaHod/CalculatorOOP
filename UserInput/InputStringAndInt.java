package UserInput;

import java.util.Scanner;

public class InputStringAndInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        //do not forget to add always scanner and also import java.util.Scanner!!!

        System.out.println("What is your name?:..");
        String name = scanner.nextLine(); //this method give back always a string!

        System.out.println("What is your surname?:..");
        String surname = scanner.nextLine();

        System.out.println("What is your age?:..");
        String age = scanner.nextLine();

        //BECAUSE I have always a string back,
        // I have to parse it below!
        int agee = Integer.parseInt(age); // from the string to int


        System.out.println("I am : " + name + surname);
       System.out.println("Your age in a two year will be: " + (agee + 2));


    }
}
