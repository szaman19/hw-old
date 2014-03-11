import java.util.*;

public class MergeSort{

    private int[] x;
    private int[] y;

    public int[] merge( int[] A, int[] B ) {
	int len = A.length + B.length;
	int[] ans = new int[len];
	int ctr1 = 0;
	int ctr2 = 0;
	int count = 0;
	while ( count < len ) {
	    if ( A[ctr1] < B[ctr2] ) {
		ans[count] = A[ctr1];
		if ( ctr1 < A.length - 1 )
		    ctr1++;
	    }
	    else if ( A[ctr1] > B[ctr2] ) {
		ans[count] = B[ctr2];
		if ( ctr2 < B.length - 1 )
		    ctr2++;
	    }
	count++;
	}
	return ans;
    }

    public int[] split( int[] L ) {
	/*	if ( L.length % 2 == 0 ) {
	    x = new int[L.length / 2];
	    y = new int[L.length / 2];
	}
	else {
	    x = new int[L.length / 2];
	    y = new int[(L.length / 2) + 1];
	}
	*/ 
	x = new int[L.length / 2];
	y = new int[L.length - x.length];
	int r;
	for (r = 0; r < L.length/2; r++) {
	    if (r < x.length)
		x[r] = L[r];
	}
	for (;r < L.length; r++) {
	    y[L.length - r - 1] = L[r];
	}
	return L;
    }

    public int[] mergeSort( int[] L ) {
	if (L.length <= 1 )
	    return L;
	else {
	    split(L);
	    x = mergeSort(x);
	    y = mergeSort(y);
	    int[] finale = merge(x, y);
	    return finale;
	}
    }

    public static void main (String[] args) {
	MergeSort m = new MergeSort();
	int[] A = new int[3];
	A[0] = 5;
	A[1] = 9;
	A[2] = 15;
	int[] B = new int[4];
	B[0] = 3;
	B[1] = 10;
	B[2] = 13;
       	B[3] = 18;
	System.out.println(Arrays.toString(m.merge(A, B)));
    }

}
