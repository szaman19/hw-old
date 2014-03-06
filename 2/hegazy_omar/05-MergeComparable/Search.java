import java.util.*;
public class Search {
	public static void main(String[] args) {	
		int[] test = {1,2,3,4,5,6,7,8};
		System.out.println(rbsearch(4,test));
	}
	public static int rbsearch(int item, int[] sortedArray) {
		Arrays.sort(sortedArray); //sort all arrays w/ quicksort takes less time than check if its already sorted, then sort it accordingly
		return rbsearch(item, 0, sortedArray.length - 1, sortedArray);

	}
	private static int rbsearch(int item, int lowest, int highest, int[] array) {
		int middle = (int) ((lowest + highest) / 2);
		if (lowest > highest) 
			return -1;
		if (item > array[middle])
			return rbsearch(item, middle + 1, highest, array);
		if (item < array[middle])
			return rbsearch(item, lowest, middle - 1, array);
		else
			return middle;
		
	}


}