import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
		int total = 0;
		double average;
		int[] numbers = new int [6];
		
	System.out.println("Enter 5 numbers: ");
		for (int i = 1; i < 6; i++) {
	System.out.println("Number"+i+": ");
		numbers[i] =  input.nextInt();
		total = total + numbers[i]; 
		    }
		    
		average = total / 5;
	System.out.println("The total is: " + total);
	System.out.println("The average is: " + average);
		int largest = 0;
		for (int i = 1; i < 6; i++) {
		if (numbers [i] > largest)
		largest = numbers[i];
		    }
		    
	System.out.println("The largest number is: " + largest);
	}
}

