//Jason Buras Problem 8: Enemy Move
import java.util.Scanner;


public class EnemyMove{
		
		public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int cases=obj.nextInt();
		obj.nextLine();

		for (int i=0;i<cases;i++){
			
			double enemyX = obj.nextDouble(); //x1 0.0
			double enemyY = obj.nextDouble(); //y1 0.0
			double enemySpeed = obj.nextDouble(); //speed 10
			double playerX = obj.nextDouble(); //x2 1.0 
			double playerY = obj.nextDouble(); //y2 1.0
			
			//Uses distance and speed along with coordinates to move the enemy to a new X,Y coordinate. Only if enemy cannot reach player.	
			if (enemySpeed < (distance(enemyX, enemyY, playerX, playerY))){
            double enemyX2 = enemyX + (enemySpeed/(distance(enemyX, enemyY, playerX, playerY))*(playerX - enemyX)); 
            double enemyY2 = enemyY + (enemySpeed/(distance(enemyX, enemyY, playerX, playerY))*(playerY - enemyY));
            System.out.printf("x=%.1f, y=%.1f%n", enemyX2, enemyY2);
            }
            else if (enemySpeed >= (distance(enemyX, enemyY, playerX, playerY))){
                enemySpeed = distance(enemyX, enemyY, playerX, playerY);
                double enemyX2 = enemyX + (enemySpeed/(distance(enemyX, enemyY, playerX, playerY))*(playerX - enemyX)); 
                double enemyY2 = enemyY + (enemySpeed/(distance(enemyX, enemyY, playerX, playerY))*(playerY - enemyY));
                System.out.printf("x=%.1f, y=%.1f%n", enemyX2, enemyY2);
            }
		}
	}
	public static double distance (double enemyX, double enemyY, double playerX, double playerY){
				
				double x = Math.pow(playerX - enemyX, 2);
				double y = Math.pow(playerY - enemyY, 2);
				double dist = Math.sqrt(x+y);

				return dist;
	}
	
	


}