public class binSearch {


    public int rbsearch (int n, int[] L, int lo, int hi) {

	int ans = -1;
	int m = (lo + hi) / 2;
	if (m < lo || m > hi) 
	    return -1;
	if (lo > hi)
	    return -1;
	if (L[m] == n)
	    return m;
	else if (L[m] > n)
	    return rbsearch (n, L, lo, m-1);
	else if (L[m] < n) 
	    return rbsearch (n, L, m+1, hi);
	
	return ans;
    }

    public int ibsearch (int n, int [] L) {
	int hi = L.length - 1;
	int lo = 0;
	while (lo <= hi) {
	    int mid = (lo + hi) / 2;
	    if (L[mid]== n)
		return mid;
	    if (L[mid] > n) 
		hi = mid - 1;
	    if (L[mid] < n)
		lo = mid + 1;
	}
	return -1;
    }




    public static void main (String [] args) {
	binSearch test = new binSearch();
	int [] foo = {1,2,3,4,5,6,7,8,9,10,11,15,78,180, 900};

	System.out.println ("Index:" + test.rbsearch(12, foo,0, foo.length-1));
	System.out.println ("Index:" + test.rbsearch(1, foo,0, foo.length-1));
	System.out.println ("Index:" + test.rbsearch(15, foo,0, foo.length-1));
	System.out.println ("Index:" + test.rbsearch(900, foo,0, foo.length-1));
	System.out.println ("Index:" + test.rbsearch(-5, foo,0, foo.length-1));
	System.out.println ("Index:" + test.ibsearch(12, foo));
	System.out.println ("Index:" + test.ibsearch(1, foo));
	System.out.println ("Index:" + test.ibsearch(15, foo));
	System.out.println ("Index:" + test.ibsearch(900, foo));
	System.out.println ("Index:" + test.ibsearch(-5, foo));

    }
}