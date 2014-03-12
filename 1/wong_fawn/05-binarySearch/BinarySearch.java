import java.io.*;
import java.util.*;

public class BinarySearch {
	public int rbsearch(int n, int[] L, int in) {
		int j = in;
		if (L.length <= 0) 
			return -1;
		else {
			int m = L.length / 2;
			int[] a;
			if (L[m] == n) 
				return j+m;
			else if (L[m] > n) {
				a = new int[m];
				for (int i = 0; i < m; i++) {
					a[i] = L[i];
				}
				j = j +  m;
			}
			else {
				int x = L.length - m;
				a = new int[x];
				for (int i = 0; i < x; i++) {
					a[i] = L[i + m];
				}
				j = j + m;
			}
			return rbsearch(n, a, j);
		}
	}

	public int ibsearch(String s, ArrayList<String> a) {
		int x = -1;
		while (a.size() > 0) {
			int m = a.size() / 2;
			if (a.get(m).compareTo(s) == 0) {
				x = m;
				a = new ArrayList<String>();
			}
			else if (a.get(m).compareTo(s) > 0) {
				ArrayList<String> b = new ArrayList<String>(m);
				for (int i = 0; i < b.size(); i++) {
					b.add(a.get(i));
				}
				a = b;
			}
			else {
				ArrayList<String> b = new ArrayList<String>(a.size() - m);
				for (int i = 0; i < b.size(); i++) {
					b.add(a.get(i + m));
				}
				a = b;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		int[] a = {1,2,4,4,5,7};
		ArrayList<String> b = new ArrayList<String>();
		b.add("a"); b.add("b"); b.add("c"); b.add("d");
		System.out.println(search.rbsearch(7, a, 0));
		System.out.println(search.ibsearch("c", b));
	}
}