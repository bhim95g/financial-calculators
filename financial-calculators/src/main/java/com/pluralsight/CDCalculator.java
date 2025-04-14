package com.pluralsight;
import java.util.Scanner;
public class CDCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the deposit amount: $");
        double principle = input.nextDouble();

        System.out.print("Enter the annual interest rate:)";
        double annualRate = input.nextDouble();
        double r = annualRate/100;

        System.out.print("Enter the number of years:)";
        int years = input.nextInt();

        int daysPerYear = 365;
        int totalDays = daysPerYear * years;

        double futureValue = principle * Math.pow(1 + (r / daysPerYear), totalDays);
        double totalInterest = futureValue-principle






    }
}
