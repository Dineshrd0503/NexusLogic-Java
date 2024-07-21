package fincal;

import java.util.Scanner;

public class FinancialCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Investment calculator");
            System.out.println("2. Mortgage calculator");
            System.out.println("3. Savings goal calculator");
            System.out.println("4.incometax calculator");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();
            switch (option) {
                case 1 -> InvestmentReturnCalc.main(null);
                case 2 -> MortgageCalculator.main(null);
                case 3 -> SavingsGoalCalculator.main(null);
                case 4 -> IncomeTaxCalculator.main(null);
                default -> System.out.println("Invalid option");
            }
        }
    }
}