package Assignment;

public class SimpleIntrest {

	public static void main(String[] args) {
		float P = 2000, R = 6, T = 3;
		/*
		 * P is Principal amount. R is rate per annum. T is time in years.
		 * 
		 * For example: Let’s say a man deposit 2000 INR in bank account at a interest
		 * rate of 6% per annum for 3 years, calculate the simple interest at the end of
		 * 3 years.
		 */

		// Calculate simple interest
		float SI = (P * T * R) / 100;
		System.out.println("Simple interest = " + SI);

	}

}
