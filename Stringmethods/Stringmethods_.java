package Stringmethods;

public class Stringmethods_ {
    public static void main(String[] args) {
        String input = "Gepiuolonikeeaab";
        System.out.println(input.startsWith("Gep")); //is it Gep in the beginning? True
        System.out.println(input.startsWith("gep")); //Here not, because the "g" is small.
        System.out.println(input.endsWith("aab")); //true
        System.out.println(input.contains("lonike")); //true
        System.out.println(input.contains("poo")); //false


        System.out.println("Another examplex: ");


        String space = " ";
        String emptystring = "";
        String word = "hello";

        System.out.println(space.isEmpty());
        System.out.println(emptystring.isEmpty());
        System.out.println(word.isEmpty());

        System.out.println("Everything to lower case:  ");

        String input2 = "I want to ChanGe mY password";
        input2 = input2.toLowerCase();

        System.out.println(input2);

        System.out.println("Everything to Upper case  ");

        String input3 = "My password is not good enough!";
        input3 = input3.toUpperCase();
        System.out.println(input3);


    }
}
