import java.util.*;
import java.io.*;

public class QuickSelect {

	private Random r = new Random();
	/*
	public int qSelect(int[] a, int k, int low, int high) {
		if (low >= high)
			return high;
		else {
			int p = r.nextInt(high-low+1)+low;
			System.out.println(p);
			int j = 0;
			int[] temp = new int[high-low+1];
			for (int i = low; i<=high; i++) {
				if (a[i] < a[p]) {
					temp[j] = a[i];
					j++;
				}
			}
			if (j+low == k)
				return a[p];
			if (j+low>k)
				return qSelect(a,k,low,low+temp.length-1);
			temp[j] = a[p];
			p = j;
			j++;
			for (int i = low; i<= high; i++) {
				if (a[i] >= temp[p]) {
					temp[j] = a[i];
					j++;
				}
			}
			return 
				qSelect(a,k,(high-temp.length)+1,high);
		}
	}
*/

	public int qSelect(int[] a, int k, int low, int high) {
		if (low >= high)
			return high;
		else {
			int p = r.nextInt(high-low+1)+low;
			System.out.println(p);
			int j = 0;
			int[] temp = new int[high-low+1];
			for (int i = low; i<=high; i++) {
				if (a[i] < a[p]) {
					temp[j] = a[i];
					j++;
				}
			}
			if (j+low == k)
				return a[p];
			if (j+low>k)
				return qSelect(a,k,low,low+temp.length-1);
			temp[j] = a[p];
			p = j;
			j++;
			for (int i = low; i<= high; i++) {
				if (a[i] >= temp[p]) {
					temp[j] = a[i];
					j++;
				}
			}
			return 
				qSelect(a,k,(high-temp.length)+1,high);
		}
	}

	public static void main(String[] args) {

		QuickSelect qs = new QuickSelect();
		int[] a = {1,8,6,7,2,4,5,6,8};
		System.out.println(qs.qSelect(a,3,0,8)+"!!");
	}














}
