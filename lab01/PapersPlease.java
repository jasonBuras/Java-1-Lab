//Jason Buras Probelm 3: Papers Please
// Three different forms of ID. Determine whether the passenger has
// the sufficient identification to board the plane or not
// Fact1: A passport is enough for a boarding pass
// Fact2: Without a passport, passengers must have two other forms of ID (Driver's License or Birth Certificate)
// If the above two condition are not met, then they are denied

// Need three boolean inputs. Input 1 determines Fact 1, Second Inpute determines Fact 2, etc.
// Output should display as a boolean result whether they can board or not
// true false false = true
// false true true = true
// false false false = false
import java.util.Scanner;

public class PapersPlease{
	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
		boolean hasPassport= obj.nextBoolean();
		boolean hasID= obj.nextBoolean();
		boolean hasBirthCertificate= obj.nextBoolean();

		boolean canBoard = hasPassport || hasID && hasBirthCertificate; 

		System.out.printf("%b\n", canBoard);
	}
}