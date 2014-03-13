import java.io.*;
import java.util.*;

public class QuickSort {
	public int[] quickSort(int[] a, int low, int high) {
		//doesn't work as it should, will check out what I'm doing wrong in class
		System.out.println("low: " + low + " high: " + high);
		int len = a.length;    
		if (high - low <= 1) 
			return a;
		Random r = new Random();
		int p = a[r.nextInt(high - low) + low];
		int[] b = a;
		int front = low, back = high - 1;
		for (int i = low; i < high; i++) {
			if (a[i] > p) {
				b[front] = a[i];
				front ++;
			}
			else if (a[i] < p) {
				b[back] = a[i];
				back --;
			}
		}
		b[front] = p;
		int pivIndex = front;
		int[] a1 = quickSort(a, low, front);
		int[] a2 = quickSort(a, front + 1, high);
		for (int i = low; i < a.length; i++) {
			if (i < pivIndex) 
				a[i] = a1[i];
			else if (i == pivIndex) 
				a[i] = p;
			else 
				a[i] = a2[i - front - 1];
		}
		printArray(a);
		return a;
	}

	public void printArray(int[] a) {
		String s = "";
		for (int i = 0; i < a.length; i++) 
			s = s + a[i] + ", ";
		System.out.println(s);
	}

	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		int[] a = {3,5,8,2,6,9,1};
		a = q.quickSort(a, 0, a.length);
		
	}
}