import java.io.*;
import java.util.*;

public class QuickSort{

    private int[]done;

    public int[] quickSort(int[]L){
	if (L.length <= 1){
	    return L;
	}
	else{
	    int pivot = L.length/2;
	    ArrayList<Integer> lower = new ArrayList<Integer>(); 
	    ArrayList<Integer> high = new ArrayList<Integer>(); 
	    for (int i = 0; i < L.length; i++){
		if(L[i] <= pivot){
		    lower.add(L[i]);
		}
		else{
		    high.add(L[i]);
		}
	    }
	    Integer[]LowArray = lower.toArray(new Integer[lower.size()]);
	    Integer[]HiArray = high.toArray(new Integer[high.size()]);
	    int[]LArray = new int [LowArray.length];
	    for (int i = 0; i < LowArray.length; i++){
		LArray[i] = LowArray[i];
	    }
	    int[]HArray = new int[HiArray.length];
	    for (int i = 0; i < HiArray.length; i++){
		HArray[i] = HiArray[i];
	    }
	    quickSort(LArray);
	    quickSort(HArray);

	    done = new int[L.length];
	    for (int i = 0; i < LArray.length; i++){
		done[i] = LArray[i];
	    }
	    done[LArray.length] = L[LArray.length];
	    for (int i = LArray.length+1; i < L.length; i++){
		done[i] = HArray[i-LArray.length];
	    }
	}
	return done;
    }
    public static void main(String[] args){
	QuickSort q = new QuickSort();
	int[] a = {43,6,1,34,883,90,22,56,44,7,26,256,5};
	System.out.println(Arrays.toString(q.quickSort(a)));
    }
}
