public class QuickSelect { 

    //I don't understand... what's wrong with my code? (other than its overcoded)
    //It just returns the 0 I originally set ans as

    public int quickSelect(int[] a, int k, int lo, int hi) {
	//lo = 0;
	//hi = a.length;
	int ans = 0;
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

    public String printArray(int[] z) {
	String retStr = "[  ";
	for ( int i = 0; i < z.length; i++ )
	    retStr += z[i] + "  ";
	retStr += "]";
	return retStr;
    }

    public static void main (String[] args) {
	QuickSelect qs = new QuickSelect();
	int[] newb = new int[11];
	for (int i = 0; i < newb.length; i++) {
	    newb[i] = (int) ( Math.random() * 20 );
	}
	System.out.println(qs.printArray(newb));
	System.out.println(qs.quickSelect(newb, 3, 0, 10));
    }

}
