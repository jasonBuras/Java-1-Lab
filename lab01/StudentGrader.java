//Jason Buras Problem 5: Student Grader
// Test average= 40% of final grade
// Lab average= 10% of final grade
// Homework average is worth 50% of final grade
// Input should be three numerical inputs (Floating Point) with a range from 0.0 to any positive number
// First input is test average
// Second Input is homework average
// THird input represents lab
import java.util.Scanner;

public class StudentGrader
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		float testAvg= obj.nextFloat();
		float homeworkAvg= obj.nextFloat();
		float labAvg= obj.nextFloat();
		float finalGrade= (testAvg *0.4f) + (labAvg *0.1f) + (homeworkAvg *0.5f);
		System.out.printf("%.1f\n", finalGrade);
	}
}