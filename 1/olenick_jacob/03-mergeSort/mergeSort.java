import java.io.*;
import java.util.*;

public class mergeSort{

    
    
    public int[] merge(int[] A, int[] B){

	int[] result = new int[A.length + B.length];
	int a = 0;
	int b = 0;
	for (int i = 0; i < result.length; i++){
	    if (A[a] < B[b]){
		result[i] = A[a];
		a++;
	    }
	    else{
		result[i] = B[b];
		b++;
	    }
	}
    }

    public int[] mergeSort(int[] A){

	if (A.length <= 1){
	    return A;
	}
	else{
	    int[] B = Arrays.copyOfRange(A,0,A.length/2);
	    int[] C = Arrays.copyOfRange(A,A.length/2,A.length);
	    A = merge(B,C):
	    
	}
	
	return A;
    }

}