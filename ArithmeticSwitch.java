import java.util.Scanner;

class ArithmeticSwitch{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch,a,b;
		do{
		System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter choice : ");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1: System.out.println("Enter numbers : ");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+"+"+b+"="+(a+b));
				break;
	
			case 2: System.out.println("Enter numbers : ");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+"-"+b+"="+(a-b));
				break;
				
			case 3: System.out.println("Enter numbers : ");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+"x"+b+"="+(a*b));
				break;

			case 4: System.out.println("Enter numbers : ");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+"/"+b+"="+(a/b));
				break;
			default: System.out.println("Invalid Choice");
		}
		}while(ch<5);	
	}
}