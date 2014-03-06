import java.util.*;
public class Search {
	public static void main(String[] args) {	
	}
	public static int rbsearch(int item, int[] sortedArray) {
		Arrays.sort(sortedArray); //sorting all arrays w/ quicksort takes less time than check if its already sorted, then sort it accordingly
		return rbsearch(item, 0, sortedArray.length - 1, sortedArray);

	}
	public static int ibsearch(int item, int[] array) {
		Arrays.sort(array);
		int lowest, highest, middle;
		lowest = 0;
		highest = array.length - 1;
		while (highest >= lowest) {
			middle = (int) ((lowest + highest) / 2);
			if (array[middle] == item)
				return middle;
			if (item > array[middle])
				lowest = middle + 1;
			if (item < array[middle])
				highest = middle - 1;
		}
			return -1;
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