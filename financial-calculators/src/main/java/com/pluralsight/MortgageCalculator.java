package com.pluralsight;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the loan amount (principle): $");
        double principle = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualRate = input.nextDouble();

        System.out.print("Enter the loan amount in year: ");
        int year = input.nextInt();

        double monthlyRate = annualRate/100/12;
        int numberOfPayments = year * 12;

        double monthlyPayment = principle * (monthlyRate) /
                (1 - Math.pow(1 + monthlyRate, -numberOfPayments));

        double totalPaid = monthlyPayment * numberOfPayments;
        double totalInterestPaid = totalPaid - principle;

        System.out.printf("Your monthly payment is: $%.2f\n", monthlyPayment);
        System.out.printf("Total interest paid on the loan: $%.2f\n", totalInterestPaid);





    }
}
