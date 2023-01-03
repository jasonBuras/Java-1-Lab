public class CookingTester
{
	public static void main(String[] args)
	{
		String error;
		error = testTeaspoonToTablespoon();
		if (error != null) { System.out.println(error); return;}
		error = testTablespoonToTeaspoon();
		if (error != null) { System.out.println(error); return;}
		error = testTablespoonToCup();
		if (error != null) { System.out.println(error); return;}
		error = testCupToTablespoon();
		if (error != null) { System.out.println(error); return;}
		error = testOuncesToCup();
		if (error != null) { System.out.println(error); return;}
		error = testCupToOunces();
		if (error != null) { System.out.println(error); return;}
		error = testPintToCup();
		if (error != null) { System.out.println(error); return;}
		error = testCupToPint();
		if (error != null) { System.out.println(error); return;}
		System.out.println("Cooking: Correct!");
	}

	public static String testTeaspoonToTablespoon()
	{
		double portion;

		portion = Cooking.teaspoonsToTablespoons(0);
		if (portion != 0.0) return "Cooking.teaspoonToTablespoon(0)";
		portion = Cooking.teaspoonsToTablespoons(60);
		if (portion != 20.0) return "Cooking.teaspoonToTablespoon(60)";
		portion = Cooking.teaspoonsToTablespoons(3600);
		if (portion != 1200.0) return "Cooking.teaspoonToTablespoon(3600)";
		portion = Cooking.teaspoonsToTablespoons(999999);
		if (portion != 333333.0) return "Cooking.teaspoonToTablespoon(999999)";
		return null;
	}

	public static String testTablespoonToTeaspoon()
	{
		double portion;

		portion = Cooking.tablespoonsToTeaspoons(0);
		if (portion != 0.0) return "Cooking.tablespoonToTeaspoon(0)";
		portion = Cooking.tablespoonsToTeaspoons(60);
		if (portion != 180) return "Cooking.tablespoonToTeaspoon(60)";
		portion = Cooking.tablespoonsToTeaspoons(3600);
		if (portion != 10800) return "Cooking.tablespoonToTeaspoon(3600)";
		portion = Cooking.tablespoonsToTeaspoons(999999);
		if (portion != 2999997) return "Cooking.getportionCirlce(999999)";
		return null;
		
	}

	public static String testTablespoonToCup()
	{
		double portion;

		portion = Cooking.tablespoonsToCups(0);
		if (portion != 0) return "Cooking.tablespoonToCup(0)";
		portion = Cooking.tablespoonsToCups(60);
		if (portion != 3.75) return "Cooking.tablespoonToCup(60)";
		portion = Cooking.tablespoonsToCups(3600);
		if (portion != 225.0) return "Cooking.tablespoonToCup(3600)";
		portion = Cooking.tablespoonsToCups(999999);
		if (portion != 62499.9375) return "Cooking.tablespoonToCup(999999)";
		return null;
	}

	public static String testCupToTablespoon()
	{
		double portion;

		portion = Cooking.cupsToTablespoons(0);
		if (portion != 0.0) return "Cooking.cupToTablespoon(0)";
		portion = Cooking.cupsToTablespoons(60);
		if (portion != 960) return "Cooking.cupToTablespoon(60)";

		portion = Cooking.cupsToTablespoons(3600);
		if (portion != 57600) return "Cooking.cupToTablespoon(3600)";

		portion = Cooking.cupsToTablespoons(999999);
		if (portion != 15999984) return "Cooking.cupToTablespoon(999999)";

		return null;
	}

	public static String testOuncesToCup()
	{
		double portion;

		portion = Cooking.ouncesToCups(1);
		if (portion != 0.125) return "Cooking.ouncesToCup(1)";
		portion = Cooking.ouncesToCups(60);
		if (portion != 7.5) return "Cooking.ouncesToCup(60)";
		portion = Cooking.ouncesToCups(3600);
		if (portion != 450.0) return "Cooking.ouncesToCup(3600)";
		portion = Cooking.ouncesToCups(999999);
		if (portion != 124999.875) return "Cooking.getportionCirlce(999999)";
		return null;
	}

	public static String testCupToOunces()
	{
		double portion;

		portion = Cooking.cupsToOunces(1);
		if (portion != 8) return "Cooking.cupToOunces(1)";
		portion = Cooking.cupsToOunces(60);
		if (portion != 480) return "Cooking.cupToOunces(60)";
		portion = Cooking.cupsToOunces(3600);
		if (portion != 28800) return "Cooking.cupToOunces(3600)";
		portion = Cooking.cupsToOunces(999999);
		if (portion != 7999992) return "Cooking.cupToOunces(999999)";
		return null;
	}

	public static String testPintToCup()
	{
		double portion;

		portion = Cooking.pintsToCups(1);
		if (portion != 2) return "Cooking.pintToCup(1)";
		portion = Cooking.pintsToCups(60);
		if (portion != 120) return "Cooking.pintToCup(60)";
		portion = Cooking.pintsToCups(3600);
		if (portion != 7200) return "Cooking.pintToCup(3600)";
		portion = Cooking.pintsToCups(999999);
		if (portion != 1999998) return "Cooking.pintToCup(999999)";
		return null;
	}

	public static String testCupToPint()
	{
		double portion;

		portion = Cooking.cupsToPints(1);
		if (portion != 0.5) return "Cooking.cupToPint(1)";
		portion = Cooking.cupsToPints(60);
		if (portion != 30) return "Cooking.cupToPint(60)";
		portion = Cooking.cupsToPints(3600);
		if (portion != 1800.0) return "Cooking.cupToPint(3600)";
		portion = Cooking.cupsToPints(999999);
		if (portion != 499999.5) return "Cooking.cupToPint(999999)";
		return null;
	}




}