//Jason Buras Problem 4: Min/Max Search by Value
import java.util.Scanner;

public class MinMaxSearchByValue
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		input.nextLine();

		for (int i=0; i<cases; i++)
		{
			String sequence = input.nextLine();
			Scanner reader = new Scanner(sequence);
			int max = reader.nextInt();
			int min = max;

			while (reader.hasNextInt() == true)
			{
				int number = reader.nextInt();

				if (number > max)
				{
					max = number;
				}
				if (number < min)
				{
					min = number;
				}
			}
			System.out.println(sequence);
			System.out.println(min);
			System.out.println(max);
			System.out.println();
		}
	}
}