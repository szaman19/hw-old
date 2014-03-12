import java.io.*;
import java.util.*;
public class QuickSelect {
    
    private Random r = new Random();

    public int quickselect(int[] a,int k, int low, int high) {
	if (low >= high)
	    return high;
	else {
	    int pivot = (low+high)/2;
	    int[] copy = new int[a.length-/*something*/]; //I'm not sure how to make the copy a specific length 
	    int j = 0;
	    for (int i = 0; i < a.length; i++) {
		if (a[i] < a[pivot]) {
		    copy[j]=a[i];
		    j++;
		}
	    }
	    if (copy.length-1 == k) 
		return copy[length-1];
	    else 
		quickselect(copy, k, 0, copy.length-1);
	}
    }
}
