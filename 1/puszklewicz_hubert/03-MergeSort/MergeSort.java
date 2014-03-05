import java.util.*;

public class MergeSort{
    public static int run = 1;

    //why doesn't this work?
    public static void merge2(int[] left, int[] right, int[] merged){
	for(int i = 0; i < left.length; i++){
	    if(left[i] > right[i]){
		merged[i] = left[i];
	    }else{
		merged[i] = right[i];
	    }
	}
    }

    public static void merge(int[] left, int[] right, int[] merged){
	int m = 0;
	int n = 0;
	for(int i = 0; i < merged.length; i++){//what is happening \/?
	    if((n >= right.length) || (m < left.length && left[m] <= right[n])){
		merged[i] = left[m];
		m++;
	    }else{
		merged[i] = right[n];
		n++;
	    }
	}
    }
    
    public static int[] left(int[] ar){
	int len = ar.length/2;
	int[] left = new int[len];
	for(int j = 0; j < len; j++){
	    left[j] = ar[j];
	}
	return left;
    }

    public static int[] right(int[] array){
	int len = array.length - array.length/2;
        int[] right = new int[len];
        for (int i = 0; i < len; i++) {
            right[i] = array[i + array.length/2];
        }
        return right;
    }

    public static void mergesort(int[] ar){
	System.out.println("Call #" + run + ": " + Arrays.toString(ar));
	run++;
	if(ar.length > 1){
	    int[] left = left(ar);
	    int[] right = right(ar);
	    mergesort(left);
	    mergesort(right);
	    merge(left, right, ar);
	}
    }

    public static void main(String[]args){
        int[] test = {1, 6, 3, 8, 4};
	System.out.println("Unsorted: " + Arrays.toString(test));
	mergesort(test);
	System.out.println("Sorted: " + Arrays.toString(test));
	run = 0;
        int[] test2 = {1231, 66346, 334, 8, 412323123};
	System.out.println("Unsorted: " + Arrays.toString(test2));
	mergesort(test2);
	System.out.println("Sorted: " + Arrays.toString(test2));
    }
}
	
