package week7;

import java.util.Scanner;

public class OddOrEven6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        String strOutput =(number % 2 ==0) ?"Even"  :  " Odd" ;
        System.out.print(number + "  is  " + strOutput);
        sc.close();
    }
}
