//Jason Buras Problem 5: AreaOfATriangle
//import section
import java.util.Scanner;

public class AreaOfATriangle{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		double base= obj.nextInt();
		double height= obj.nextInt();
		double area= 0.5*base*height;
		System.out.println(area);
	}
}