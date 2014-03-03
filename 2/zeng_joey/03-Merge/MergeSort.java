public class MergeSort{
    
    public MergeSort(){}

    public static int[] merge(int[] A, int[] B){
	int a = A.length;
	int b = B.length;
	int[] ret = new int[a+b];
	
	for(int i=a--+b---1; i > -1; i--){
	    if (a == -1)
		ret[i] = B[b--];
	    else if (b == -1 || A[a] <= B[b])
		ret[i] = A[a--];
	    else
		ret[i] = B[b--];
	}
	return ret;
    }


    public static void main(String[] args){
	int[] A = {9,8,5,3,2,0};
	int[] B = {12,10,9,1,-1};
	
	int[] C = merge(A,B);
	System.out.print(java.util.Arrays.toString(C));
	/*
	for(int i = 0 ; i < C.length; i ++){
	    System.out.print(C[i]);
	}
	*/
	System.out.println();
	
    }

}