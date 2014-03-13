import java.io.*;
import java.util.*;

public class quickSort {
    public int quickSort(int[] a, int lo, int hi) {
	int l = a.length;    
	if (l <= 1) 
	    return a;
	Random r = new Random();
	int p = a[r.nextInt(hi - lo) + lo];
	int[] b = new int[l];
	int p1 = 0;
	p2 = l - 1;

	for (int i = 0; i < l; i++) {
	    if (a[i] < p) {
		b p1] = a[i];
	 p1 = p1 + 1;
	    }
	    else if (a[i] > p) {
		b[p2] = a[i];
		p2 = p2 - 1;
	    }
	}
	b p1] = p;
	a = b;
	if  p1 == k) 
	    return a[k];
	else if  p1 > k)
	    return quickSelect(a, k, lo, p1 - 1);
	else  
	    return quickSelect(a, k, p1 + 1, hi);			
    }

    public static void main(String[] args) {
	quickSort q = new quickSort();
	int[] a = {23,324,234,12,3,6,15,222,235,324,1};
    }
}