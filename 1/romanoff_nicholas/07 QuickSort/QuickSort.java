// Nicholas Romanoff
// Period One
// Homework #07 QuickSort
// 2014-03-11

import java.util.*;

public class QuickSort {

	// quickSort function of logn runtime
	public static Integer[] quickSort(Integer[] a) {
		// basecase
		if (a.length <= 1) {
			return a;
		}
		else {
			// selects pivot randomly from with a
			Random random = new Random();
			Integer pivot = a[random.nextInt(a.length)];
			// partitions the list into lower and upper halves
			ArrayList<Integer> lower = new ArrayList();
			ArrayList<Integer> higher = new ArrayList();
			for (Integer x: a) {
				if (x <= pivot) {
					lower.add(x);
				}
				else {
					higher.add(x);
				}
			}
			// changes those arraylists back into arrays
			Integer[] lowArray = lower.toArray(new Integer[lower.size()]);
			Integer[] highArray = higher.toArray(new Integer[higher.size()]);
			// runs the method recursively on each of those halves
			Integer[] r1 = quickSort(lowArray);					
			Integer[] r2 = quickSort(highArray);
			// merges the halves and returns
			return merge(r1, r2);
		}
	}

	// helper function for merging arrays
	public static Integer[] merge(Integer[] low, Integer[] high) {
		Integer[] merged = new Integer[low.length + high.length];
		int index = 0;
		for (int x = index; x < low.length; x++) {
			merged[x] = low[x];
			index++;
		}
		for (int x = low.length; x < merged.length; x++) {
			merged[x] = high[x - low.length];
		}	
		return merged;
	}

	// helper function for print arrays of Integers
	public void printArray(Integer[] a) { 
		String printStr = "[";
        	for (Integer n : a) {
			printStr += " " + n;
		}
		System.out.println(printStr += " ]");
	}

	// driver for testing
	public static void main(String[] args) {

		QuickSort quicky = new QuickSort();
		System.out.println("\nTesting QuickSort...");
		Integer[] r = {21, 65, 34, 99, 5, 6, 42, 88, 11, 31, 17};
		System.out.println("\nBefore QuickSort:");
		quicky.printArray(r);
		System.out.println("After QuickSort:");
		quicky.printArray(quickSort(r));

	// Note: code doesn't seem to work with arrays containing duplicates
		

	}
}
