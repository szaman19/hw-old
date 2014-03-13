import java.io.*;
import java.util.*;

public class QuickSort {
    public int quickSort(int[] a, int low, int high) {
	int len = a.length;    
	if (len <= 1) 
	    return a;
	Random r = new Random();
	int p = a[r.nextInt(high - low) + low];
	int[] b = new int[l];
	int front = 0, back = l - 1;
	for (int i = 0; i < len; i++) {
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
	QuickSort q = new QuickSort();
	int[] a = {3,5,8,2,6,9,1};
    }
}