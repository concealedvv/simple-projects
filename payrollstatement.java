/*
(Financial application: payroll) Write a program that reads the following information and prints a payroll
statement: Employee’s name (e.g., John) Number of hours worked in a week (e.g., 10) Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%) State tax withholding rate (e.g., 9%). Here is a sample run: */

import java.util.Scanner;

public class payrollstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String employeeName = input.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double weeklyhoursworked = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double hourlypayrate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federaltaxwithholdingrate = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double statetaxwithholdingrate = input.nextDouble();

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + weeklyhoursworked);
        System.out.println("Pay Rate: $" + hourlypayrate);
        double grosspay = weeklyhoursworked * hourlypayrate;
        System.out.println("Gross Pay: $" + grosspay);
        System.out.println("Deductions: ");
        double federaltaxwithholding = grosspay * federaltaxwithholdingrate;
        System.out.println(" Federal Withholding (" + (federaltaxwithholdingrate*100) + "%): $" + federaltaxwithholding);
        double statetaxwithholding = grosspay * statetaxwithholdingrate;
        System.out.println(" State Withholding (" + (statetaxwithholdingrate*100) + "%): $" + statetaxwithholding);
        double totaldeductions = federaltaxwithholding + statetaxwithholding;
        System.out.println(" Total Deductions: $" + totaldeductions);
        double netpay = grosspay - totaldeductions;
        System.out.println("Net Pay: $" + netpay);
    }
}

