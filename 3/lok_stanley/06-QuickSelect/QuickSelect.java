import java.util.*;
import java.io.*;

public class QuickSelect{

    //Can't get Partitioning of the Array Correct

    public int quickselect(int[] a, int k){
	return quickselect(a,k,0,a.length - 1);
    }

    public int quickselect(int[] a, int k, int low, int high){
	int middle = (low + high)/2;
	int pivot = a[middle];
	
	//System.out.println( "\nMiddle: " + middle + " Pivot: " + pivot + " Low: " + low + " High: " + high);
	
	if(low >= high){
	    return a[k];
	}
	else{
	    int[] temp = new int[a.length];
	    int count = 0;
	    int count2 = 0;
	    //  System.out.println("Pivot: " + pivot);
	    for(int i = low; i <= high; i++){
		//	for(int j = 0; j < temp.length; j++){
		//  System.out.print(temp[j] + " ");
		//}
		//System.out.println();
		if (a[i] < pivot){
		    temp[low + count] = a[i];
		    count++;
		}
		else if(a[i] > pivot){
		    temp[high - count2] = a[i];
		    count2++;
		}/*
		else{
		    System.out.println("yes");
		    temp[middle] = pivot;
		    //System.out.println(temp[i]);
		    }*/
	    }
	    a = temp;
	    //for(int i = 0; i < temp.length; i++){
	    //	 System.out.print(temp[i] + " ");
	    //}
	    //System.out.println();
	    //System.out.println("Middle: " +  middle);
	    if(middle < k){
		low = middle + 1;
		return quickselect(a,k,low,high);
	    }
	    else if(middle > k){
		high = middle - 1;
		return quickselect(a,k,low,high);
	    }
	    else{
		return a[k];
		
	    }
	 
	}
    }

}