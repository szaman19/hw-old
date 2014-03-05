import java.io.*;
import java.util.*;

public class Merge {
    /*
	public int[] merge(int[] A, int[] B) {
	    int a = 0; 
	    int b = 0;
	    int c = 0;
	    int l = A.length() + B.length();
	    int[] C = int[l];
	    for (int i = 0; i < l; i++) {
		if (a == A.length) {
		    C[i] = B[b];
		    b = b + 1;
		}
		else if (b == B.length) {
		    C[i] = A[a];
		    a = a + 1;
		}
		else if (A[a] > B[b]) {
		    C[i] = A[a];
		    a = a + 1;
		}
		else {
		    C[i] = B[b];
		    b = b + 1;
		}
		c++;
	    }
	    return C;
	}
    */
    public int[] split(int[] L)  {
	int[] A, B;
	
	for (int i = 0; i < L.length()/2; i++) {
	    A[i] = L[i];
	}
	
	for (int i = L.length()/2; i < L.length(); i++) {
	    B[i] = L[i];
	}
	return A;
	return B;
    }   
} 