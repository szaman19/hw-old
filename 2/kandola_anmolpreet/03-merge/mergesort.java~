

public class mergesort {
    public static int[] mergesort (int[] L) {
	int[] a;
	int[] b;
	if (L.length <= 1) {
	    return L;
	}
	else if (L.length % 2 == 0) {
	    a = new int[L.length/2];
	    b = new int[L.length/2];
	}
	else {
	    a = new int[L.length/2];
	    b = new int[L.length/2 + 1];
	}
	for (int i = 0; i < L.length/2;i++) {
	    a[i] = L[i];
	}
	for (int j = 0; j>L.length/2 && j <L.length;j++) {
	    b[j] = L[j];
	}
	a = mergesort(a);
	b = mergesort(b);
	L = merge(a,b);
	return L;
       
    }
	

    public static int[] merge(int[] A, int[] B) {
	int[] x = new int[A.length + B.length];
	int a = 0;
	int b = 0;
	int c = 0;
	while (a < A.length && b < B.length) {
	    if (A[a] < B[b]) {
		x[c] = A[a];
		a++;
	    }
	    else {
		x[c] = B[b];
		b++;
	    }
	    c++;
	}
	
	while (a < A.length) {
	    x[c] = A[a];
	    a++;
	    c++;
	}
	while (b < B.length) {
	    x[c] = B[b];
	    b++;
	    c++;
	}
	return x;
    }
			     
    public static void main(String[]args) {
	//	int a[] = new int[] {1,3,4,8,13,43};
	//	int b[] = new int[] {2,3,5,16,34,42};
	//	int[] y = merge(a,b);
	//	for (int l=0;l<y.length;l++) {
	//	    System.out.print(y[l] + ", ");
	//	}
	// The above code checks for the functioning of the merge function.
	int[] x = new int[] {21, 12, 4, 17, 23, 26, 14, 17, 3, 2, 7, 8};
	mergesort(x);
	for (int l=0;l<x.length;l++) {
	    System.out.print(x[l] + ", ");
	}
    }
}
