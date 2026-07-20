/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ccacspring2026;
import java.util.Scanner;
/**
 *
 * @author ian
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sales_tax = 0.6;
        System.out.print("Enter the entire billAmount: $");
        double billAmount = input.nextDouble();
        
        double tip15 = 0.15;
        double tip20 = 0.20;
        double tip25 = 0.25;
        
        double amount15 = billAmount * 0.15;
        double amount20 = billAmount * 0.20;
        double amount25 = billAmount * 0.25;
        
        System.out.println("\n---- Tip Options ----");
        System.out.printf("15%% Tip: $%.2f | salestax: $%.2f| Total : $%.2f%n", tip15, sales_tax, (billAmount + (billAmount * sales_tax) + tip15));
        System.out.printf("20%% Tip: $%.2f | salestax: $%.2f| Total : $%.2f%n", tip20, sales_tax, (billAmount + (billAmount * sales_tax) + tip20));
        System.out.printf("25%% Tip: $%.2f | salestax: $%.2f| Total : $%.2f%n", tip25, sales_tax, (billAmount + (billAmount * sales_tax) + tip25));
        input.close();
    }
}
