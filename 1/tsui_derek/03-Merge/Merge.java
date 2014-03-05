public class Merge{
    public static int[] mergeSort(int[] A){
	if (A.length <= 1) return A;
	else {
	    int[] B; 
	    if (A.length % 2 == 0) B = new int[A.length / 2];
	    else B = new int[(A.length / 2) + 1];
	    int[] C = new int[A.length / 2];
	    
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

    public static int[] merge(int[] A, int[] B){
	int[] C = new int[A.length + B.length];
	
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
			if (B[bpos] < A[apos]) {
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
	
    public static void printArray (int[] a){
	for (int x : a){
	    System.out.print(x + ", ");
	}
	System.out.println();
    }

    public static void main(String[]args){
    /*
	int[] a = {1,2,6,9};
	int[] b = {3,5,7};
	int[] x = merge(a,b);
	printArray(x);
	*/
	
	int[] c = {3,9,4,1,7};
	int[] d = {5,9,10,2,3,15,2,55,1};
	c = mergeSort(c);
	printArray(c);
	d = mergeSort(d);
	printArray(d);
    }
}