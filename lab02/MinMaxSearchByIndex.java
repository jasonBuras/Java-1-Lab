/* Problem 5: Min/Max Search by Index
Develop a program that, given a sequence S of integers as input, produces as output two sequences of 
positive integers, the first of which indicates all those positions in S at which S's minimum value 
occurs and the second of which indicates all those positions at which S's maximum value occurs. 
Positions are numbered starting at zero (0).
Facts
 Scanner has a method that returns a boolean indicating whether a next integer exists in its input stream ( hasNextInt() )
 Scanner objects can be initialized to to scan String data as input.

Input
The input will begin with a single line containing T , the number of test cases to follow. The remaining lines contain the 
T sequences, one line per sequence. Each of these lines contains the values in the sequence. Each such value is separated 
from the next by at least one space.

Output
For each sequence given as input, there should be four lines of output. The first line echos the given sequence. The second 
line indicates the positions at which the minimum value occurs. The third line indicates the positions at which the maximum 
value occurs. The fourth line is blank.

Sample Input 							Sample Output
3										

3 6 -1 4 6 5 3							3 6 -1 4 6 5 3
										2
										1 4

0 0 0 0									0 0 0 0
										0 1 2 3
										0 1 2 3

-4 45 2 0 3 5 11 -7 854 25 3 -7 4 -3	-4 45 2 0 3 5 11 -7 854 25 3 -7 4 -3
										7 11
										8

*/

import java.util.Scanner; //Import scanner
class MinMaxSearchByIndex //set class name
{
	public static void main(String args[]) //Declared main function
	{
		Scanner obj =new Scanner(System.in); //create scanner class
		int cases= obj.nextInt();
		obj.nextLine();

		for (int i=0; i<cases; i++)
		{
			String sequence = obj.nextLine();
			Scanner reader = new Scanner(sequence);
			int max = reader.nextInt();
			int min = max;
			int index = 0;
			String max_indices = "" + index;
			String min_indices = "" + index;

			while (reader.hasNextInt())
			{
				int number = reader.nextInt();
				index++;

				if (number > max){
					max = number;
					max_indices = "" + index;
				}
				else if (number == max){
					max_indices += " " + index;
				}
				if (number < min){
					min = number;
					min_indices = "" + index;
				}
				else if (number==min){
					min_indices += " " +index;
				}

			}
			System.out.println(sequence);
			System.out.println(min_indices);
			System.out.println(max_indices);
			System.out.println();

		}

		

	} 
}