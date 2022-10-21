import java.util.Scanner;

class DivideByZero{
	public String divideTwoNumbers(int number1,int number2) {
		String str = "";
		try {
			if(number2 == 0)
				throw new ArithmeticException();
			else
				str += "The answer is "+(number1/number2)+".";
		}
		catch(ArithmeticException ae) {
			str += "Division by zero is not possible." ;
		}
		finally {
			str += "Thank you for using the application.";
		}
		return str;
	}
}
public class DivideByZeroMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DivideByZero d = new DivideByZero();
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = d.divideTwoNumbers(a,b);
		System.out.println(s);

	}

}
