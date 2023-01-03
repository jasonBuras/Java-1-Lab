//Jason Buras Problem 7: Rock Paper Scissors
/* Problem 7: Rock Paper Scissors (10 points)
(Game Development) Rock, Paper, Scissors is a hand-based game played between two people. During a match, each player chooses one of three possible options: Rock, Paper, or Scissors. Afterwards, both players reveal their selection simultaneously. Your task is to implement a program that acts as a referee (i.e. game manager) to determine the winner of a rock-paper-scissors game.
Facts
Rock beats Scissors
Scissors beats Paper
Paper beats Rock
If both player selections match then its a tie.
Input
The first line is the number of test cases. Then each additional line will contain two different text inputs. The first text input represents the first player's selection. The second text input represents the second player's selection. Each player selection is limited to: "paper", "rock", "scissors"
Output
Your program must display the final result of that game as on of the following: "Tie!", "Player 1 wins!" or "Player 2 wins" 

Sample input			Sample Output
3						
paper paper 			Tie!	
rock paper 				Player 2 wins!
scissors paper 			Player 1 wins!*/

import java.util.Scanner;
public class RockPaperScissors{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int cases = obj.nextInt();
		obj.nextLine();

		for (int i=0; i<cases; i++){ /* String playerChoice = obj.nextLine(); String player2Choice= obj.nextLine(); */
			
			String playerChoice = obj.next();
			String player2Choice= obj.next();

			if (playerChoice.equals("rock") && player2Choice.equals("scissors") || playerChoice.equals("paper") && player2Choice.equals("rock") || playerChoice.equals("scissors") && player2Choice.equals("paper")){
				System.out.println("Player 1 wins!");
				
			}
			else if (playerChoice.equals("scissors") && player2Choice.equals("rock") || playerChoice.equals("rock") && player2Choice.equals("paper") || playerChoice.equals("paper") && player2Choice.equals("scissors")){
				System.out.println("Player 2 wins!");
				
			}
			else{
				System.out.println("Tie!");
				
			}  
		}
		
	} 
	

} 