
public class TempConvert 
{

	public static void main(String[] args) 
	{
		System.out.println("Fahrenheit\t\tCelcius");
		for(int tempF = 0; tempF <= 212;tempF += 2)
		{
			System.out.print(tempF + "\t\t\t");
			double tempC = (tempF - 32)/1.8;
			System.out.printf("%.2f", tempC);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Celcius\t\t\tFahrenheit");
		for(int tempC = 0; tempC <= 100;tempC += 2)
		{
			System.out.print(tempC + "\t\t\t");
			double tempF = (tempC * 1.8) + 32;
			System.out.printf("%.2f", tempF);
			System.out.println();
		}

	}

}
