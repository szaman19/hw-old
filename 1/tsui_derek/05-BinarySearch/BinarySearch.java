public class BinarySearch{
    public static int rbsearch(int n, int[] L) {
	return rbHelper(n, L, 0, L.length);
    }

    public static int rbHelper(int n, int[] L, int low, int high){
	if (high - low <= 1) {
	    if (n == L[low]) return low;
	    if (n == L[high]) return high;
	    else return -1;
	}

	if (n < L[(low + high) / 2]){
	    return (rbHelper(n, L, 0, (low + high) / 2));
	} else {
	    return (rbHelper(n, L, (low + high) / 2, high));
	}
	
    }

    public static int ibsearch(int n, int[] L) {
		int low = 0;
		int high = L.length;
		while (high - low > 1){
			if (n == L[(low + high) / 2]) return (low + high) / 2;
			if (n < L[(low + high) / 2]) high = (low + high) / 2;
			if (n > L[(low + high) / 2]) low = (low + high) / 2;
		}
		return -1;
    }
    
    
    public static void main(String[]args){
		int[] a = new int[50];
		for (int x = 0; x < 50; x++){
			a[x] = x * (x + 1) / 2;
		}
		System.out.println(rbsearch(6,a));
		System.out.println(ibsearch(6,a));
		System.out.println(rbsearch(36,a));
		System.out.println(ibsearch(36,a));
		System.out.println(rbsearch(106,a));
		System.out.println(ibsearch(106,a));
    }
}