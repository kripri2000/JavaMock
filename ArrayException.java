import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
	
	public String getPriceDetails() {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array : ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the price details ");
			for(int i=0;i<size;i++)
				arr[i] = sc.nextInt();
			System.out.println("Enter index : ");
			int index = sc.nextInt();
			return "The array element is "+arr[index];
		}
		catch(ArrayIndexOutOfBoundsException ae){
			return "Array index is out of range";
		}
		catch(InputMismatchException ie) {
			return "Input was not in the correct format";
		}
		
	}
	public static void main(String[] args) {
		
		ArrayException aeObj = new ArrayException();
		String str = aeObj.getPriceDetails();
		System.out.println(str);
		}
		
			
}


