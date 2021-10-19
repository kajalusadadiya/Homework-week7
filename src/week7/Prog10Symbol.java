package week7;

import java.util.Scanner;

public class Prog10Symbol {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int number1 = input.nextInt();
        System.out.println("Enter Second number :");
        int number2 = input.nextInt();
        System.out.println("Enter the operator you Want");
        ch = input.next().charAt(0);
        if (ch == '+') {
            System.out.println("\nAddition of " + number1 + "+" + number2 + "=" + (number1 + number2));
        } else if (ch == '-') {
            System.out.println("\nSubstraction of " + number1 + "-" + number2 + "=" + (number1 - number2));
        } else if (ch == '*') {
            System.out.println("\nMultification of " + number1 + "*" + number2 + "=" + (number1 * number2));
        } else if (ch == '/') {
            System.out.println("\n division of " + number1 + "/" + number2 + "=" + (number1 / number2));
        } else {
            System.out.println("Operator is not available");
        }
    }

}
