import java.util.Arrays;

public class QuickSort2{
	
	public static void partition(int[] a, int L, int H){
	//  pivot is leftmost element
	    int count = L+1;
	    int pivot = a[L];
	//  2. partition array about pivot
	    for(int x = L + 1; x <= H; x++){
		if(a[x] <= pivot){
		    int temp = a[count];
		    a[count] = a[x];
		    a[x] = temp;
		    count++;	    
		}
                
	    }
	    // switches pivot with the last switched element
	    a[L] = a[count - 1];
	    a[count - 1] = pivot;
            
	    System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args){
	    int [] a = {22,55,66,11,32,56,67,89,95,10};   
	    partition(a,0,a.length - 1);
	    partition(a,3,a.length - 1);
	}

}
