//Jason Buras Problem 4: Bouncer Bot
import java.util.Scanner;
public class BouncerBot{
	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
		int currentMonth=obj.nextInt();
		int currentDay= obj.nextInt();
		int currentYear= obj.nextInt();
		int birthMonth= obj.nextInt();
		int birthDay= obj.nextInt();
		int birthYear= obj.nextInt();

		boolean canEnter= currentYear - birthYear >= 21 && currentMonth == birthMonth && currentDay == birthDay;
		System.out.printf("%b\n",canEnter);
			}
}
//I don't wanna just give you the answer but I'll walk you through the way I tackle these assignments.

//Step 1: What's being asked of me? 
//Okay so this is simple. 
//"Your solution must take in a total of six numerical inputs"
//Okay right off the bat I know I need six lines of user input for an integer variable.

//So then I need to figure out what the six variables are.
//"The first three inputs represent the current month, current day, current year as integers"
//"The other three inputs represent the birth month, birthday, birth year as integers."
//Sweet so it's pretty straight forward. I can use easy to follow variables such as:
//currentMonth currentDay currentYear to define the current date.
//birthMonth birthDay birthYear to define patron's age.
//They may enter ONLY IF they are 21+ AND it is currently their birthday
//We are not to us if or else if statements here so we will be relying on:
//&& and
//|| or
//>, <, >=, <=, etc. Greater than, less than, greater than or equal to, less than or equal to, etc.
//== equal to
//
//Step 2a:
//Okay now that we have somewhat of an outline done we need to ask what do we do with all this information.
//Logically to be over 21, one would need to take the current year, subtract it from their birth year and
//determine whether that is greater than or equal to 21. If it is equal to 21, then you need to determine if
//the birth month and birthday day are BOTH greater than or equal to the current month/day
//
//Step 2b:
//If the age doesn't turn out to be greater than or equal to 21, then they are denied entry (false).
//If the age is greater than or equal to 21, then the boolean statement for entry is halfway true.
//The second part of the equation is that it has to be their birthday. So make sure that on top of 
//being 21+, the birthMonth and birthDay match with the currentMonth and currentDay
//If it is determined that it is the patron's birthday, the second half of this boolean statement is true
//So given that the patron's age is greater than or equal to 21 AND it is their birthday. They are granted
//permission to enter the club (true)

