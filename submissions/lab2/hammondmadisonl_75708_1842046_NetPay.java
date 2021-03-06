/*
 * NetPay.java
 * Author: Madison Hammond
 * Submission Date: Sept. 12, 2017
 * 
 * Purpose: Compute a person's gross and net pay 
 * based on their hourly wage, hours worked, and 
 * serveral withholdings
 * 
 */
import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of hours worked per week:");
		int hoursPerWeek = keyboard.nextInt();
	
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federalTax = (grossPay * FEDERAL_TAX_PERCENT)/100;
		double stateTax = (grossPay * STATE_TAX_PERCENT)/100;
		double medicare = (grossPay * MEDICARE_PERCENT)/100;
		double socialSecurity = (grossPay * SS_PERCENT)/100;	
		double netPay = grossPay - federalTax - stateTax - medicare - socialSecurity;
		
		System.out.println("Hours per Week: \t" + hoursPerWeek);
		System.out.println("Gross Pay:      \t" + grossPay);
		System.out.println("Net Pay:        \t" + netPay + "\n");
		System.out.println("Deductions");
		System.out.println("Federal:        \t" + federalTax);
		System.out.println("State:          \t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:       \t" + medicare);
		
	}

}
