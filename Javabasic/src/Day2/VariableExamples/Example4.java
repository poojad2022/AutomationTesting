package Day2.VariableExamples;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int a;
		int b;
		int c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("Number1 is: "+a);
		System.out.println("Number2 is: "+b);
		System.out.println("Addition of number1 and number2 is: "+c);
		System.out.println("Addition of number1 and number2 is: "+(a+b));//30
		System.out.println("Concatination of number1 and number2 is: "+a+b);
		//re-initilization of 'c'
		c=a*b;
		System.out.println("Number1 is: "+a);
		System.out.println("Number2 is: "+b);
		System.out.println("Multipication of number1 and number2 is: "+c);
		//re-initilization of a & b
		a=60;
		c=a/b;
		System.out.println("Number1 is: "+a);
		System.out.println("Number2 is: "+b);
		System.out.println("Division of number1 and number2 is: "+c);
		System.out.println("Program ends");

	}

}
