/*
 * Enrique Finol
 * Programming Assignment #4: Compound Interest
 * Due Date: 02-29-2021
 * Description: The following program prompts the user to enter the amount of dollars
 * to put in the savings account monthly, then asks for the annual interest rate,
 * finally asks the user to enter the number a number of months. This program will 
 * display the balance in the checking account after the number of months entered.

 */
import java.util.Scanner;
public class FinolLoops {

	public static void main(String[] args) {
		float save=0; //Assign variable for the amount of money to save every month.
		float interestRate=0; // Annual interest rate according to the customer input.
		float monthlyInterest;
		float savingsAccount; //Accumulate the amount of money at the end of every month.
		int numMonth=0; // Number of months to calculate compound interest.
		boolean invalid = true; // Initialize invalid in order to get a right value for input.
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Get input for the amount of money to save in the bank.
		System.out.println("Enter the amount of money to save monthly(e.g. 130.0): ");
		do {//Start outer loop
			
			//Use Try-Catch block in order to avoid the program to stop(string or characters).
		try {
			save = input.nextFloat();
			
			//check input for a number > 0 .
			while(save<=0) {//Start inner loop.
				//Prompt user with a friendly error message and give chance to fix.
				System.out.println("You may have entered a negative number: ");
				System.out.println("Please enter a valid number:");
				save = input.nextFloat();
			}//End inner loop.
			
			invalid = false; //Control Variable.
		}catch (Exception e) {
			//Prompt user with a friendly error message and give chance to fix.
			System.out.println("You may have entered a non-numerical value.");
			System.out.println("Please enter a valid number: ");
			input.next();
		}
		
		}while(invalid);//End outer loop.
		
		//Repeat process for input of interest rate.
		
		invalid = true; //Turn on the control variable.
		
		System.out.println("Enter annual interest rate offered by the bank(e.g. 15): ");
		do {//Start outer loop.
			
			//Use Try-Catch block in order to avoid the program to stop(string or characters).
		try {
			interestRate = input.nextFloat();
			
			//check input for a number > 0 .
			while(interestRate<=0) {//Start inner loop.
				//Prompt user with a friendly error message and give chance to fix.
				System.out.println("You may have entered a negative number: ");
				System.out.println("Please enter a valid number:");
				interestRate = input.nextFloat();
			}//End inner loop.
			
			invalid = false; //Control Variable.
		}catch (Exception e) {
			//Prompt user with a friendly error message and give chance to fix.
			System.out.println("You may have entered a non-numerical value.");
			System.out.println("Please enter a valid number: ");
			input.next();
		}
		
		}while(invalid);//End outer loop.
		
		//Repeat process for number of months.
		
		invalid = true; //Turn on the control variable.
		
		System.out.println("Enter the number of months to calculate compound interest(e.g. 4): ");
		do {//Start outer loop.
			
			//Use Try-Catch block in order to avoid the program to stop(string or characters).
		try {
			numMonth = input.nextInt();
			
			//check input for a number > 0
			while(numMonth<=0) {//Start inner loop.
				//Prompt user with a friendly error message and give chance to fix.
				System.out.println("You may have entered a negative number: ");
				System.out.println("Please enter a valid number:");
				numMonth = input.nextInt();
			}//End inner loop.
			
			invalid = false; //Control Variable.
		}catch (Exception e) {
			//Prompt user with a friendly error message and give chance to fix.
			System.out.println("You may have entered a non-numerical value.");
			System.out.println("Please enter a valid number: ");
			input.next();
		}
		
		}while(invalid);//End outer loop.
		
		//CALCULATIONS.
		
		monthlyInterest = (interestRate/100) / 12; //
		savingsAccount = 0;
		//for loop is going to have as many iterations as months entered.
		for(int i = 0; i<numMonth; i++) {
			savingsAccount = (savingsAccount + save)*(1+monthlyInterest);
		}
		
		//Display results to customer.
		System.out.printf("The balance on your savings account after %d months is: $%.2f ",numMonth, savingsAccount);
		
		

			

	}

}
