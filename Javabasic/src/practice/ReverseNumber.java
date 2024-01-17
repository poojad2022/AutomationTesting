package practice;



	import java.util.Scanner;

	public class ReverseNumber {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input from the keyboard
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");

	        // Read the input as an integer
	        int num = scanner.nextInt();

	        
	        // Reverse the number
	        int reversedNum = reverseNumber(num);

	        // Display the reversed number
	        System.out.println("Reversed number: " + reversedNum);
	    }

	    // Function to reverse a number
	    private static int reverseNumber(int num) {
	        int reversedNum = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }

	        return reversedNum;
	    }
	}

