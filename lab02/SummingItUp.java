/*Jason Buras Problem 1: Summing It Up
Write a program, which takes two distinct integers separated by space 
as input and prints the sum of all the integers between them, including 
the two given numbers. Note that the numbers can appear in either order. 
You may assume that both numbers are between
–10, 000 and 10, 000.
For example, if the input is as follows:
10 4
the output should be 49, since 10+9+8+7+6+5+4=49.
Similarly, if the input is
-3 10
the output should be 49,
since (-3) + (-2) + (-1) + 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49

Input
The input will begin with a single line containing T , the number of test 
cases to follow. The remaining lines contain the lines to be calculated. 
Each of these lines has two integers separated by a single space.

Output
The output should consist of the sum of all numbers between the two input numbers.

Sample Input	Sample output
2
10 4				49
-3 –10				49					*/

import java.util.Scanner; //import Scanner tool
public class SummingItUp { //class name
    public static void main(String[] args) { //We should get into this later in the semester, but this is super cool
        Scanner obj = new Scanner(System.in);//naming my scanner tool
        int testCases,num1,num2,sum,temp;//declaring integers
        testCases = obj.nextInt();/*Here's where the 'T' comes into play from the instructions. This determines the number of test cases to follow.*/  
        while(testCases>0){ //This is where the loop begins. 
            num1 = obj.nextInt(); //num1 user input
            num2 = obj.nextInt(); //num2 user input

            if(num2<num1){ //This little loop makes sure it's the bigger number comes first (this is kind of a rinkydink ass work around because I kept running into issues)
                temp = num1; //temp is just short for temporary. It goes away after this loop. It just swaps the variables if num1 is greater than num2.
                num1 = num2; 
                num2 = temp;
            }//ends the if loop

            sum = 0; //This just starts the sum at 0
            for(int i = num1;i<=num2;i++){ /*does maths. the ';' seperates statements. i = num1 simply changes num1 to i; i<=num2 is stating a condition the code block MUST follow; i++ executes everytime until i=num2;
            											 i = num1 is executed (one time) before the execution of the code block. Basically just changes num1 to i
														 i<= num2 defines the condition for executing the code block. 
														 i++ is executed (every time) after the code block has been executed.*/

                sum += i; /* += is a special type of assignment operator that adds 
                				the value of the expression on the right side of the 
                				operator to the value of the variable on the left side 
                				of the operator, and replaces the original value of the 
                				variable with the new value*/
            }
            System.out.println(sum);//Prints out the sum of the numbers in between the numbers input on lines 35/36 by doing math in the code block loop above. 

            testCases--; /*testCases determines how many PAIRS of numbers you want to run through the code before it terminates. 
            If you type '10' for the user input on line 33, you'll type num1, num2, get the sum, and then the system will loop back to line 35
            where you'll have to define the inegers num1 and num2 again. */
        }//loop ends here
    }
}