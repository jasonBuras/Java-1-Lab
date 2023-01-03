//Jason Buras Problem 7: How Odd!
import java.util.Scanner;
public class HowOdd
{
	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
		int num = obj.nextInt();
		boolean check = num %2 == 1;
		System.out.printf("%b\n",check);
	}
}