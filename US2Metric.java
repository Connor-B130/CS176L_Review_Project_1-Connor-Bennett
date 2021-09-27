
public class US2Metric 
{

	public static void main(String[] args) 
	{
		System.out.println("Inches\tCentimeters\tPounds\tKilograms");
		System.out.println("------\t-----------\t------\t---------");
		
		for(int i = 1; i <= 50; i++)
		{
			int inches = i;
			int pounds = i;
			double centimeters = i * 2.54;
			double kilograms = i * 0.453592;
			
			System.out.print(inches + "\t ");
			System.out.printf("%.2f", centimeters);
			System.out.print("\t\t " + pounds + "\t ");
			System.out.printf("%.2f", kilograms);
			System.out.println();
		}
		
	}

}
