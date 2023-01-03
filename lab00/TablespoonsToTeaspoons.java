//Jason Buras Problem 3: TablespoonsToTeaspoons
//import section
import java.util.Scanner;

public class TablespoonsToTeaspoons{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int teaspoon= obj.nextInt();
		int tablespoon= teaspoon*3;
		System.out.println(tablespoon);
	}
}