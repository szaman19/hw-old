public class BinarySearch {
    int low;
    int high;
    public BinarySearch(int[] L) {
	low  = 0;
	high = L.length;
    }
    public  int rbsearch(int n, int[] L) {

	int mid = ((high+low)/2);
	if ( n == L[mid]) {
	    return mid;
	}
	else if((high-low) <= 0) {
	    return -1;
	}
	else if ( n < L[mid]) {
	    high = mid;
	    return rbsearch(n, L);
	}
	else {
	    low = mid;
	    return rbsearch(n, L);
	}
    }
    public static void main( String[] args) {
	int[] a = new int[] {2,5,7,12,17,19,20,36,49,50};
	BinarySearch bin = new BinarySearch(a);
	int result = bin.rbsearch(49, a);
	System.out.println(result);
    }
}
	    
	    
	    
