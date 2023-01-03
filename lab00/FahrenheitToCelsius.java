//Jason Buras Problem 7: FahrenheitToCelsius
//import section
import java.util.Scanner;

public class FahrenheitToCelsius{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		double Fahrenheit= obj.nextInt();
		double Celsius= (Fahrenheit - 32) * (5.0/9.0);
		System.out.println(Celsius);
	}
}