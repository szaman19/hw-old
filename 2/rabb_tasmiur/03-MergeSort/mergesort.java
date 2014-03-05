import java.io.*;
import java.util.Arrays;

public class mergesort{

    public static void mergeSort(int[] A) {
    if (A.length > 1) {
        int m = A.length/2;
        int[] left = leftHalf(A);
        int[] right= rightHalf(A);
	
	mergeSort(left);
	mergeSort(right);

	merge(A, left, right);
    }
}

    // Returns the first half of the given array.
    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }
    
    // Returns the second half of the given array.
    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

	       

    public static void merge(int[] ret,int[] left, int[] right){
	int i1 = 0; //left array index
	int i2 = 0; // right array index
	
	for (int i = 0; i < ret.length; i++) {
            if (i2 >= right.length || (i1 < left.length && 
                    left[i1] <= right[i2])) {
                ret[i] = left[i1];    // take from left
                i1++;
            } else {
                ret[i] = right[i2];   // take from right
                i2++;
            }
	}
    }
			    
    public static void main(String[]args){
	   int[] X = {14, 32, 67, 76, 23, 41, 58, 85};
        System.out.println("before: " + Arrays.toString(X));
        mergeSort(X);
        System.out.println("after:  " + Arrays.toString(X));
    }

}