package week7;

import java.util.Scanner;

// print mark sheet
public class Program3 {

    public static void main(String[] args) {
        int Math, Science, English, Rollno, Total;

        float perc;
        String Name, Grade = "0", Status = "0", Result = "0";

        Scanner in = new Scanner(System.in);
        System.out.print("Name :");
        Name = in.nextLine();
        System.out.print("Rollno :");
        Rollno = in.nextInt();
        System.out.print("Math :");
        Math = in.nextInt();
        System.out.print("Science :");
        Science = in.nextInt();
        System.out.print("English :");
        English = in.nextInt();

        Total = (Math + Science + English);
        perc = Total * 100 / 300;
        System.out.println("Total =" + Total);
        System.out.println("percentage = " + perc);
        if (perc >= 80) {
            Grade = "A+";
            System.out.println("Grade  : A+");
        } else if (perc >= 60) {
            Grade = "A";
            System.out.println("Grade  : A");
        } else if (perc >= 50) {
            Grade = "B";
            System.out.println("Grade  : B");
        } else if (perc >= 35) {
            Grade = "C";
            System.out.println("Grade  : C");
        }
        if ((Math > 100) || (Science > 100) || (English > 100)) {
            Status = "Invalid";
            System.out.println("Invalid input,Marks should be between 0 to 100");

        } else if ((Math < 35) || (Science < 35) || (English < 35)) {
            Result = "Fail";
            System.out.println("Result : Fail");

        } else {
            Result = "Pass";
            System.out.println("Result : Pass");
        }
        System.out.println("-----------------------");
        System.out.println("|     Mark Sheet       |");
        System.out.println("|----------------------|");
        System.out.println("|Name :  " + Name + "  |");
        System.out.println("|Rollno : " + Rollno+" |");
        System.out.println("|Math :  " + Math + "  |");
        System.out.println("|Science: " +Science +"|");
        System.out.println("|English :" +English+ "|");
        System.out.println("------------------------");
        System.out.println("|Total =" + Total + "  |");
        System.out.println("------------------------");
        System.out.println("|percentage = " +perc+"|");
        System.out.println("|Result:  " + Result+" |");
        System.out.println("|Grade :  " + Grade + "|");
    }

}
