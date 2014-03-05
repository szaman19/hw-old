import java.util.*;
public class mergesort{
    public static int[] merge (int[] A, int[] B){
        int a = 0;// index of int[] A
	int b = 0;// index of int[] B

	int c = 0; // index of completed array
	int[] C = new int[A.length + B.length];
    
	while (a <A.length && b <B.length){
	    if (A[a] <= B[b]){
		C[c] = A[a];
		a++;
	    }
	    else{
		C[c] = B[b];
		b++;
	    }
	    c++;
	}
	while (a<A.length){
	    C[c] = A[a];
	    c++;
	    a++;
	}
	while (b<B.length){
	    C[c] = B[b];
	    b++;
	    a++;
	}
	return C;
    }



    public static int[] msort(int[] L){
	if (L.length<=1){
	    return L;
	}
	else{
	    int[] a = new int[L.length/2];
	    a = Arrays.copyOfRange(L,0, L.length/2);
	    int[] b = new int[L.length - L.length/2];
	    b = Arrays.copyOfRange(L,L.length/2, L.length);
	    	    
	    int[] A = msort(a);
	    int[] B = msort (b);
	    L= merge(A,B);
	    return L;
	}

    }
    


    public static void main(String[]args){
	
	mergesort L = new mergesort();
	int[] A = new int[8];
	A[0] = 41;
	A[1] = 37;
	A[2] = 6;
	A[3] = 32;

	A[4] = 12;
	A[5] = 35;
	A[6] = 22;
	A[7] = 9;
	System.out.print("\n"+"[");
	int[] C = L.msort(A);
	for (int i = 0;i<C.length; i++){
	    System.out.print(C[i] + ",");
	}
	System.out.println("]"+ "\n");

	

    }


}