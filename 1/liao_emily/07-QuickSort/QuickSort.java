import java.io.*;
import java.util.*;

public class QuickSort { 

    public Integer[] qSort (Integer[] A, int lo, int hi) {
	if ( A.length <= 1 ) 
	    return A;
	else {
	    int p = lo + (int) ( Math.random() *  (hi - lo) );
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> higher = new ArrayList<Integer>();
	    for ( int i = 0; i < A.length; i++ ) {
		if ( A[i] >= A[p] ) 
		    higher.add(A[i]);
		else 
		    lower.add(A[i]);
	    }
	    A[lower.size()] = A[p];
	    Integer[] a1 = lower.toArray(new Integer[lower.size()]);
	    Integer[] a2 = higher.toArray(new Integer[higher.size()]);
	    Integer[] R1 = qSort(a1, 0, a1.length);
	    Integer[] R2 = qSort(a2, 0, a2.length);
	}
    }

}
