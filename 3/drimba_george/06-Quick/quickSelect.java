import java.io.*;
import java.util.*;

public class quickSelect {
	public int quickSelect(int[] a, int k, int lo, int hi) {
		if (lo >= hi)
			return hi;
		else {
			int p = r.nextInt(hi-lo+1)+lo;
			System.out.println(p);
			int n = 0;
			int[] temp = new int[hi-lo+1];
			for (int i = lo; i<=hi; i++) {
				if (a[i] < a[p]) {
					temp[n] = a[i];
					n++;
				}
			}
			if (n+lo == k)
				return a[p];
			if (n+lo>k)
				return quickSelect(a,k,lo,lo+temp.length-1);
			temp[n] = a[p];
			p = n;
			n++;
			for (int i = lo; i<= hi; i++) {
				if (a[i] >= temp[p]) {
					temp[n] = a[i];
					n++;
				}
			}
			return 
				quickSelect(a,k,(hi-temp.length)+1,hi);
		}
	}