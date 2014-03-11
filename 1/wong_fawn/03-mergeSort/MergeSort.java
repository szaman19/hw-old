import java.io.*;
import java.util.*;

public class MergeSort {
	public int[] merge(int[] A, int[] B) {
		int ia = 0, ib = 0;
		int len = A.length + B.length;
		int[] C = new int[len];
		for (int i = 0; i < len; i++) {
			if (ia == A.length) {
				C[i] = B[ib];
				ib = ib + 1;
			}
			else if (ib == B.length) {
				C[i] = A[ia];
				ia = ia + 1;
			}
			else if (A[ia] < B[ib]) {
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

	public int[] sort(int[] L) {
		if (L.length <= 1) 
			return L;
		else {
			int l = L.length;
			int a = l / 2, ia = 0;
			int b = l - a, ib = 0;
			int[] A = new int[a], B = new int[b];
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
		MergeSort m = new MergeSort();
		int[] l = new int[100];
		for (int i = 0; i< l.length; i++) {
			Random r = new Random();
			l[i] = r.nextInt(100);
		}
		l = m.sort(l);
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + ", ");
		}
		System.out.println();
	}
}      