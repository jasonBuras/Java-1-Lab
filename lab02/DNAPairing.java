//Jason Buras Problem 8 DNA Pairing
/*
Problem 8: DNA Pairing (10 points)
Scanner has a method useDelimiter that alters the break point for pulling text from input stream. To grab 1 letter at a time, use empty string as delimiter i.e. useDelimiter("")
Scanner has a method that returns a boolean indicating whether a next integer exists in its inputstream ( hasNext() )
Scanner objects can be initialized to to scan String data as input.
Input
The first line is the number of test cases. Then each additional line contains a DNA sequence of nucleobases that comprise a segment of one strand of DNA. Bases include "A", "C", "G", "T"
Output
Your program must display the original sequence of a DNA stand along with it’s appropriately matched compliment pair. 
AGAATTGCATAG
TCTTAACGTATC

GGATTCACATAG
CCTAAGTGTATC

ATGCATGCATGC
TACGTACGTACG
*/
import java.util.Scanner;
public class DNAPairing{
	public static void main(String args[]){

		Scanner obj =new Scanner(System.in);
		int cases= obj.nextInt();
		obj.nextLine();

		for (int i=0; i<cases; i++){

			String sequence = obj.next(); 
			Scanner reader = new Scanner(sequence);
			String compliment = "";
			reader.useDelimiter("");

			while (reader.hasNext()){
				String test = reader.next(); 
				if (test.equals("A")){
					compliment += 'T';
				}
				if (test.equals("T")){
					compliment += 'A';
				}
				if (test.equals("G")){
					compliment += 'C';
				}
				if (test.equals("C")){
					compliment += 'G';
				}
			}
			
			System.out.println(sequence);
			System.out.println(compliment); 
			System.out.println();
		}
	} 
}