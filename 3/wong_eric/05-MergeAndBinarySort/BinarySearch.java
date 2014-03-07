public class BinarySearch {

    public int[] makeList(int n) {
	int[] res = new int[n];
	for (int i=0;i<n;i++) {
	    res[i] = (int)(Math.random() * 100000);
	}
	return res;
    }

    public int rbsearch(int n, int[] L) {
	int middle = L.length/2;

	if (n == L[middle]) {
	    return middle;
	}
	else {
	    if (n < L[middle]) {
		int[] fhalf = new int[middle];
		for (int i=0;i<middle;i++) {
		    fhalf[i] = L[i];
		}
		rbsearch(n,fhalf);
	    }
	    else {
		int[]shalf = new int[middle];
		for (int i=0;i<middle;i++) {
		    shalf[i] = L[i+middle];
		}
		rbsearch(n,shalf);
	    }
	    return -1;
	}

    }

}