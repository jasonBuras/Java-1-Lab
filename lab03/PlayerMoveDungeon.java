/*Jason Buras Problem 7: Player Move Dungeon 
*/
import java.util.Scanner;
public class PlayerMoveDungeon{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		int cases = obj.nextInt(); //The first input is the number of test cases.
		obj.nextLine();
		

		for (int i=0; i<cases;i++){ //Each test case contains three lines of inputs
			
			int gridX= obj.nextInt(); //The first line is two positive integers that represent the dungeon's grid size, rows (length) columns (width).
			int gridY= obj.nextInt();
			obj.nextLine();

			int playerX= obj.nextInt(); //The second line is two non-negative integers representing the player's position in the dungeon grid, x,y.
			int playerY= obj.nextInt();
			obj.nextLine();

			String movement = obj.nextLine();//The third line represents the sequence of player movements "w", "s", "a", "d".
			Scanner reader = new Scanner(movement);

			while(reader.hasNext()){
				String move = reader.next();
				if (move.equals("w") && (playerY > 0)){
					playerY--;
				}
				else if (move.equals("a") && (playerX > 0)){
					playerX--;
				}
				else if (move.equals("s") && (playerY < (gridY - 1))){
					playerY++;
				}
				else if (move.equals("d") && (playerX < (gridX - 1))){
					playerX++;
				}
			} System.out.printf("%d %d\n", playerX, playerY); //The program should print out the final location of the player in the form of <x> <y>, where x and y are the coordinates on the overworld grid.
		}
	}
}
