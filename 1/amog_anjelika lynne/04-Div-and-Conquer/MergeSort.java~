import java.io.*;
import java.util.*;

public class MergeSort{
    public int[] merge (int[] A, int[] B){
	int len = A.length + B.length;
	int[] C = new int[n];
	int countC = 0;
	int countA = 0;
	int countB = 0;
	while (countC < len){
	    if (countA == A.length){
		C[count] = B[countB];
		countB++;
	    }
	    else if (countB == B.length){
		C[count] = A[countA];
		countA++;
	    }
	    else if (A[countA] <= B[countB]){
		C[countC] = A[countA];
		countA++;
	    }
	    else {
		C[countC] = B[countB];
		countB++;
	    }
	    countC++;
	}
	return C;
    }

    public int[] mergeSort(int[] L){
	int len = L.length;
	int i = 0;
	if (len <= 1)
	    return L;
	else{
	    int lenA = len / 2;
	    int lenB = len - lenA;
	    int[] A = new int[lenA];
	    int[] B = new int[lenB];
	    for (int iA = 0; iA < lenA; iA++){
		A[iA] = L[i];
		i++;
	    }
	    for (int iB = 0; iB < lenB; iB++){
		B[iB] = L[i];
		i++;
	    }
	    A = mergeSort(A);
	    B = mergeSort(B);
	    L = merge(A,B);
	    return L;
	}
    }
}