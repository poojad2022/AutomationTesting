package practice;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // If the reversed number is equal to the original number, it's a palindrome
        return originalNumber == reversedNumber;
    }
}

