import java.io.*;
import java.util.*;

//it only almost works; not entirely sure what the problem is other than this is really long - shall look again sometime between tomorrow's class and over the weekend

public class QuickSort {
    public int[] quickSort (int[] L){
	if (L.length <= 1)
	    return L;
	else {
	    Random r = new Random();
	    int pivotInd = r.nextInt(L.length);
	    int pivot = L[pivotInd];
	    //	    System.out.println("The pivot is: " + pivot);
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();
	    for (int i = 0; i < L.length; i++){
		if (L[i] < pivot)
		    lower.add(L[i]);
		else if (L[i] > pivot)
		    upper.add(L[i]);
		//	System.out.println("" + i + ": " + L[i]);
	    }
	    int[] low = toIntArray(lower);
	    int[] hi = toIntArray(upper);
	    /*	    for (int i = 0; i < lower.size(); i++){
		left[i] = lower.get(i).intValue();
	    }
	    for (int i = 0; i < upper.size(); i++){
		right[i] = upper.get(i).intValue();
	    }
	    */
	    int[] left = quickSort(low);
	    int[] right = quickSort(hi);
	    int leftTrack = 0;
	    int rightTrack = 0;
	    for (int i = 0; i < L.length; i++){
		if (i < left.length){
		    L[i] = left[leftTrack];
		    leftTrack++;
		}
		else if (i == left.length){
		    L[i] = pivot;
		}
		else {
		    if (rightTrack < right.length){
			L[i] = right[rightTrack];
			rightTrack++;
		    }
		}
	    }
	    
 	    //L = merge(left, right, pivot);
	    return L;
	}
    }
    
    /*
    public int[] merge (int[] a, int[] b, int p){
	int len = a.length + b.length + 1;
	int[] ret = new int[len];
	int aTrack = 0;
	int bTrack = 0;
	for (int i = 0; i < ret.length; i++){
	    if (i < ret.length){
		ret[i] = a[aTrack];
		aTrack++;
	    }
	    else if (i == ret.length)
		ret[i] = p;
	    else {
		if (bTrack < b.length){
		    ret[i] = b[bTrack];
		    bTrack++;
		}
	    }
	}
	return ret;
    }
    */

    public int[] toIntArray (ArrayList<Integer> a){
	int[] ret = new int[a.size()];
	for (int i = 0; i < a.size(); i++){
	    ret[i] = a.get(i).intValue();
	}
	return ret;
    }
    public static void main(String[] args){
	QuickSort q = new QuickSort();
	int[] L = new int[15];
	Random r = new Random();
	for (int i = 0; i < L.length; i++){
	    L[i] = r.nextInt(21);
	}
	System.out.println(Arrays.toString(L));
	L = q.quickSort(L);
	System.out.println(Arrays.toString(L));
    }
}
