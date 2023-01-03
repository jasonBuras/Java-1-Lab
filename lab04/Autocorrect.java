//Jason Buras Problem 5: Autocorrect
/* Input:					Output:
 * Helo Wolrd				Hello World
 * Helo Hello Wolrd World
 *
 * yuDodat?					WhyYouDoThat?
 * y Why u You dat That 	
 * 
 * h3110 70 411				hello to all
 * 3 e 1 l 0 o 4 a 7 t	
 */
import java.util.Scanner;
public class Autocorrect{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Cases: ");
		int cases = obj.nextInt();
		obj.nextLine();

		for (int i=0;i<cases;i++){
			String autoCorrect = "";
			System.out.print("Input: ");
			String input = obj.nextLine();
			System.out.print("dictionary: ");
			String dict = obj.nextLine();
			Scanner reader = new Scanner(dict);
			while (reader.hasNext()){
				String key = reader.next();
				System.out.printf("key: %s%n", key);
				String value = reader.next();
				System.out.printf("value: %s%n", value);
				input = input.replace(key, value);
				System.out.printf("input: %s%n", input);
			}
			System.out.println(input);
		}
	}
}
