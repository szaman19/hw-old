// Nicholas Romanoff
// Period One
// Homework #05 Binary Search
// 2014-03-05

import java.util.*;

public class BinarySearch {
/*
target 33
0  4 5 7  9 20 33 35
middle 4 
guess 9
low 0
high 7
*/

	// conducts an iterative binary search
	public static int iterativeBinarySearch(int target, int[] list) {
        	int targetIndex = -1; 
		int low = 0;
		int high = list.length;
        	int middle = (low + high) / 2; 
        	while (low <= high) { 
            		middle = (low + high) / 2;
            		if (list[middle] == target) {
				targetIndex = middle;
				break;
			}
            		else if (list[middle] > target) {
				high = middle - 1;
			}
                
            		else if (list[middle] < target) {
				low = middle + 1;
			}
		}
		return middle;
	}


	public void print(int[] a) { 
		String printStr = "[ ";
        	for (int n : a) {
			printStr += ((Integer) n) + ", ";
		}
		printStr = printStr.substring(0, printStr.length() - 2) + " ]";
		System.out.println(printStr);
	}


	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] a = new int[20];
        	for (int x = 0; x < 20; x++) {
			a[x] = (int)(20 * Math.random());
        	}
		Arrays.sort(a);
		bs.print(a);
		for (int x = 0; x < 5; x++) {
			int p = (int)(20 * Math.random());

		}			
	}






}
