<<<<<<< HEAD
import java.util.Arrays;

public class MergeSort {
    
    public String printArray (int[] a) {
	return Arrays.toString(a);
    }

    public int[] merge(int[] a, int[] b) {
	int[] result = new int[a.length + b.length];
	int countA = 0;
	int countB = 0;
	int count = 0;
	while (count < (a.length + b.length)) {
	    if (countA == a.length) {
		result[count] = b[countB];
		countB++;
	    }
	    else if (countB == b.length) {
		result[count] = a[countA];
		countA++;
	    }
	    else if (a[countA] > b[countB]) {
		result[count] = b[countB];
		countB++;
	    }
	    else {
		result[count] = a[countA];
		countA++;
	    }
	    count++;
	}
	return result;

    }

    public int[] mergeSort(int[] l) {
	int[] a;
	int[] b;
	if (l.length <= 1) {
	    return l;
	}
	else {
	    int n = l.length/2;
	    a = new int[n];
	    b = new int[l.length - n];
	    for (int i = 0; i < l.length; i++) {
		if (i < n) {
		    a[i] = l[i];
		}
		else {
		    b[i - n] = l[i];
		}
	    }
       		     
	}
	a = mergeSort(a);
	b = mergeSort(b);
	l = merge(a, b);
	return l;
    }

}
=======
import java.util.*;

public class MergeSort {
    public String printArray(int[] a) {
	return Arrays.toString(a);
    }
	
    
    public int[] merge(int[] a, int[] b) {
	int i = 0;
	int j = 0;
	int k;
	int[] result = new int[a.length + b.length];
	for (k = 0; k < result.length; k++) {
	    if (i < a.length && j < b.length) {
		if (a[i] > b[j]) {
		    result[k] = b[j];
		    j++;
		    //System.out.println("A: i = " + i + " j = " + j);
		}

		else {
		    result[k] = a[i];
		    i++;
		    //System.out.println("B: i = " + i + " j = " + j);
		}
	    }
	    else if (i > a.length && j < b.length) {
		result[k] = b[j];
		j++;
	    }
	    else {
		result[k] = a[i];
		i++;
	    }
	}
	return result;
    }
    
}
>>>>>>> 748ab58a5354e0f47714188f11b400c9bb2e0909
