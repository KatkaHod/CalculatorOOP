package Books;
import java.util.Scanner;

public class library {
    public static void main(String[] args) {

        Scanner first_scanner = new Scanner(System.in,"Windows-1250"); //first scanner
        System.out.println("Write name of the first book: ... ");
        String firstbook = first_scanner.nextLine(); //print the name
        System.out.println("date of release: ... ");
        int firstbook_release = Integer.parseInt(first_scanner.nextLine()); //print the date, parse from string to int
        System.out.println("The name of the first book is " + firstbook + " and the date of release is a year: " + firstbook_release);
        //String firstlenght = firstbook.length();


        Scanner second_scanner = new Scanner(System.in,"Windows-1250"); //second scanner
        System.out.println("Write name of the second book: ... ");
        String secondbook = second_scanner.nextLine(); //print the name of second books
        System.out.println("date of release: ... ");   //print the second date, parse from string to int
        int secondbook_release = Integer.parseInt(second_scanner.nextLine()); //print the date of the secondbook, parse from string to int
        System.out.println("The name of the second book is " + secondbook + " and the date of release is a year: " + secondbook_release);
        System.out.println();

        int diffyear = firstbook_release - secondbook_release; //a new variable for the difference between release the books
        int diffyearlater = secondbook_release - firstbook_release;

        System.out.println("Which of these books were released sooner or later? You can see below:-) ");
        System.out.println();

        if(firstbook_release < secondbook_release){
        System.out.println("The book " + firstbook + " was released " + (diffyear) + " year/s sooner than the " + secondbook);
        }
        else {
            System.out.println("The book " + secondbook +  " was released" + (diffyearlater) + " year/s sooner than the: " + firstbook );
        }

        System.out.println("Thank you for adding your books! Do you want to add another books? ");


















    }
}
