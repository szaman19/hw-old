import java.io.*;
import java.util.*;

public class QuickSelect{
	public int quickSelect(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int r = low, w = high;
			int mid = arr[(r + w) / 2];
			while (r < w) {
				if (arr[r] >= mid) { // put the large values at the end
					int tmp = arr[w];
					arr[w] = arr[r];
					arr[r] = tmp;
					w--;
				} else { // the value is smaller than the pivot, skip
					r++;
				}
			}
				if (arr[r] > mid)
					r--;
				if (k <= r) {
					high = r;
				} else {
					low = r + 1;
				}
		}
		return arr[k];
	}
	
	public static void main(String[] args){
		QuickSelect q = new QuickSelect();
		int[] a = new int[10];
		a[0] = 47;
		a[1] = 25;
		a[2] = 83;
		a[3] = 37;
		a[4] = 93;
		a[5] = 73;
		a[6] = 45;
		a[7] = 19;
		a[8] = 66;
		a[9] = 84;
		System.out.println(q.quickSelect(a, 1));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 2));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 3));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 4));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 5));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 6));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 7));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 8));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 9));
		System.out.println(Arrays.toString(a));
		System.out.println(q.quickSelect(a, 0));
		System.out.println(Arrays.toString(a));
		
	}
}