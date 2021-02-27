/*
 * Enrique Finol
 * Programming Assignment #5: Methods
 * Due Date: 02-16-2021
 * Description: The program prompts the user to enter the score of 5 different judges
 * and displays the average of the scores entered.
 * The program will allow the user to fix a mistake in the number entered.
 * The mistake could be a number out of range, or a wrong number entered.
 * A confirmation message will be displayed for every score.
 */

import java.util.Scanner;

public class FinolMethods {
	//Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//Start scanner inside main
		//Every judge's score is assigned to an independent variable.
		float judgeScore1, judgeScore2,judgeScore3,judgeScore4,judgeScore5;
		
		//Invoke 5 times the getJudgeData method
		//Any argument is being passed
		judgeScore1 = getJudgeData();
		judgeScore2 = getJudgeData();
		judgeScore3 = getJudgeData();
		judgeScore4 = getJudgeData();
		judgeScore5 = getJudgeData();
		
		//Invoke calcScore method
		//The score of every judge is being passed
		calcScore(judgeScore1, judgeScore2, judgeScore3, judgeScore4, judgeScore5);
	}
	/*
	 * The getJudgeData will not use parameters.
	 * It prompts the user to input the judge's score
	 * It is going to return a float value to the main method.
	 */
	public static float getJudgeData() {
		float score; //score is going to hold the value entered by the user.
		boolean Flag = true; // Flag is a variable controlling the loop.
		Scanner input = new Scanner(System.in);// Start scanner inside getJudgeData
		do {//Start outer loop
		//Get input from user
		System.out.println("Enter the judge's score(e.g. 5.4): ");
		score = input.nextFloat();
		
		//Invoke validation method.
		//score is being passed as an argument.
		while (validation(score)) {//Start inner loop
			//Prompt user with friendly message and the opportunity to fix the mistake.
			System.out.println("You have entered a value out of range.");
			System.out.println("Please, enter a value between 0 and 10(e.g. 7)");
			score = input.nextFloat();
		}//End inner loop
		
		//Invoke confirmation method.
		//score is being passed as an argument
		if(confirmation(score)) {
			Flag = false;
		}
		
		//If confirmation method returns true the loop is over and the program
		//will continue with the next score. If it returns false the method will
		//start again.
		}while(Flag);//End outer loop
		return score;
	}
	/*
	 * The calcScore method will use the five scores as parameters.
	 * It will calculate and display the average of the five scores 
	 * dropping the highest and lowest score.
	 * It will not return values but it will display the average of the five scores .
	 */
	public static void calcScore(float score1, float score2, float score3, float score4, float score5 ) {
		float  lowest; //It saves the lowest value of the five scores.
		float highest; //It saves the highest value of the five scores.
		float acum; //Accumulates the three values minus the lowest and highest.
		
		//Invoke findLowest method
		//The score of every judge is being passed
		lowest = findLowest(score1, score2, score3, score4, score5);
		
		//Invoke findHighest method
		//The score of every judge is being passed
		highest = findHighest(score1, score2, score3, score4, score5);
		acum = (score1+score2+score3+score4+score5) - lowest - highest;
		System.out.printf("\nThe average of the scores is = %.1f", acum/3);
	}
	/*
	 * The findLowest method will use the five scores as parameters.
	 * It will find the lowest value of the five scores and return it.
	 */
	public static float findLowest(float n1, float n2, float n3, float n4, float n5 ) {
		 if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5)
			 return n1;
		 else if ( n2 < n3 && n2 < n4 && n2 < n5)
			 return n2;
		 else if ( n3 < n4 && n3 < n5)
			 return n3;
		 else if ( n4 < n5)
			 return n4;
		 else 
			 return n5;
	}
	/*
	 * The findHighest method will use the five scores as parameters.
	 * It will find the highest value of the five scores and return it.
	 */
	public static float findHighest(float n1, float n2, float n3, float n4, float n5 ) {
		
		 if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5)
			 return n1;
		 else if ( n2 > n3 && n2 > n4 && n2 > n5)
			 return n2;
		 else if ( n3 > n4 && n3 > n5)
			 return n3;
		 else if ( n4 > n5)
			 return n4;
		 else 
			 return n5;
	}	
	/*
	 * The confirmation method will use confirm as a parameter.
	 * It will prompt the user with message confirming that the score entered is correct.
	 * It will return true if the answer is yes(Y) or false is the answer is no(N).
	 */
	public static boolean confirmation(float confirm) {
		String answer;//answer will stored the response from the user.
		Scanner input = new Scanner(System.in);//Start scanner inside confirmation.
		//Get user input
		System.out.printf("Please, confirm that you have entered = %.1f (Y/N)\n", confirm);
		answer = input.nextLine();
		
		//Invoke validationCharacter method
		//answer is being passed as an argument
		while(validationCharacter(answer)) {//Start loop
			//Prompt user with friendly message and the opportunity to fix the mistake.
			System.out.println("You have entered an invalid answer!");
			System.out.println("Please, enter Y for yes or N for no");
			answer = input.nextLine();
		}//End loop
		
		if (answer.equalsIgnoreCase("Y")) 
			return true;
		else 
			return false;
		
	}
	/*
	 * The validation character method will use letter as a parameter.
	 * It will check if the user enter Y or N as an answer.
	 * It will return false if the character is valid.
	 * It will return true if the character enter is invalid
	 */
	public static boolean validationCharacter( String letter) {
		//The condition is that the answer must be one character long and a character
		//between Y and N (Ignoring case).
		if(letter.length() == 1 && (letter.equalsIgnoreCase("y") || letter.equalsIgnoreCase("n") )) 
			return false;
		else 
			return true;
		}
/*
 * The validation method will use answer as a parameter.
 * It will check if the value entered is between 0 and 10.
 * It will return false if the value meet the conditions.
 * It will return true if the value is out of range.
 */
	public static boolean validation(float answer) {
		if(answer >=0 && answer <=10) 
			return false;
	
		return true;
		}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
