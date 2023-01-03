//Jason Buras Problem 1: Array Util 
public class ArrayUtil{

	//Part 1: Reverse Array
	public static void reverse(String[] array){
		//Reverses the elements within a String array
		String rev;
		for(int i=0;i<array.length/2;i++){
			rev=array[i];
			array[i]=array[array.length - i -1];
			array[array.length - i - 1] = rev;
		}
	}

	//Part 2: Array Resize
	public static String[] resize(String[] array){
		//Returns new array with the same elements as original but that's twice the length
		String[] resized = new String[array.length*2];
		for (int i=0;i<array.length;i++){
			if(i<array.length){
				if(i<array.length){
					resized[i]=array[i];
				}
				else{
					resized[i]=null;
				}
			}
			
		}return resized;
		

	}

	//Part 3: Add Item
	public static String[] add(String element, String[] array){
		//Returns an array with new element inserted at end, resize array if too small
		for (int i=0;i<array.length;i++){
			if(array[i] == null){
				array[i]=element;
				return array;
			}
		}
		String newArr[]=resize(array);
		for(int i=0;i<array.length;i++){
			newArr[i]=array[i];
		}
		newArr[array.length]=element;
		return newArr;
	}

	//Part 4: Array Contains
	/*public static boolean contains(String element, String[] array){
		//returns true if the array contains the given String, otherwise false
		boolean contains;
		for (int i=0; i<array.length;i++){
			
			contains= array[i] != null && array[i].equals(element);
			
		} return contains;
	}*/

	//Part 5: MinMax By Value
	public static int findMinValue(int[] array){
		int min=array[0];
		for(int element:array){
			min=Math.min(min,element);
		}
		return min;
	}
	public static int findMaxValue(int[] array){
		int max= array[0];
		for(int element:array){
			max=Math.max(max,element);
		}
		return max;
	}

	//Part 6: MinMax By Index
	public static int[] findMinIndex(int[] array){
		int min=findMinValue(array); //{1,2,3,1}
		int count=0;//
		for(int element:array){
			if(element==min){
				count++;
			}
		}
		int[] indicies= new int[count];
		int indexcount=0;
		for(int x=0; x<array.length; x++){
			if (array[x]==min){
				indicies[indexcount++]=x;
			}
		}
		return indicies;

	}
	public static int[] findMaxIndex(int[] array){
		int max=findMaxValue(array); //{1,2,3,1}
		int count=0;//
		for(int element:array){
			if(element==max){
				count++;
			}
		}
		int[] indicies= new int[count];
		int indexcount=0;
		for(int x=0; x<array.length; x++){
			if (array[x]==max){
				indicies[indexcount++]=x;
			}
		}
		return indicies;

	}

}