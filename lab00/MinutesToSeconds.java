//Jason Buras Problem 2: MinutesToSeconds
//import section
import java.util.Scanner;

public class MinutesToSeconds{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int minutes= obj.nextInt();
		int seconds= minutes*60;
		System.out.println(seconds);
	}
}