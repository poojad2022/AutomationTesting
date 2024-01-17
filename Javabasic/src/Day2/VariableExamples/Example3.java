package Day2.VariableExamples;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		//datatype variablename;
		int age;
		long number;
		float roi;
		double salary;
		char grade;
		boolean status;
		//initialize variablename
		age=25;
		number=98765412;//98765412l (you can add 'l' at the end of its value)
		roi=7.5f;//7 | 15l (for float at the end 'f' is mandatory but other then decimal its not required)
		salary=25000.56d;// 25000.56 | 15 | 15.5f 
		grade='A';//'a' | '+' | ';'
		status=true;//false
		/*
		System.out.println("age");
		System.out.println(age);
		*/
		System.out.println("age= "+age);
		System.out.println("number= "+number);
		System.out.println("roi= "+roi);
		System.out.println("salary= "+salary);
		System.out.println("grade= "+grade);
		System.out.println("status= "+status);
		System.out.println("Program ends");
	}
}
/*
+ -->Addition
	num1+num2=num3
	10+20=30

+ --> concatination
	"Hello"+10=Hello10
	"Hello"+"Hi"+10=HelloHi10
	"Hi"+20+30
		Hi20+30=Hi2030
	20+30+Hi=50Hi
*/