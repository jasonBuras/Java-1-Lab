//Jason Buras Problem 6: ASCII encodings
import java.util.Scanner;
public class ASCIIEncodings{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int d = obj.nextInt();
		int e = obj.nextInt();
		int f = obj.nextInt();
		char letter1 = (char) a;
		char letter2 = (char) b;
		char letter3 = (char) c;
		char letter4 = (char) d;
		char letter5 = (char) e;
		char letter6 = (char) f;

		System.out.print(letter1);
		System.out.print(letter2);
		System.out.print(letter3);
		System.out.print(letter4);
		System.out.print(letter5);
		System.out.println(letter6);
	}
} 