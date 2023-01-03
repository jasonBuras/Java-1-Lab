//Jason Buras Problem 2: Time
public class Time{

	public static double secondsToMinutes(int seconds){ 
		return (double) seconds/60;
	}
	
	public static double secondsToHours(int seconds){
		double minutes= seconds/60.0;
		return minutes/60.0;
	}

	public static double secondsToDays(int seconds){
		double minutes=seconds/60.0;
		double hours=minutes/60.0;
		return hours/24.0;
	}

	public static double secondsToYears(int seconds){
		double minutes=seconds/60.0;
		double hours=minutes/60.0;
		double days=hours/24.0;
		return days/365.0;
	}

	public static double minutesToSeconds(double minutes){
		return 60*minutes;
	}

	public static double hoursToSeconds(double hours){
		double minutes=hours*60;
		return minutes * 60;
	}

	public static double daysToSeconds(double days){
		double hours=days*24;
		double minutes=hours*60;
		return minutes*60;
	}

	public static double yearsToSeconds(double years){
		double days=years*365;
		double hours=days*24;
		double minutes=hours*60;
		return minutes*60;
	}
}