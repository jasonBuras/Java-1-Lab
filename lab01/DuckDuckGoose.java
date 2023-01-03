//Jason Buras Problem 9: DuckDuckGoose
import java.util.Scanner;
public class DuckDuckGoose
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int kids = obj.nextInt();
		int ducks = obj.nextInt();
		int goose = kids + ducks;
		System.out.printf("%d\n", goose % kids); 
	}
}