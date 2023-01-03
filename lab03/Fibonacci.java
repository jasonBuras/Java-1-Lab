//Jason Buras Problem 2: Fibonacci
import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args){

		Scanner input= new Scanner(System.in);
		int cases= input.nextInt();

		for(int i=0;i<cases;i++){
			int position= input.nextInt();
			//The starting two values in the series for this formula may be considered as 0 and 1
			int num1=0;
			int num2=1;
			for(int j=2;j<position;j++){
				int temp=num1;
				num1=num2;
				num2+=temp;//num2=num2+temp;
			}
			int result=(position<1) ? 0 : num1+num2;
			System.out.println(result);
		}
	}
}