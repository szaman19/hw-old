import java.io.*;
import java.util.*;
import java.lang.*;

public class binary{
	public int rbsearch(int n, int[] L) { 
		return rbsearch(L, n, 0, L.length - 1);
	}

	private int rbsearch(int[] L, int n, int l, int h) {
		if (l > h) 
			return -1; 
		
		int avg = (l + h)/2;
		
		if (L[avg] == n) 
			return avg;
		else if (L[avg] >= n)
			return rbsearch(L, n, l, avg-1);
		else 
			return rbsearch(L, n, avg+1, h);
	}

	public int ibsearch(int n, int[] L){
		int l = 0;
		int h = L.length - 1;

		while (!(l > h)) {
			int avg = (l + h)/2;
			if (L[avg] == n) 
				return avg;
			else if (L[avg] >= n) 
				h = avg - 1;
			else 
				l = avg + 1;
		}
		return -1;
	}


}