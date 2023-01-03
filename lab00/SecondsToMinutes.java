//Jason Buras Problem 6: SecondsToMinutes
//import section
import java.util.Scanner;

public class SecondsToMinutes{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		double seconds= obj.nextInt();
		double minutes= seconds/60;
		System.out.println(minutes);
	}
}