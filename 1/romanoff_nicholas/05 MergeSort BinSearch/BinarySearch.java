// Nicholas Romanoff
// Period One
// Homework #05 Binary Search
// 2014-03-05

import java.util.*;

public class BinarySearch {

	// conducts an iterative binary search
	public static int iterativeBinarySearch(int target, int[] list) {
		int low = 0;
		int high = list.length - 1;
        	while (low <= high) { 
            		int middle = (low + high) / 2;
            		if (list[middle] == target) {
				return middle;
			}
            		else if (list[middle] < target) {
				low = middle + 1;
			}
            		else if (list[middle] > target) {
				high = middle - 1;
			}
		}
		return -1;
	}

	// helper function - calls a recursive binary search
    	public static int recursiveBinarySearch(int target, int[] array) {
        	return recursiveHelper(array, target, 0, array.length - 1);
	}

	// conducts a recursive binary search
   	public static int recursiveHelper(int[] array, int target, int low, int high) {
        	int midpoint = (low + high) / 2;
        	if (low > high) { 
			return -1;
		}
        	if (target == array[midpoint]) { 
			return midpoint;
		}
        	else if (array[midpoint] > target) {
			return recursiveHelper(array, target, low, midpoint - 1);	
		}		

        	else {
			return recursiveHelper(array, target, midpoint + 1, high);
		}		

	}
	public static void printIntArray(int[] a) { 
		String printStr = "[ ";
        	for (int n : a) {
			printStr += ((Integer) n) + ", ";
		}
		printStr = printStr.substring(0, printStr.length() - 2) + " ]";
		System.out.println(printStr);
	}
	public static void main(String[] args) {
		BinarySearch rb = new BinarySearch();
		int[] a = {1, 2, 16, 17, 20, 21, 27, 28, 30};
		System.out.println(rb.recursiveBinarySearch(27, a));
	}



}
