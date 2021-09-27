import java.util.Scanner;

public class SumofOdd 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int n = in.nextInt();
		
		int sum = 0;
		int currentOddNumber = 1;
		
		System.out.println();
		System.out.println("The first " + n + " positive integers are: ");
		
		for(int i = 1; i <= n; i++)
		{
			
			System.out.print(currentOddNumber + " ");
			sum += currentOddNumber;
			currentOddNumber += 2;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("The sum of the first " + n + " positive odd integers is: ");
		System.out.print(sum);
	}

}
