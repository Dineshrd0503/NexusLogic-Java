package fincal;

import java.util.Scanner;

public class InvestmentReturnCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the initial investment amount");
        double initialInvestment=sc.nextDouble();
        System.out.println("enter the expected annual rate of return (in %)");
        double rateOfReturn=sc.nextDouble();
        System.out.println("enter the investment time amount(in years)");
        double investmentTime=sc.nextDouble();
        double futurevalue=initialInvestment*Math.pow(1+rateOfReturn/100,investmentTime);
        System.out.printf("future value of investment: %.3f",futurevalue);
        
    }
    
}
