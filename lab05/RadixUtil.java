//Jason Buras Problem 2: Radix Util
public class RadixUtil{
	public static int base2(String binary){
		return Integer.parseInt(binary, 2);
	}
	public static String base2(int decimal){
		return Integer.toString(decimal, 2);
	}
	public static int base8(String octal){
		return Integer.parseInt(octal, 8);
	}
	public static String base8(int decimal){
		return Integer.toString(decimal, 8);
	}
	public static int base16(String hexadecimal){
		return Integer.parseInt(hexadecimal, 16);
	}
	public static String base16(int decimal){
		return Integer.toString(decimal, 16);
	}
	
}