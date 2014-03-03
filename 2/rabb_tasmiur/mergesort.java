public class mergesort{
    
    public static int[] merge(int[] A, int[] B){
	int[] m = new int[A.length + B.length];
	
	int i = 0; 
	int j = 0;
	int k = 0;
	
	while (i < A.length && j < B.length){
	    if (A[i] < B[j]){
		m[k] = A[i];
		i++;
	    }
	    else{
		m[k] = B[j];
		j++;
	    }
	    k++;
	}

	while (i < A.length){
        m[k] = A[i];
        i++;
        k++;
	}

	while (j < B.length){
        m[k] = B[j];
        j++;
        k++;
	}

    return m;
}
		    
    public static void main(String[]args){
	int b[] = new int[] {9, 13, 24, 33, 39, 45};
	int c[] = new int[] {11, 22, 35, 37, 40, 49};
	int[] z = merge(b, c);
	for (int x = 0; x < z.length; x++){
	    System.out.print (z[x] + " " ) ;
    }
    }
}