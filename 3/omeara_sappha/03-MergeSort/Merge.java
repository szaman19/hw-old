import java.io.*;
import java.util.*;

public class Merge{

    public int[] merge(int[] A, int[] B){
	int[] sorted = new int[A.length + B.length];
	int aPos = 0;
	int bPos = 0;
	int cPos = 0;
	for (int i = 0; i < sorted.length; i ++){
	    if (aPos == A.length){ //done with A
		sorted[i] = B[bPos];
		bPos ++;
	    }
	    else if (bPos == B.length){ //done with B
		sorted[i] = A[aPos];
		aPos ++;
	    }
	    else if (A[aPos] < B[bPos]){
		sorted[i] = A[aPos];
		aPos ++;
	    }
	    else{ //A[aPos] >= B[bPos]
		sorted[i] = B[bPos];
		bPos ++;
	    }
	}
	return sorted;
    }
    
    
   public int[] msort(int[] L) {

	if (L.length<=1){
	    return L;
	}

	int[] a = new int[L.length/2];
	int[] b = new int[L.length - a.length];

	int i;
	for (i=0;i<a.length;i++){
	    a[i]=L[i];
	}
	for ( ; i<L.length;i++){
	    b[ i-a.length ] = L[i];
	}
	a = msort(a);
	b = msort(b);
	int[] result = merge(a,b);
	return result;
    }
}
