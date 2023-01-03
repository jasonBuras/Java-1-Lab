//Jason Buras Problem 7: Flip It
import java.util.Scanner;

public class FlipIt{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int cases = obj.nextInt();
		obj.nextLine();

		for(int i=0;i<cases;i++){
			String text = obj.nextLine();
			Scanner reader=new Scanner(text);
			reader.useDelimiter("");
			String reversed = "";
			while(reader.hasNext()){
				reversed = reader.next() + reversed;
			}
			System.out.println(reversed);
		}
	}
}