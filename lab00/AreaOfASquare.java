//Jason Buras Problem 1: AreaOfASquare
//import section
import java.util.Scanner;

public class AreaOfASquare{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int length= obj.nextInt();
		int area=length*length;
		System.out.println(area);
	}
}