/*
 * NetPay.java
 * Author: John Xue
 * Submission Date: Sept. 14, 2017
 *
 * Purpose: Compute a person's gross and net pay based on
 * their hourly wage, hours worked, and several withholdings.
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

import java.util.Scanner;

public class NetPay {

	
	public static void main(String[] args) {
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your hours per week: ");
		int hoursPerWeek = keyboard.nextInt();

		double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity;
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = ( grossPay * FEDERAL_TAX_PERCENT ) / 100;
		stateTax = ( grossPay * STATE_TAX_PERCENT ) / 100;
		socialSecurity = ( grossPay * SS_PERCENT ) / 100;
		medicare = ( grossPay * MEDICARE_PERCENT ) / 100;
		netPay = grossPay - federalTax - stateTax - medicare - socialSecurity;
		
		System.out.println("Hours per Week:\t"+hoursPerWeek);
		System.out.println("Gross Pay:\t"+grossPay);
		System.out.println("Hours per Week:\t"+netPay+"\n");
		System.out.println("Deductions");
		System.out.println("Hours per Week:\t"+federalTax);
		System.out.println("Hours per Week:\t"+stateTax);
		System.out.println("Hours per Week:\t"+socialSecurity);
		System.out.println("Hours per Week:\t"+medicare);
	}
}
