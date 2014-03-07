import java.util.*;
public class MergeSort{
    public static int[] mergeSort(int[] A){
<<<<<<< HEAD
	if(A.length > 1){
	    int[] x = new int[A.length/2];
	    int[] y = new int[A.length-A.length/2];
	    for(int z = 0;z<A.length;z++){
		if(z<x.length){
		    x[z] = A[z];
		} else {
		    y[z-x.length] = A[z];
		}
	    }
	    x = mergeSort(x);
	    y = mergeSort(y);
	    A = merge(x,y);
	}
	return A;
=======
        if(A.length > 1){
            int[] x = new int[A.length/2];
            int[] y = new int[A.length-A.length/2];
            for(int z = 0;z<A.length;z++){
                if(z<x.length){
                    x[z] = A[z];
                } else {
                    y[z-x.length] = A[z];
                }
            }
            x = mergeSort(x);
            y = mergeSort(y);
            A = merge(x,y);
        }
        return A;
>>>>>>> c0694cc9c835f09d970e7c163546c0660331e030
    }
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
<<<<<<< HEAD
	int[] A = {0, 40, 400, 8, 1};
	int[] B = {3, 5, 15, 20};
	A = mergeSort(A);
	for(int x : A){
	    System.out.print(x+" ");
	}
=======
        int[] A = {0, 40, 400, 8, 1};
        int[] B = {3, 5, 15, 20};
        A = mergeSort(A);
        for(int x : A){
            System.out.print(x+" ");
        }
>>>>>>> c0694cc9c835f09d970e7c163546c0660331e030
    }
}
