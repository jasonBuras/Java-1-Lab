//Jason Buras Problem 3: An Interesting Problem
import java.util.Scanner;
public class AnInterestingProblem{

public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int cases = obj.nextInt();
		for(int i=1;i<=cases;i++) {
		double initialAmount = obj.nextDouble();
		double interestRate = obj.nextDouble();
		int count = 0;
		
		//number of years needed
		while(initialAmount < 1000000) {
		double interest = (initialAmount * interestRate)/100;
		initialAmount+=interest;
		count += 1;
		}
		System.out.printf("%d years\n",count);
		}
	}

}