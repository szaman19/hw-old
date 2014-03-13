import java.io.*;
import java.util.*;

public class Quick {
    Random r = new Random();

    public int quickselect(int[] a, int k, int low, int high) {
	if (low >= high)
	    return a[low];
	
	int[] b = new int[a.length];
	int h = high, l = low;
	int pivot = r.nextInt(high-low)+low; //pick pivot
	for (int i=low; i<=high; i++) { //partitioning
	    if (a[i] > a[pivot]) {
		b[h] = a[i];
		h--;
	    }
	    else if (a[i] < a[pivot]){
		b[l] = a[i];
		l++;
	    }
	}

	while (l <= h) { //deals with duplicates
	    b[l] = a[pivot];
	    l++;
	}
	pivot = h;


	for (int i=low; i<=high; i++) //Copy back
	    a[i] = b[i];

	if (pivot == k)
	    return a[pivot];
	else if (pivot < k)
	    return quickselect(a, k, pivot+1, high);
	else
	    return quickselect(a, k, low, pivot-1);
    }

    public static void main(String[] args) {
	Random r = new Random();
	int x = Integer.parseInt(args[0]);
	int[] a = new int[x];
	for (int i=0; i<x; i++)
	    a[i] = r.nextInt(100);

	Quick q = new Quick();
	System.out.println(q.quickselect(a, Integer.parseInt(args[1]), 0, x-1));
	Arrays.sort(a);
	System.out.println(a[Integer.parseInt(args[1])]); //Check

    }
}
