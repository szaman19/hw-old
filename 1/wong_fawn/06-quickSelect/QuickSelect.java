import java.io.*;
import java.util.*;

public class QuickSelect {
	public int quickSelect(int[] a, int k, int low, int high) {
		if (low >= high) 
			return a[high];
		Random r = new Random();
		int l = a.length;
		int p = a[r.nextInt(high - low) + low];
		int[] b = new int[l];
		int front = 0, back = l - 1;
		for (int i = 0; i < l; i++) {
			if (a[i] < p) {
				b[front] = a[i];
				front = front + 1;
			}
			else if (a[i] > p) {
				b[back] = a[i];
				back = back - 1;
			}
		}
		b[front] = p;
		a = b;
		if (front == k) 
			return a[k];
		else if (front > k)
			return quickSelect(a, k, low, front - 1);
		else  
			return quickSelect(a, k, front + 1, high);			
	}

	public static void main(String[] args) {
		QuickSelect q = new QuickSelect();
		int[] a = {3,5,8,2,6,9,1};
		System.out.println(q.quickSelect(a, 3, 0, a.length - 1));
	}
}