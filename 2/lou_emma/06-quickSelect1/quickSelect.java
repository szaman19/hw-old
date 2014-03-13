import java.io.*;
import java.util.*;

public class quickSelect{

	public int quickselect(int[] a, int k, int low, int high){
		if (low>=high)
			return a[high];
		else{
			int[] b = new int[a.length];
			int low2 = low;
			int high2 = high;
			random = high/2;
			for (int i = low; i < high; i++){
				if(a[i] < a[p]){
				    b[low2] = a[i];
				    low2 = low2 + 1;
				}
				else if(a[i] > a[p]){
				    b[high2] = a[i];
				    high2 = high2 - 1;
				}
				else{
				    b[low2] = a[random];
				}
			}
			if (low2 == k)
				return b[k];
			else if(b1 < k)
				return quickselect(b,k,high2,high);
			else
				return quickselect(b,k,low,low2);
		}
	}
	
}