/*Jason Buras Problem 5: Factorials 
Input
The first line is the number of test cases. Each line thereafter will consist of a integer to be solved as a factorial.
Output
The output must list the solution for the appropriate input value. */
import java.util.Scanner;
public class Factorials{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int cases = obj.nextInt();
		obj.nextLine();

		for (i=0;i<cases;i++){
			int num = obj.nextInt();
			Scanner reader = new Scanner(num);
			while (reader.hasNext()){
				(num - 1) * num % 1;
			}
		} System.out.print(num);
			//3, 3*2*1; 2, 2*1; 4, 4*3*2*1;
	}
}