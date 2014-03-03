public class MergeSort {

    public int[] merge(int[] a, int[] b) {
	int i = 0;
	int j = 0;
	int k = 0;
	int[] result = new int[a.length + b.length];
	for (k; k < result.length; k++) {
	    if (i < a.length && j < b.length) {
		if (a[i] > b[j]) {
		    result[k] = b[j];
		    j++;
		}

		else {
		    result[k] = a[i];
		    i++;
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
    
    public static void main(String[] args) {
	MergeSort bob = new MergeSort();
	int[] k = {2,4,5,7,8};
	int[] j = {1,3,5,6,9}; 
	System.out.println(bob.merge(k, j));
    }

}

   
