import java.io.*;
import java.util.*;

public class MergeSort {
    public int[] merge(int[] A, int[] B) {
	int a = 0, b = 0, c = 0;
	int len = A.length + B.length;
	int[] C = new int[len];
	for (int i = 0; i < len; i++) {
	    if (a == A.length) {
		C[i] = B[b];
		b = b + 1;
	    }
	    else if (b == B.length) {
		C[i] = A[a];
		a = a + 1;
	    }
	    else if (A[a] < B[b]) {
		C[i] = A[a];
		a = a + 1;
	    }
	    else {
		C[i] = B[b];
		b = b + 1;
	    }
	}
	return C;
    }
    
    public int[] sort(int[] L) {
	if (L.length <= 1) 
	    return L;
	else {
	    System.out.println(L[0]);
	    int l = L.length;
	    int a = l / 2, ia = 0;
	    int b = l - a, ib = 0;
	    int[] A = new int[a], B = new int[b];
	    for (int i = 0; i < l; i++) {
		//System.out.println(L[i]);
		if (i < a) 
		    A[ia] = L[i];
		else 
		    B[ib] = L[i];
	    }
	    A = sort(A);
	    B = sort(B);
	    L = merge(A,B);
	    return L;
	}
    }
    
    public static void main(String[] args) {
	MergeSort m = new MergeSort();
	int[] l = new int[10];
	for (int i = 0; i< l.length; i++) {
	    Random r = new Random();
	    l[i] = r.nextInt(10);
	    //System.out.println(l[i]);
	}
	l = m.sort(l);
	//System.out.println(l[5]);
	for (int i = 0; i < l.length; i++) {
	    System.out.print(l[i] + ", ");
	}
	System.out.println();
    }
}      