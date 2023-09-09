package Books;
import java.util.Scanner;

public class library {
    public static void main(String[] args) {

        Scanner first_scanner = new Scanner(System.in,"Windows-1250"); //first scanner
        System.out.println("Write name of the first book: ... ");
        String firstbook = first_scanner.nextLine(); //print the name
        System.out.println("date of release: ... ");
        int firstbook_release = Integer.parseInt(first_scanner.nextLine()); //print the date, parse from string to int
        System.out.println("The first name of the first book is " + firstbook + " and the date of release is: " + firstbook_release);


        Scanner second_scanner = new Scanner(System.in,"Windows-1250"); //second scanner
        System.out.println("Write name of the second book: ... ");
        String secondbook = second_scanner.nextLine(); //print the name of second books
        System.out.println("date of release: ... ");   //print the second date, parse from string to int
        int secondbook_release = Integer.parseInt(second_scanner.nextLine()); //print the date of the secondbook, parse from string to int
        System.out.println("The second name of the second book is " + secondbook + " and the date of release is: " + secondbook_release);









    }
}
