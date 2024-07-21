package fincal;

import java.util.Scanner;
import java.lang.Math;

public class SavingsGoalCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your final goal of savings amount");
        double goal = scanner.nextDouble();
        System.out.print("Enter the expected annual rate of return (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period(In years) ");
        int time = scanner.nextInt();
        double monthlyinterestrate = rate / 100 / 12;
        int payments = time * 12;
        double monthlyinvestment = goal / ((Math.pow(1 + monthlyinterestrate, payments) - 1)/monthlyinterestrate);
        System.out.printf("Monthly investment amount: %.2f\n", monthlyinvestment);
        
    }

}
