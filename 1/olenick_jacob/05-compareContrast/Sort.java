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
		result[i] = B[b];
		b++;
	    }
	    if (b == B.length){
		result[i] = A[a];
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
	return result;
    }

    public int[] mergeSort(int[] A){
	if (A.length <= 1){
	    return A;
	}
	else{
	    int[] B = Arrays.copyOfRange(A,0,A.length/2);
	    int[] C = Arrays.copyOfRange(A,A.length/2,A.length);
	    B = mergeSort(B);
	    C = mergeSort(C);
	    A = merge(B,C);
	    return A;	  
	}
    }

    public ArrayList merge(ArrayList<Comparable> A, ArrayList<Comparable> B){
	ArrayList<Comparable> result = new ArrayList<Comparable>();
	int a = 0;
	int b = 0;
	for (int i = 0; i < A.size() + B.size(); i++){
	    if (a == A.size()){
		result.add(B.get(b));
		b++;
	    }
	    else if (b == B.size()){
		result.add(A.get(a));
		a++;
	    }

	    else if (A.get(a).compareTo(B.get(b)) < 0){
		result.add(A.get(a));
		a++;
	    }
	    else{
		result.add(B.get(b));
		b++;
	    }
	}
	return result;
    }
    
    public ArrayList split(ArrayList A, boolean firstHalf){ //cuts in half
	ListIterator I = A.listIterator();
	ArrayList B = new ArrayList();
	int i = 0;
	if (A.size() != 0){
	    if (firstHalf){
		while (I.hasNext() && i < A.size()/2){
		    B.add(I.next());
		    i++;
		}
	    }
	    else {
		i = A.size()/2;
		while (i < A.size()){
		    B.add(A.get(i));
		    i++;
		}
	    }	
	}	
	else {
	    B = A;
	}
	return B;
    }

    public ArrayList mergeSort(ArrayList A){
	//note: for ArrayLists of Strings, returns a sorted version of A, but does not appear to redefine A

	if (A.size() <= 1){
	    return A;
	}
	ArrayList B = split(A,true);
	ArrayList C = split(A,false);
	B = mergeSort(B);
	C = mergeSort(C);
	A = merge(B,C);
	return A;
	
    }







    ////OTHER SORTS


    public static int exp(int i, int n){
	int result = 1;
	for (int a = 0; a<n; a++){
	    result = result * i;
	}
	return result;
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