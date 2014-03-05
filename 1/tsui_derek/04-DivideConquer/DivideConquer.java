public class DivideConquer{
    public static String[] mergeSort(String[] A){
	if (A.length <= 1) return A;
	else {
	    String[] B = new String[A.length / 2];
	    String[] C = new String[A.length - B.length];
	    
	    for (int x = 0; x < B.length; x++){
		B[x] = A[x];
	    }
	    for (int x = B.length; x < A.length; x++){
		C[x - B.length] = A[x];
	    }
	    
	    B = mergeSort(B);
	    C = mergeSort(C);
	    A = merge(B,C);
	    return A;
	}
    }

    public static String[] merge(String[] A, String[] B){
	String[] C = new String[A.length + B.length];
	
	int apos = 0;
	int bpos = 0;
	for (int x = 0; x < C.length; x++){
	    if (apos >= A.length){
			C[x] = B[bpos];
			bpos++;
	    } else if (bpos >= B.length){
			C[x] = A[apos];
			apos++;
	    } else {
			if (B[bpos].compareTo(A[apos]) <= 0) {
			    C[x] = B[bpos];
			    bpos++;
			} else {
			    C[x] = A[apos];
			    apos++;				
			}
	    }
	}
	return C;
    }
	
    public static void printArray (String[] a){
	for (String x : a){
	    System.out.print(x + ", ");
	}
	System.out.println();
    }

    public static void main(String[]args){
	
	String [] c = {"abcba", "efgfe", "aceca", "ecaca"};
	String [] d = {"nifty", "cat", "hello", "inconceivable"};
	c = mergeSort(c);
	printArray(c);
	d = mergeSort(d);
	printArray(d);
    }
}