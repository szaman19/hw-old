public class BinarySearch{
    public static boolean found = true;
    public static void RecursiveSearch(int[] A, int looking){
	if(A[A.length / 2] == looking){
	    System.out.println("True");
	    return;
	}
	if (A.length == 1){
	    if(A[0] == looking){
		System.out.println("True");
		return;
	    }
	    System.out.println("False");
	    return;
	}
	if (A.length == 2){
	    if (A[0] == looking){
		System.out.println("True");
		return;
	    }
	    if (A[1] == looking){
		System.out.println("True");
		return;
	    }
	    System.out.println("False");
	    return;
	}
	
	if (A[A.length / 2] > looking){
	    int[] B = new int[(A.length / 2)];
	    for (int i = 0;i<B.length;i++){
		B[i] = A[i];
		System.out.println(B[i]);
	    }
	    RecursiveSearch(B,looking);
	}
	if (A[A.length / 2] < looking){
	    int[] B = new int[(A.length - (A.length / 2))];
	    for (int i = 0;i<B.length;i++){
		B[i] = A[(A.length / 2) + i];
		System.out.println(B[i]);
	    }
	    RecursiveSearch(B,looking);
	}
	
	
	
    }
    
	
    public static void LoopingSearch(int[] A, int looking){
	int[] B = A;
	
	 
	while(true){
	    if(B[B.length / 2] == looking){
		System.out.println("True");
		break;
	    }
	    if(B.length / 2 <= 2){
	        if(B.length == 2){
		    if(B[1] == looking)
			System.out.println("True");
		}
		if(B[0] == looking)
		    System.out.println("True");
		break;
	    }
	    
	    while (B[B.length / 2] > looking){
		int[] C = new int[B.length / 2];
		for (int i = 0;i<C.length;i++){
		    C[i] = B[i];
	
		}
		B = C;
		for (int i = 0;i<B.length;i++)
		    System.out.println(B[i]);
	    }
	    while (B[B.length / 2] < looking){
		int[] C = new int[B.length - (B.length / 2)];
		for (int i = 0;i<C.length;i++){
		    C[i] = B[(B.length/2)+i];
	
		}
		B = C;
		for (int i = 0;i<B.length;i++)
		    System.out.println(B[i]);
	    }
	    
	    
	}
    
    }

    public static void main(String[] args){
	
	int[] array = new int[10];
	for (int i = 0;i<array.length;i++){
	    array[i] = i;
	    //System.out.println(array[i]);
	}
	BinarySearch.LoopingSearch(array,9);
	BinarySearch.RecursiveSearch(array,0);
	
    }
}
