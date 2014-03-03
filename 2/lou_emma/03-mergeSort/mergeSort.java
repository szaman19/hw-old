import java.util.*;
import java.io.*;

public class mergeSort{
    private int[] h1,h2;

    public int[] mergeSort(int[] list){
	h1 = new int[(list.length/2)];
	h2 = new int[list.length - h1.length];

	if (list.length <= 1){
	    return list;
	}
	else{
	    for (int i = 0; i < h1.length; i++){
		h1[i] = list[i];
	    }
	    for (int j = 0; j < h2.length; j++){
		h2[j] = list[j+h1.length];
	    }
	    System.out.println("This is a test:" + Arrays.toString(h2));
	    return merge(mergeSort(h1),mergeSort(h2));
	}
    }

    public int[] merge(int[]A, int[]B){
	int n = 0;
	int m = 0;
	int index = 0;
	int[] combine = new int[A.length + B.length];
	while (index < combine.length){
	    
	    if (n == A.length && m!=B.length){
		combine[index] = B[m];
		m = m + 1;
	    }
	    else if (m == B.length && n!= A.length){
		combine[index] = A[n];
		n = n + 1;
	    }
	    else if (A[n] <= B[m]){
		combine[index] = A[n];
		n = n + 1;
	    }
	    else{
		combine[index] = B[m];
		m = m + 1;
	    }

	    index = index + 1;
	}
	return combine;
    }
}
