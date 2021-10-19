package week7;

import java.util.Scanner;

public class ProgrammeSalary5 {
//
    String EmployeeID, Empname;
    int Basicsalary;
    int HRA, DA, TD, PF, GS;

    public void read() {

        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the EmployeeID: ");
        EmployeeID = Scan.next();
        System.out.print("Enter the Empoyee name: ");
        Empname = Scan.next();

        System.out.print("Enter the basic salary of Employee: ");
        Basicsalary = Scan.nextInt();
        calculate();
    }

    public void calculate() {
        HRA = Basicsalary * 10 / 100;
        DA = Basicsalary * 8 / 100;
        TD = Basicsalary * 9 / 100;
        PF = Basicsalary * 20 / 100;
        GS = Basicsalary + DA + HRA+ TD - PF;
    }

    public void display() {
        System.out.println("|--------------------------------|");
        System.out.println("|      Salary Slip               |");
        System.out.println("|--------------------------------|");
        System.out.println("|Employee ID   :"    + EmployeeID + "|");
        System.out.println("|Employee Name :"      + Empname + "   |");
        System.out.println("|--------------------------------|");
        System.out.println("|Basic Salary  :" + Basicsalary + "            |");
        System.out.println("|HRA 10%       :" + HRA + "             |");
        System.out.println("|TD 8%         :" + TD + "             |");
        System.out.println("|DA 9%         :" + DA + "             |");
        System.out.println("|PF - 20&      :" + PF + "             |");
        System.out.println("|--------------------------------|");
        System.out.println("|Gross Salary  :" + GS + "            |");
        System.out.println("|================================|");
    }

    public static void main(String[] args) {


        ProgrammeSalary5 empobj = new ProgrammeSalary5();
        empobj.read();
        empobj.display();

    }
}