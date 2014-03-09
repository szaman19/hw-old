import java.util.*;

public class BinSearch {

    public static int rbsearch(int n, int[] L) {
	return rbsearch(n, L, 0, L.length-1);
    }

    public static int rbsearch(int n, int[] L, int l, int h) {
	if(l > h) {
	    return -1;
	}
	int m = (l+h)/2;
	if(L[m] == n) {
	    return m;
	}
	else if(L[m] < n) {
	    return rbsearch(n, L, m+1, h);
	}
	else {
	    return rbsearch(n, L, l, m-1);
	}
    }

    public static int ibsearch(int n, int[] L) {
	int ans = -1;
	int l = 0;
	int h = L.length-1;
	int m;
	while(h >= l) {
	    m = (l+h)/2;
	    if(L[m] == n) {
		return m;
	    }
	    else if(L[m] < n) {
		l = m+1;
	    }
	    else {
		h = m-1;
	    }
	}
	return ans;
    }
	    

    public static void main(String[] args) {
	int[] a = new int[100];
	for(int x = 0; x < 100; x++) {
	    a[x] = x;
	}
	System.out.println(rbsearch(24, a));
	System.out.println(ibsearch(39, a));
    }
  
}
