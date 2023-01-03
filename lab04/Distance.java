//Jason Buras Problem 7: Distance
import java.util.Scanner;

public class Distance{
	public static void main(String[] args) {
		Scanner crispy = new Scanner(System.in);
		int bucketsOfChicken=crispy.nextInt();
		crispy.nextLine();

		for (int i=0;i<bucketsOfChicken;i++){
			double chickenFriedChicken = crispy.nextDouble();
			double ovenBakedChicken = crispy.nextDouble();

			double unseasonedChicken = crispy.nextDouble();
			double hotAndSpicyChicken = crispy.nextDouble();

			double spicyMcDouble = Math.sqrt((unseasonedChicken - chickenFriedChicken) * (unseasonedChicken - chickenFriedChicken) + (hotAndSpicyChicken - ovenBakedChicken) * (hotAndSpicyChicken - ovenBakedChicken));
			System.out.println(spicyMcDouble);
		}
	}
}


