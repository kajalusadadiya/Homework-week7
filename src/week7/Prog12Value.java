package week7;

import java.util.Scanner;

public class Prog12Value {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = Scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A DIGIT.");

        } else {

            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }

    }
}