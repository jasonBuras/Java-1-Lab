//Jason Buras Problem 6: Log It
import java.util.Scanner;


public class LogIt{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int cases=obj.nextInt();
		obj.nextLine();

		for (int i=0;i<cases;i++){
			int maxNum = obj.nextInt();
			double guess= Math.ceil((Math.log(maxNum))/(Math.log(2)));
			System.out.printf("%.0f\n",guess);
		}
		
		
	
	}
}