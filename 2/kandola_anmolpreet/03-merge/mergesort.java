

public class mergesort {
    
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
	int a[] = new int[] {1,3,4,8,13,43};
	int b[] = new int[] {2,3,5,16,34,42};
	int[] y = merge(a,b);
	for (int l=0;l<y.length;l++) {
	    System.out.print(y[l] + ", ");
	}
    }
}
