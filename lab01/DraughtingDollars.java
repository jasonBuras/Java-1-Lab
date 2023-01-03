//Jason Buras Problem 1: Draughting Dollars
import java.util.Scanner;

public class DraughtingDollars{
	public static void main(String[] args) {
		//Data modeling
		double kegsInGallons=15.5; //fact1
		int gallonInOunces=128; //fact2
		int pintsInOunces=16; //fact 3

		//step0
		Scanner obj= new Scanner(System.in);
		double kegRatio=obj.nextDouble();
		double priceOfPints=obj.nextDouble();
		// step1: Convert kegs -> Ounces
		double kegInOunces= kegsInGallons*gallonInOunces;
		//step2: Determine how many ounces are left in the keg, given the percentage 
		double ouncesLeft=kegInOunces*kegRatio;
		//step 3: Determine how many pints are left
		int pintsLeft= (int) (ouncesLeft/pintsInOunces);
		//step 4: Determine the price of beer left
		double priceOfKeg=priceOfPints*pintsLeft;

		System.out.printf("There is $%.2f of beer left in keg\n", priceOfKeg); 

	}

}