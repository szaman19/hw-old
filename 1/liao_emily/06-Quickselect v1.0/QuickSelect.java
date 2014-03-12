public class QuickSelect { 

    public int quickSelect(int[] a, int k, int lo, int hi) {
	lo = 0;
	hi = a.length;
	int ans = -1;
	if ( lo >= hi )
	    ans = (lo + hi) / 2;
	else {
	    int p = (int) ( Math.random() * (lo + (hi - lo)) );
	    int[] b = new int[a.length];
	    b[0] = a[p];
	    int ind = 0;
	    int upto = 1;
	    for ( int i = lo; i <= hi; i++ ) {
		if ( a[i] >= a[p] ) {
		    b[ind + upto] = a[i];
		    upto++;
		}
		else {
		    for ( int q = upto; q > ind ; q-- ) {
			b[q] = b[q-1];
		    }
		    b[ind] = a[i];
		}
	    }
	    for ( int j = 0; j < a.length; j++ )
		a[j] = b[j];
	    if ( p == k ) 
		ans = p;
	    else if ( p > k ) 
		quickSelect(a, k, lo, p-1);
	    else 
		quickSelect(a, k, p+1, hi);
	}
	return ans;
    }
}
