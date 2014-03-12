public class BinarySearch {
    
    public int rbsearch(int n, int[] L) {
	return rbsearchWorker(n, L, L.length - 1, 0);
    }

   
    public int rbsearchWorker(int n, int[] L, int h, int l) {
	int midIndex = (l + h)/2 ;
	//System.out.println("high: " + h + "\nlow: " + l + "\nmid: " + midIndex + "\n"); 
	if ((h - l) < 1) {
	    return -1;
	}

	if (L[midIndex] == n) {
	    return midIndex;
	}

	else if (L[midIndex] > n) {
	    return rbsearchWorker(n, L, midIndex, l);
	}
        else {
	    return rbsearchWorker(n, L, h, midIndex);
	}
	
    }
    
    public int ibsearch(int n, int[] L) {
	int high = L.length;
	int low = 0;
	
	while(high - low > 1) {
	    int mid = (high + low)/2;
	    if (L[mid] == n) {
		return mid;
	    }
	    else if (L[mid] > n) {
		high = mid + 1;
	    }
	    else {
		low = mid;
	    }
	}
	return -1;		 
    }
}
    
