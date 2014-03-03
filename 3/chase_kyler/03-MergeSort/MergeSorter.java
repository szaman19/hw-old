import java.util.*;
import java.io.*;

public class MergeSorter {

	public int[] merge(int[] a, int[] b) {
		int x = 0;
		int y = 0;
		int z = 0;
		int[] r = new int[a.length+b.length];
		for (; z<r.length; z++) {
			if (x>=a.length) {
				r[z] = b[y];
				y++;
			}
			else if (y>=b.length) {
				r[z] = a[x];
				x++;
			}
			else if (a[x] < b[y]) {
				r[z] = a[x];
				x++;
			}
			else {
				r[z] = b[y];
				y++;
			}
		}
		return r;
	}

/*	public String sort(int[] a, int[] b) {
		if (a.length > 1)
			if */






	public static void main(String args[]) {
		MergeSorter ms = new MergeSorter();
		int[] a = {1,2,3,4,5};
		int[] b = {2,4,6,8,10};
	//	System.out.println(ms.merge(a,b));
	}















}
