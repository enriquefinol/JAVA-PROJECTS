/*
 * Enrique Finol
 * Programming Assignment #3: Payroll Applications
 * Due Date: 02-02-2021
 * Description: The program request the employee's information and calculates the required deductions in order to obtain the net pay.

 */
import java.util.Scanner;
import java.util.regex.*;
//import java.util.regex.Pattern;

public class FinolPayApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		float payRate, federalRate, stateRate, grossPay, federalWithholding, stateWithholding, totalDeductions, netPay, hoursWorked;
		
		//Get the employee's name
		
		System.out.println("Enter employee's name: ");
		name = input.nextLine();
		//Finding the way to improve the input from the user I found a solution using the regex package.
		//look up for a pattern in certain string and return True or false if the pattern is found. In my case was a number from 0-9.
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher(name);
		boolean matchFound = matcher.find();
		System.out.println(matchFound);
		System.out.println(matcher);
		//Get the number of hours worked in a week
		
		System.out.println("Enter the number of hours worked in a week (use integer number): ");
		hoursWorked = input.nextFloat();
		
		//Get the pay rate
		
		System.out.println("Enter the hourly pay rate: ");
		payRate = input.nextFloat();
		
		//Get the federal tax withholding rate
		System.out.println("Enter federal tax withholding rate: ");
		federalRate = input.nextFloat();
		
		//Get the state tax withholding rate
		System.out.println("Enter state tax withholding rate: ");
		stateRate = input.nextFloat();
		
		//Using an if condition in order to check that the numbers entered are correct.
		//If they are not, the program will notify the user that there was a mistake with the numbers and it has to be restarted.
		
		if(hoursWorked >= 0 && payRate >=0 && federalRate >=0 && stateRate >=0) {
			
			//Calculate the gross pay
			grossPay = hoursWorked * payRate;
			
			//Calculate the federal tax deduction
			federalWithholding = grossPay * federalRate/100;
			
			//Calculate the state tax deduction
			stateWithholding = grossPay * stateRate/100;
			
			//Calculate the total amount of deductions
			totalDeductions = federalWithholding + stateWithholding;
			
			//Calculate net pay
			netPay = grossPay - totalDeductions;
			
			//Output of all the employee's information
			
			System.out.println("Employee Name: " + name);
			System.out.printf("Hours Worked: %2.1f \n", hoursWorked );
			System.out.printf("Pay Rate: $%.2f \n",payRate );
			System.out.printf("Gross Pay: $%.2f \n", grossPay );
			System.out.println("Deductions: ");
			
			System.out.printf("  Federal Withholding (%2.1f%%): $%.2f \n", federalRate, federalWithholding);
			System.out.printf("  State Withholding (%2.1f%%): $%.2f \n", stateRate, stateWithholding);
			System.out.printf("  Total Deduction: $%.2f \n", totalDeductions );
			System.out.printf("Net Pay: $%.2f \n", netPay );
			
			
			
		}
		
		else {
			System.out.printf("There was a mistake with the numbers entered ( %.2f & %.2f & %.2f & %.2f ). Please run again the app.", hoursWorked, payRate, federalRate, federalRate);
			
		}
		
	}

}
