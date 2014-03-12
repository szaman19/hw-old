import java.io.*;
import java.util.*;

public class QuickSelect{
    Random r = new Random();
    public static int quickselect(int[] a, int k, int low, int high) {
	if (low >= high) {
	    return low;
	}
	else {
	    int p = (low+high)/2;
	    int[] temp = new int[a.length];
	    int i;
	    int c = low;
	    int c2 = high;
	    for (i = low; i < p; i++) {
		if (a[i] < a[p]) {
		    temp[c] = a[i];
		    c++;
		}else {
		    temp[c2] = a[i];
		    c2--;
		}
	    }
	    for (i = p + 1; i <= hi; i++) {
		if (a[i] > a[p]) {
		    temp[c2] = a[i];
		    c2--;
		}else {
		    temp[c] = a[i];
		    c += 1;
		}
	    }
	    b[c2] = a[p];
	    if (c == k) 
		return temp[c];
	    else if (temp[c] > k) 
		high = c;
	    else 
		low = c;
	    return quickselect(b, k, lo, hi);
	}

    /*-------------------------------------*/
    public static void main(String[] args){
	int[] a1 = new int[]{1, 5, 3, 7, 2, 9, 10, 4, 6, 8};
	System.out.println(a1);
	System.out.println(quickSelect(a1, 6, 0, a1.length - 1);

    }
}
