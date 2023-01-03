//Jason Buras Problem 8: Around the Clock
import java.util.Scanner;
public class AroundTheClock
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int depart = obj.nextInt();
		int travel = obj.nextInt();
		int arrival = (depart + travel);
		System.out.printf("%d\n", arrival % 12);
	}
}