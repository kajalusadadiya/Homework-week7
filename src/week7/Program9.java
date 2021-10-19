package week7;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A':
                System.out.println("Valid city character");
                break;
            case 'B':
                System.out.println("Valid city character");
                break;
            case 'C':
                System.out.println("Valid city character");
                break;
            case 'D':
                System.out.println("Valid city character");
                break;
            case 'E':
                System.out.println("Valid city character");
                break;
            case 'F':
                System.out.println("Valid city character");
                break;
            default:
                System.out.println("Invalid city Character");
        }
    }
}

