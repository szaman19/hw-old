import java.util.*;
public class MergeSort{
    private static int[] merge(int[] A, int[] B){
	int[] ans = new int[A.length + B.length];
	int currentA = 0;
	int currentB = 0;
	int xHold = 0;
	for(int x = 0;x < ans.length 
		&& currentA < A.length 
		&& currentB < B.length;x++){
	    xHold = x;
	    if(A[currentA]<=B[currentB]){
		ans[x] = A[currentA];
		currentA++;
	    }else{
		ans[x] = B[currentB];
		currentB++;
	    }
	}
	while(currentA < A.length){
	    xHold++;
	    ans[xHold] = A[currentA];
	    currentA++;
	}
	while(currentB < B.length){
	    xHold++;
	    ans[xHold] = B[currentB];
	    currentB++;
	}
	return ans;
    }
    public static void main(String[] args){
	int[] A = {0, 4, 8, 100};
	int[] B = {3, 5, 15, 20};
	int[] C = merge(A, B);
	for(int x : C){
	    System.out.print(x+" ");
	}
    }
}