//Jason Buras Problem 6: Chair Scavenging
import java.util.Scanner;
public class ChairScavenging{
public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
	int cases = obj.nextInt();
	obj.nextLine();

	for (int i =0;i<cases;i++){
		int people = obj.nextInt();
		int chairs = obj.nextInt();
		

	if (people >= chairs){
		int chairsNeeded = people - chairs;
		
		System.out.println(chairsNeeded);
		}
		else if (people <= chairs){
		System.out.println(0);
		}


		obj.nextLine();
		}
	}

	
}
