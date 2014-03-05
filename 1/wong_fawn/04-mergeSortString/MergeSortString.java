import java.io.*;
import java.util.*;

public class MergeSortString {
	public String[] merge(String[] A, String[] B) {
		int ia = 0, ib = 0;
		int len = A.length + B.length;
		String[] C = new String[len];
		for (int i = 0; i < len; i++) {
			if (ia == A.length) {
				C[i] = B[ib];
				ib = ib + 1;
			}
			else if (ib == B.length) {
				C[i] = A[ia];
				ia = ia + 1;
			}
			else if (A[ia].compareTo(B[ib]) < 0) {
				C[i] = A[ia];
				ia = ia + 1;
			}
			else {
				C[i] = B[ib];
				ib = ib + 1;
			}
		}
		return C;
	}

	public String[] sort(String[] L) {
		if (L.length <= 1) 
			return L;
		else {
			int l = L.length;
			int a = l / 2, ia = 0;
			int b = l - a, ib = 0;
			String[] A = new String[a], B = new String[b];
			for (int i = 0; i < l; i++) {
				if (i < a) {
					A[ia] = L[i];
					ia = ia + 1;
				}
				else {
					B[ib] = L[i];
					ib = ib + 1;
				}
			}
			A = sort(A);
			B = sort(B);
			L = merge(A,B);
			return L;
		}
	}

	public static void main(String[] args) {
		MergeSortString m = new MergeSortString();
		String[] a = {"i", "d", "e", "h", "e", "a", "y", "i", "r", "g", "q"};
		a = m.sort(a);
		System.out.println(Arrays.toString(a));
		
	}
}      