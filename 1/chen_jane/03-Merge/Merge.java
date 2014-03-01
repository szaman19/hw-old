import java.io.*;
import java.util.*;

public class Merge {

    public static int[] mergeSort(int[] A) {
	if (A.length == 1) 
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

	    int i=0,j=0,k=0;
	    int[] result = new int[a.length+b.length];

	    while (j < a.length && k < b.length) {
		if (a[j] < b[k]) {
		    result[i] = a[j];
		    j++;
		    i++;
		}
		else {
		    result[i] = b[k];
		    k++;
		    i++;
		}
	    }

	    while (a.length != j) {
		result[i] = a[j];
		i++;
		j++;
	    }
	    while (b.length != k) {
		result[i] = b[k];
		i++;
		k++;
	    }

	    return result;
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
    }

}


