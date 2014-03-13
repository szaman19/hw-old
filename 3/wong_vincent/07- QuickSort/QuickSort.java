import java.io.*;
import java.util.*;
public class QuickSort {

    public int QuickSort (int[] L) {
	if (L.length <= 1)
	    return L;
	else {
	    int r = (int)(Math.random()*10);
	    int pivot = L[r];
	    List <Integer> lower = new ArrayList <Integer> ();
	    List <Integer> higher = new ArrayList <Integer> ();
	    int j = 0;
	    int k = 0;
	    for (int i = 0; i < L.length; i++) {
		if (L[i] > L[r]) {
		    higher.add(L[i]);
		    j++;
		}
		else if (L[i] < L[r]) {
		    lower.add(L[i]);
		    k++;
		}
	    }
	    int[] high = new int[j];
	    higher.toArray(high);
	    int[] low = new int [k];
	    lower.toArray(low);
	    int[] A = QuickSort(high);
	    int[] B = QuickSort(low);
	    //I haven't implemented how to combine A, pivot, and B because I don't know how to
	}
    }


}
