import java.util.*;
import java.io.*;

public class MergeSort{
      
    public int[] merge(int[] A, int[] B){
	int a = 0;
	int b = 0;
	int[] C = new int[A.length + B.length];
	for (int c = 0; c < C.length; c++){
	    if (a >= A.length){
		C[c] = B[b];
	    }else if (b >= B.length){
		C[c] = A[a];
	    }else if (A[a] <= B[b]){
		C[c] = A[a];
	    }else {
		C[c] = B[b];
	    }
	}
	return C;
    }

    public static void main(String args[]){
	MergeSort m = new MergeSort();
	int[] A = {1, 2, 3, 5, 7, 11};
	int[] B = {1, 2, 4, 6, 8};
	System.out.println(m.toString.merge(A, B));
    }

    public String toString(int[] A){
	String res = "{"
	for (int a = 0; a < A.length; a++){
	    if ( a == A.length - 1){
		res += A[a] + "}";
	    }else{
		res += A[a] + ", ";
	    }
	}
	return res;
    }

   /* public int[] msort(int[] L){
	if (L.length <= 1){
	    return L;
	}
	int[] a = new int[L.length/2];
	int[] b = new int[L.length-a.length];

	int i;
	for (i = 0; i<a.length; i++){
	    a[i] = L[i];
	}
	for ( ; i < b.length; i++){
	    
	    */
}
		
