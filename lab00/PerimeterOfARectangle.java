//Jason Buras Problem 8: PerimeterOfARectangle
//import section
import java.util.Scanner;

public class PerimeterOfARectangle{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		double length= obj.nextInt();
		double width= obj.nextInt();
		System.out.println(2.0*(length+width));
	}
}