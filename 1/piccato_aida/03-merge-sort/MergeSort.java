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
