//Jason Buras Problem 2: Point of Sale System
import java.util.Scanner;
public class PointOfSaleSystem
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		input.nextLine();

		for (int test=0; test<cases; test++)
		{
			double price =0.0;
			String sequence = input.nextLine();
			Scanner reader = new Scanner(sequence);
			while (reader.hasNextInt() )
			{
				int choice = reader.nextInt();
				switch(choice)
				{
				case 1: price += 1.50; break;
				case 2: price += 1.75; break;
				case 3: price += 2.50; break;
				case 4: price += 2.75; break;
				case 5: price += 0.99; break;
				case 6: price += 1.25; break;
				}
			}
			price = (0.065*price)+price;
			System.out.format("Please pay $%.2f\nThank you for eating at McDowell's!\n",price);
		}
	}
}