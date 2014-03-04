import java.io.*;
import java.util.*;

public class Merge {

    public static int[] mergeSort(int[] A, int[] B) {
	int[] sorted = new int[A.length + B.length];
	int a=0,b=0;
	for (int i=0; i<sorted.length; i++) {
	    if (a == A.length) {
		sorted[i] = B[b];
		b++;
	    }
	    else if (b == B.length) {
		sorted[i] = A[a];
		a++;
	    }
	    else if (A[a] < B[b]) {
		sorted[i] = A[a];
		a++;
	    }
	    else {
		sorted[i] = B[b];
		b++;
	    }
	}
	return sorted;
    }

    public static int[] mergeSort(int[] A) {
	if (A.length <= 1) 
	    return A;
	else {
	    int half = A.length / 2;
	    int[] a = new int[half];
	    int[] b = new int[A.length-half];
	    //splitting the array into two
     	    for (int i=0; i<half; i++) {
		a[i] = A[i];
	    }
	    for (int i=half; i<A.length; i++) {
		b[i-half] = A[i];
	    }

	    a = mergeSort(a);
	    b = mergeSort(b);

	    return mergeSort(a,b);
	}
    }

    public static String toString(int[] array) {
	String s = "{ ";
	for (int i=0; i<array.length; i++) {
	    s = s + array[i];
	    if (i != array.length-1)
		s = s + ", ";
	    else 
		s = s + " ";
	}
	s = s + "}";
	return s;
    }

    public static void main(String[] args) {
	Merge m = new Merge();
	int[] array = {8,3,5,6,10,43,2,0,5,8,3};
	array = mergeSort(array);
	System.out.println(m.toString(array));

	int[] a1 = {0,2,4,6,8};
	int[] a2 = {1,3,5,7,9};
	System.out.println(m.toString(mergeSort(a1,a2)));

    }

}


