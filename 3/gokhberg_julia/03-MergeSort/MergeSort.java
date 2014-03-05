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
	System.out.println(m.merge(A, B));
    }
}
		
