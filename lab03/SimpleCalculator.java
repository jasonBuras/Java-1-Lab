//Jason Buras Problem 4: Simple Calculator
import java.util.Scanner;
public class SimpleCalculator{
	public static void main(String[] args){

		Scanner input= new Scanner(System.in);
		int cases = input.nextInt();
		int firstnumber, secondnumber, answer=1;
		String operator;
		//for each test case:
		for (int i=0; i<cases;i++){
			firstnumber=input.nextInt();
			operator=input.next();
			secondnumber= input.nextInt();
			switch(operator){
			case "+": {answer= firstnumber + secondnumber;}break;
			case "-": {answer= firstnumber - secondnumber;}break;
			case "*": {answer= firstnumber * secondnumber;}break;
			case "/": {answer= firstnumber / secondnumber;}break;
			case "%": {answer= firstnumber % secondnumber;}break;
			case "**": {
				answer= 1;
				for(int j=0; j<secondnumber;j++){
					answer*=firstnumber; //answer= answer * firstnumber
				}

			}break;
		}System.out.println(answer);
		}
	}
}