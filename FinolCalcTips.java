/*
 * Enrique Finol
 * Programming Assignment #2: Calculate Tips
 * Due Date: 01-26-2021
 * Description: The program displays the gratuity and the total. Also, the program will prompt the user want to pay the entire bill or split the bill between 2, 3, or 4 people. Then it will display the amount of money 
 * every person has to pay.

 */
import java.util.Scanner;

public class FinolCalcTips {

	public static void main(String[] args) {
		
		double total;
		double gratuity;
		int splitPayment;
	
		//Display message for the user asking for the subtotal of the bill and the gratuity rate.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal. For example, 10.25 or 18.30 >>> ");
		double subtotal = input.nextDouble();
		
		//Display message for the user asking for the gratuity rate.
		System.out.println("Enter the gratuity rate. For example, 15 or 20 >>> ");
		int rate = input.nextInt();
		
		//Calculate the gratuity.
		gratuity = subtotal*rate/100;
		
		
		//Calculations for the final total.
		total = subtotal + gratuity;
		
		//Display the message with the information about the gratuity and the total.
		System.out.println("The gratuity amount is $" + (int) (gratuity *100)/100.00 + " and the total amount is $" + (int) (total*100)/100.00 );
		
		//The program will prompt the user if he/she wants to pay the entire bill or split the bill between 2, 3 or 4 people.
		System.out.println("If you want to pay for the entire bill enter 1, split between 2, 3, or 4 enter [2-4]: ");
		splitPayment = input.nextInt();
		
		//Create a switch statement in order to determine how to split the bill
		switch(splitPayment) {
		case 1:
			System.out.println("The total amount to pay is $" + (int) (total*100)/100.00 );
			break;
			
		case 2:
			System.out.println("The total amount to pay is $" + (int) (total*100)/100.00  + ". Each person pays $" +(int) (total/2*100)/100.00);
			break;
			
		case 3:
			System.out.println("The total amount to pay is $" + (int) (total*100)/100.00  + ". Each person pays $" + (int) (total/3*100)/100.00);
			break;
			
		case 4:
			System.out.println("The total amount to pay is $" +(int) (total*100)/100.00 + ". Each person pays $" + (int) (total/4*100)/100.00);
			break;
			
		default:
			System.out.println("Invalid number entered!");
		
		}

	}

}
