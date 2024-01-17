package practice;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Read the user input as an integer
        int number = scanner.nextInt();

        // Check if the entered number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }

    // Function to check if a number is prime
    private static boolean isPrime(int n) {
        // 0 and 1 are not prime numbers
        if (n <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }
}
