import java.io.*;
import java.util.*;

public class Quickselect {
	
	public int quickSelect( int[] a, int k, int hi, int lo) {
		int high = a.length-1;
		int low = 0;
		int piv = (int)(Math.random() * (high - low)) + low;
		int[] temp = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
		
		if (i == piv) {
			i++;
			}
		if (a[i] > a[piv] ) {
			temp[high] = a[i];
			high--;
		}
		else if (a[i] <= a[piv] ) {
			temp[low] = a[i];
			low++;
		}
		} 
		temp[low] = a[piv];
		piv = low;
		
		if (piv == k) {
			return piv;
		}
		else {
			int p = 0;
			for (int item: temp) {
				a[p] = item;
				p++;
			}
			if (k < piv) {
				return quickSelect(a, k, piv -1, lo);
				}
			else {
				return quickSelect(a, k, lo, piv+1);
			}
		}
	}
}