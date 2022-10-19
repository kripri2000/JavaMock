import java.util.Scanner;

class TempConvert{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do{
			System.out.print("Enter temperature : ");
			double temp = sc.nextDouble();
			System.out.println("\n1.Fahreinheit to Celsius\n2.Celsius to Fahreinheit\nEnter your choice : ");
			ch = sc.nextInt();
			if(ch == 1)	
				System.out.println(((temp-32)*5)/9+" C");
			else if(ch == 2)
				System.out.println(((temp*9)/5)+32+" F");
			else
				System.out.println("Invalid Choice");
		}while(ch<3);
	}
}


		