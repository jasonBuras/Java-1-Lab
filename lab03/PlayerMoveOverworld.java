/* Jason Buras Problem 6: Player Move Overworld
Input:			Output:
2
0 0				-3 -2
w w a a a

9 4				9 4
s d w a 				*/

import java.util.Scanner;
public class PlayerMoveOverworld{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		int cases = obj.nextInt();
		obj.nextLine();
		

		for (int i=0; i<cases;i++){
			
			int playerX= obj.nextInt();
			int playerY= obj.nextInt();
			obj.nextLine();

			String movement = obj.nextLine();
			Scanner reader= new Scanner(movement);			
			while (reader.hasNext()){
				String choice = reader.next();
				switch(choice){
					case "w": playerY--; break;
					case "a": playerX--; break;
					case "s": playerY++; break;
					case "d": playerX++; break;
				}
				
			}				System.out.printf("%d %d\n", playerX, playerY);


			
		}

	}
}