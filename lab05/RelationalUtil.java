//Jason Buras Problem 4: Relational Util
public class RelationalUtil{
	public static boolean isIncreasing(int x, int y, int z){
		//Returns true if x is smaller than y and y is smaller than z, exclusive
		return (x < y) && (y<z);
	}
	public static boolean isDecreasing(int x, int y, int z){
		//Returns true if x is larger than y and y is larger than z, exclusive
		return (x > y) && (y > z);
	}
	public static boolean isBetween(int x, int y, int z){
		//Returns true if y is between x and z, inclusive
		return (y >= x) && (y <= z);
	}
	public static boolean isPositive(int x){
		//Returns true if the number is positive
		return x >= 0;
	}
	public static boolean isNegative(int x){
		//Returns true if the number is negative
		return x < 0;
	}
	public static boolean overlaps(int min1, int max1, int min2, int max2){
		//Returns true if two line segments, min to max, overlap with one another
		return (min1 <= max2) && (max1 >= min2);
	}
}