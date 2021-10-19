package week7;

import java.util.Scanner;

       //Input number is odd or even -- use ternary operator(? :)
    public class programme1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scan.nextInt();
        scan.close();
        String result = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(number + " is " + result);

    }


}
