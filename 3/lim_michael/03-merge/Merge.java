import java.io.*;
import java.util.*;

public class Merge{
	public int[] merge(int[] l, int[] r) {
		int[] a = new int[l.length + r.length];
		int j = 0; 
		int k = 0; 
		for (int i = 0; i < a.length; i++) {
			if (r.length <= k || (j < l.length && l[j] <= r[k])) {
				a[i] = l[j];
				j = j + 1;
			} else {
				a[i] = r[k];
				k = k + 1;
			}
		}
		return a;
	}

	public static void main(String[] args){
		Merge m = new Merge();
		int[] s1 = {12,27,36,57,356};
		int[] s2 = {1,6,37,68,80,88};
		int[] result = m.merge(s1, s2);
		System.out.println("" + Arrays.toString(result));
	}
}