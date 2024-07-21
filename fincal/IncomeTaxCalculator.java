package fincal;
import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your annual income: ");
        double annualIncome = scanner.nextDouble();

        System.out.print("Enter your deductions (e.g., under Section 80C): ");
        double deductions = scanner.nextDouble();

        System.out.print("Enter your tax credits: ");
        double taxCredits = scanner.nextDouble();

        double taxableIncome = annualIncome - deductions;

        
        double taxLiability = calculateTax(taxableIncome) - taxCredits;
        taxLiability = Math.max(taxLiability, 0); 
        System.out.printf("Estimated tax liability: %.2f\n", taxLiability);
    }

    public static double calculateTax(double taxableIncome) {
        double[] SLAB_LIMITS = {250000,500000,1000000};
        double[] TAX_RATES={0.05,0.20,0.30};
        double tax = 0;

        if (taxableIncome <= SLAB_LIMITS[0]) {
            return tax;
        } else if (taxableIncome <= SLAB_LIMITS[1]) {
            tax = (taxableIncome - SLAB_LIMITS[0]) * TAX_RATES[0];
        } else if (taxableIncome <= SLAB_LIMITS[2]) {
            tax = (SLAB_LIMITS[1] - SLAB_LIMITS[0]) * TAX_RATES[0] +
                  (taxableIncome - SLAB_LIMITS[1]) * TAX_RATES[1];
        } else {
            tax = (SLAB_LIMITS[1] - SLAB_LIMITS[0]) * TAX_RATES[0] +
                  (SLAB_LIMITS[2] - SLAB_LIMITS[1]) * TAX_RATES[1] +
                  (taxableIncome - SLAB_LIMITS[2]) * TAX_RATES[2];
        }

        return tax;
    }

}
