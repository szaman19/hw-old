public class binarySearch{
    //only for sorted lists

    public static int rbsearch(int n, int[] L, int low, int high){
	if (low <= high && low >= 0 && high < L.length && n >= low && n <= high){
	    int avr = (low + high) / 2;
	    if (L[avr] == n)
		return avr;
	    else if (L[avr] < n)
		return rbsearch(n, L, avr, high);
	    else if (L[avr] > n)
		return rbsearch(n, L, low, avr);
	}
	return -1;
    }

    public static int ibsearch(int n, int[] L){
	int low = 0;
	int high = L.length - 1;
	for (int i = 0; i < L.length; i++){
	    int avr = (low + high) / 2;
	    if (L[avr] == n)
		return avr;
	    else if (L[avr] < n)
		low = avr+1;
	    else
		high = avr-1;
	}
	return -1;
    }

    public static void main(String[] args){
	int[] a = new int[10];
	for (int i = 0; i < 10; i++)
	    a[i] = i;
	System.out.println(rbsearch(2, a, 0, 5));
	System.out.println(rbsearch(11,a, 0, 9));
	System.out.println(rbsearch(2, a, 5, 9));
	System.out.println(ibsearch(8, a));
	System.out.println(ibsearch(10,a));
    }
}
