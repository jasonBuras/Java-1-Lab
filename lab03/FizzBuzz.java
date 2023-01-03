//Jason Buras Problem 3: FizzBuzz
import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int cases = obj.nextInt();
		obj.nextLine();

		for (int i=0;i<cases;i++){
			
			int num = obj.nextInt();
			/*for (int j = 1; j <= num; j++){*/
				if(num % 3 == 0 && num % 5 == 0){
					System.out.println("fizzbuzz");
				}
				else if (num % 3==0){
					System.out.println("fizz");
				}
				else if (num % 5 ==0){
					System.out.println("buzz");
				}
				else{
					System.out.println(num);
				}

			}
			
		} 
}
