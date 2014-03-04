import java.io.*;
import java.util.*;

public class Sort{

    
    public int[] merge(int[] A, int[] B){

	int[] result = new int[A.length + B.length];
	int a = 0;
	int b = 0;
	for (int i = 0; i < result.length; i++){
	    // from jonathan's work-------
	    if (a == A.length){
		result[i] == B[b];
		b++;
	    }
	    if (b == B.length){
		result[i] == A[a];
		a++;
	    }
	    // ---------------------------

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

    public int[] copyRange(int[] L, int start, int end){
	int[] result = new int[end-start];
	for (int i = start; i < end; i++){
	    result[i - start] = L[i];	    
	}
	return result;
    }

    public int[] mergeSort(int[] A){

	if (A.length <= 1){
	    return A;
	}
	else{
	    int[] B = copyRange(A,0,A.length/2);
	    int[] C = copyRange(A,A.length/2,A.length);
	    B = mergeSort(B);
	    C = mergeSort(C);
	    A = merge(B,C):
	    return A;
	    
	}
    }

    public int[] bubbleSort(int[] a){
	//int swaps = 0;
	//int checks = 0;
	
	for(int b=0; b<a.length-1; b++){
	    for(int c = 0; c<a.length-b-1; c++){
		if (a[c] > a[c+1]){
		    int tmp = a[c];
		    a[c] = a[c+1];
		    a[c+1] = tmp;
		    //swaps++;
		}
		//checks++;
	    }
	}
	//System.out.println(swaps);
	//System.out.println(checks);
	return a;
    }   


    public int[] radixSort(int[] i){
	int n;
	int length = String.valueOf(i[0]).length();
	ArrayList[] buckets = new ArrayList[i.length];
	for (int a=0; a<i.length; a++){
	    buckets[a] = new ArrayList<Integer>();
	}
	for(n=0; n<length; n++){
	    for (int a=0; a<i.length; a++){
		int d = (i[a] / exp(10,n)) % 10;
		buckets[d].add(i[a]);
	    }
	    int c=0;
	    for (int a=0; a<buckets.length; a++){
		int b=0;
		while (b < buckets[a].size()){
		    i[c]=(Integer)buckets[a].get(b);
		    b++;
		    c++;
		}
	    }
	    for (int a=0; a<i.length; a++){
		buckets[a] = new ArrayList<Integer>();
	    }
	}
	return i;
    }

}