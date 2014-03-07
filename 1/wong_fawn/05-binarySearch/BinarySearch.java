import java.io.*;
import java.util.*;

public class BinarySearch {
    public int rbsearch(int n, int[] L) {
	if (L.length <= 0) 
	    return -1;
	else {
	    int m = L.length / 2;
	    int[] a;
	    if (L[m] == n) 
		return m;
	    else if (L[m] > n) {
		a = new int[m];
		for (int i = 0; i < m; i++) {
		    a[i] = L[i];
		}
	    }
	    else {
		int x = L.length - m;
		a = new int[x];
		for (int i = 0; i < x; i++) {
		    a[i] = L[i + m];
		}
	    }
	    return rbsearch(n, a);
	}
    }
    
    public static void main(String[] args) {
	BinarySearch search = new BinarySearch();
	int[] a = {1,2,3,4,5,6,7};
        search
    }
    
}