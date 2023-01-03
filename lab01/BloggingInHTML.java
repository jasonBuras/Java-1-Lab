//Jason Buras Problem 2: Blogging in HTML
import java.util.Scanner;
public class BloggingInHTML{
	public static void main(String[] args)
	{

		Scanner obj= new Scanner(System.in);
		String header= obj.nextLine();
		String filePath= obj.nextLine();
		String text= obj.nextLine();
		String name= obj.nextLine();
		String date= obj.nextLine();

		System.out.printf("<html><body><h1>%s</h1><img src='%s' /><p>%s</p><small>By %s, %s</small></body></html>\n", header, filePath, text, name, date);

	}
}