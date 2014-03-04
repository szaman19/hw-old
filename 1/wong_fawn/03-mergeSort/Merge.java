import java.io.*;
import java.util.*;

public class Merge {
	public int[] merge(int[] A, int[] B) {
		int a = 0; b = 0, c = 0;
		int len = A.length + B.length;
		int[] C = int[len];
		for (int i = 0; i < len; i++) {
			if (a == A.length) {
				C[i] = B[b];
				b = b + 1;
			}
			else if (b == B.length) {
				C[i] = A[a];
				a = a + 1;
			}
			else if (A[a] < B[b]) {
				C[i] = A[a];
				a = a + 1;
			}
			else {
				C[i] = B[b];
				b = b + 1;
			}
		}
		return C;
	}      
}      