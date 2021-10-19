package week7;

import java.util.Scanner;
//input any year n find out leap year or not
public class Programme2 {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Year :");
        year = input.nextInt();
        input.close();

        if ((year % 4 == 0) || (year % 4==0 && year % 1!=0)) {
            System.out.println("Leap year");
        } else {
            System.out.println(" Not leap year");
        }

    }
}
