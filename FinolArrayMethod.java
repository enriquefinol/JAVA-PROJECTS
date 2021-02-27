/*
 * Enrique Finol
 * Description: The following program will take an array from the main
 * class and send it as an argument to five different methods in order to accomplish 
 * different actions. Display the values of the array, display values 
 * in reverse, display the sum of the values. display all the values less than 
 * certain argument, and display the values higher than the calculated average.
 */
public class FinolArrayMethod {
    public static void main (String args[]) {
    	//Eight integers array
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7}; 
        int limit = 12; //Assigned limiting argument.
        System.out.println("Integers in the array: "); //Title of the output
        
        //Invoke display method
        //array numbers is passed as argument.
        display(numbers);
        //Leaving empty line for organization
        System.out.println();
        
        //Invoke displayReverse method
        //array numbers is passed as argument.
        displayReverse(numbers);
        //Leaving empty line for organization
        System.out.println();
        
        //Invoke displaySum method
        //array numbers is passed as argument.
        displaySum(numbers);
        
        //Invoke displayLessThan method
        //array numbers and limit are passed as arguments.
        displayLessThan(numbers, limit);
        //Leaving empty line for organization
        System.out.println();
        
        //Invoke displayHigherThanAverage method
        //array numbers is passed as argument.
        displayHigherThanAverage(numbers);
        
    }
    /*
     * The display method will use the array numbers as parameter.
     * It will not return any value.
     * It displays all the elements in the array passed.
     */
    public static void display(int[] numbers) {
    	//For loop goes through every value an prints it
    	for(int i = 0; i < numbers.length; i++) {
    		System.out.printf("%d ", numbers[i]);
    	}	
    }
    /*
     * The displayReverse method will use the array numbers as parameter.
     * It will not return any value.
     * The displayReverse method will generate a new array with the values
     * of the array that was passed in reverse order.
     * The display method is going to be used to display the values of 
     * the new array. This is an example of how to reuse code.
     */
    public static void displayReverse(int[] numbers) {
        // reverseArray will contain the values of the
    	// array numbers in reverse order.
    	int[] reverseArray = new int[numbers.length];
    	System.out.println("\nArray in reverse order: "); //Title of the output
    	
    	//For loop will have two initializers; one that goes through the 
    	//array numbers starting in position 0, and the other one 
    	//goes through the reverseArray starting in the last position of it.
    	for(int  i =0, j=reverseArray.length -1;i<numbers.length; i++,j-- ) {

    		//The value in the first position of numbers will be assigned to 
    		//the last position of reverseArray
    		reverseArray[j]=numbers[i];
    	}
    	//Invoke display method
    	//reverseArray is being passed as argument.
    	display(reverseArray);
    }
    /*
     * The displaySum method will use the array numbers as parameter.
     * It will not return any value.
     * It will display the sum of all the elements inside the array.
     */
    public static void displaySum(int[] numbers) {
    	int acum = 0; // acum will accumulate the values inside the array.
    	//The for loop will pass through all the values in the array and 
    	//stored them inside the variable acum.
    	for(int i = 0; i<numbers.length; i++) {
    		acum = acum + numbers[i];
    	}
    	//Title of the output
    	System.out.println("\nThe sum of all the integers is " + acum);
    }
    /*
     * The displayLessThan method will use the array numbers and limit as parameters.
     * It will not return any value.
     * It will display the values that are less than the limit passed.
     */
    public static void displayLessThan(int[] numbers, int limit) {
    	//Title of the output
    	System.out.println("\nThe values less than limit(" + limit+"):");
    	
    	//For loop goes through the values in the array and compares them with
    	//the limit passed. If the condition is true the value(s) will be displayed
    	for(int i = 0; i<numbers.length ; i++) {
    		if (numbers[i] < limit) {
    			System.out.printf("%d ",numbers[i]);
    		}
    	}
    }
    /*
     * The displayHigherThanAverage method will use the array numbers as parameter.
     * It will not return any value.
     * It will display the values that are higher than the calculated average 
     */
    public static void displayHigherThanAverage(int[] numbers) {
    	int acum = 0; // acum will accumulate the values inside the array.
    	float ave; // average of the values inside the array
    	
    	//Get the sum of all the values inside the array
    	for(int i = 0; i<numbers.length; i++) {
    		acum = acum + numbers[i];
    	}
    	
    	//Calculate the average with sum and the length of the array
    	//In order to be more accurate the numbers will be treated as float
    	ave = acum / (float) numbers.length;
    	
    	//Title of the output
    	System.out.println("\nThe values higher than the average("+ave+"):");
    	
    	//For loop goes through all the values in the array and compared with 
    	//the calculated average rounded.
    	//If the condition is true it will display the value(s)
    	for(int i = 0; i<numbers.length; i++) {
    		if(numbers[i] > Math.round(ave)) {
    			System.out.printf("%d ",numbers[i]);
    		}
    	}
    }
    
}
























