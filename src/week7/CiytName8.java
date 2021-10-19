package week7;

import java.util.Scanner;

public class CiytName8 {
    public static void main(String[] args) {
        System.out.println("Enter a charactre");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ((ch >= 'A') && ch <='F') {
            System.out.println("Valid city char");
        }else {
            System.out.println("Invalid entry");
        }
    }
}