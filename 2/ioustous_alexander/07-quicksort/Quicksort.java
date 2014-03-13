import java.util.*;
import java.io.*;

public class Quicksort {

    public static int[] qsort (int[] L){
	if (L.length <= 1){
	    return L;
	}
	int pivotindex = (int)(L.length/2);
	int pivot = L[pivotindex];
	ArrayList<Integer> low = new ArrayList<Integer>();
	ArrayList<Integer> high = new ArrayList<Integer>();
	for (int i = 0; i < pivotindex; i++){
	    if (L[i] <= pivot){
		low.add (L[i]);
	    }
	    if (L[i] > pivot){
		high.add (L[i]);
	    }
	}
	for (int i = pivotindex+1; i < L.length; i++){
	    if (L[i] <= pivot){
		low.add (L[i]);
	    }
	    if (L[i] > pivot){
		high.add (L[i]);
	    }
	}
	int[] lowarray = new int[low.size()];
	int []higharray = new int[high.size()];
	for (int i = 0; i < low.size(); i++){
	    lowarray[i] = low.get(i);
	}
	for (int i = 0; i< high.size(); i++){
	    higharray[i] = high.get(i);
	}
	
	lowarray= qsort(lowarray);
	higharray= qsort (higharray);
	int counter = 0;
	for (;counter < lowarray.length; counter++){
	    L[counter] = lowarray[counter];
	}
	L[counter] = pivot;
	for (int i =0; i < higharray.length; i++){
	    L[counter+1+i] = higharray[i];
	}
	return L;
    }
    
    public static void main (String [] args){
	int[] stuff = {9,7,6,8,2,7,8,4,7,1,0};

	System.out.println(Arrays.toString(qsort(stuff)));
    }
}
