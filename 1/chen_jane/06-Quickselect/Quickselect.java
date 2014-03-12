import java.io.*;
import java.util.*;

public class Quickselect {

    public static int quickselect(int[] a, int k, int low, int high) {
	if (low >= high) {
	    return a[low];
	}
	else {
	    int pivot = low + (int)(Math.random() * (high - low));
	    System.out.println(a[pivot]);
	    // splits into lower and higher halves
	    // using ArrayList because it's easier
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> higher = new ArrayList<Integer>();
	    for (int i=low; i<=high; i++) {
		if (a[i] < a[pivot]) {
		    lower.add(a[i]);
		}
		else {
		    higher.add(a[i]);
		}
	    }

	    // copy over new array into original array
	    for (int i=0; i<a.length; i++) {
		if (i < lower.size()) {
		    a[i] = lower.get(i);
		}
		else if (i == lower.size()) { // this is the index of pivot
		    a[i] = a[pivot];
		}
		else {
		    a[i] = higher.get(i-lower.size());
		}
	    }
	    System.out.println(Arrays.toString(a));

	    if (lower.size() == k) {
		return a[lower.size()];
	    }
	    else if (lower.size() > k) {
		return quickselect(a,k,low,lower.size()-1);
	    }
	    else {
		return quickselect(a,k,lower.size()+1,high);
	    }
	}
    }

    // compiles but doesn't work
    // having trouble with this
    public static void main(String[] args) {
	int[] a = {8,3,1,6,8,2,2,6,8,9,0,3};
	System.out.println(quickselect(a,1,0,a.length-1));	
	System.out.println(quickselect(a,2,0,a.length-1));	
	System.out.println(quickselect(a,3,0,a.length-1));	
	System.out.println(quickselect(a,4,0,a.length-1));
	
    }
}
