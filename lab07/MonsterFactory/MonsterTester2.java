public class MonsterTester2
{
	public static void main(String[] args)
	{
		Monster goblin = Monster.spawn("goblin");
		Monster orc = Monster.spawn("orc");
		Monster troll = Monster.spawn("troll");
		System.out.println(goblin);
		System.out.println(orc);
		System.out.println(troll);
	}
}

class Player2 extends Player 
{
	public void takeDamage(int damage)
	{

	}
}