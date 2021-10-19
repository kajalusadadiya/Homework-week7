package week7;

import java.util.Scanner;

public class Prog7Sales {
    public static void main(String[] args) {
        double TotalSales;
        double CommissionRate = 0.0;
        double Commission;
        Scanner Read = new Scanner(System.in);
        System.out.println("Enter the sales amount :");
        TotalSales = Read.nextDouble();
        if (TotalSales >= 50000) {
            CommissionRate = 0.35;
        } else if (TotalSales >= 30000)
            CommissionRate = 0.20;
        else if (TotalSales >= 20000)
            CommissionRate = 0.10;
        else if (TotalSales >= 10000)
            CommissionRate = 0.05;
        else if (TotalSales < 10000)
            CommissionRate = 0.02;
        Commission = CommissionRate + TotalSales;
        System.out.println(" The Commission is :" + Commission);
    }
}
