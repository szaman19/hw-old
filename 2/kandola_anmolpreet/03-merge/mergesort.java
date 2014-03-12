//Mergesort = log(n): Divide + Conquer Alg ( split) 

public class mergesort {
    
    public static String print(int[] a) {
	String ans = "";
	for (int l : a) {
	    ans += l + ",";
	}
	ans = ans.substring(0,ans.length()-1);
	return ans;
    }
    
    public static int[] mergesort (int[] L) {

		if (L.length <= 1) {
	    return L;
	}
	else {
	    int[] a,b;
	    if (L.length % 2 == 0) {
		a = new int[L.length/2];
		b = new int[L.length/2];
	    }
	    else {
		a = new int[L.length/2];
		b = new int[L.length/2 + 1];
	    }
	for (int i = 0; i < a.length;i++) {
	    a[i] = L[i];
	}
	for (int j = 0; j<b.length;j++) {
	    b[j] = L[j + L.length/2];
	}
	int[] f1 = mergesort(a);
	int[] f2 = mergesort(b);
	return merge(f1,f2);
	
	}
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
	int[] x = new int[7];
	x[0] = 21;
	x[1] = 12;
	x[2] = 4;
	x[3] = 17;
	x[4] = 2;
	x[5] = 8;
	x[6] = 3;
	System.out.println(print(mergesort(x)));
	
    }
}
