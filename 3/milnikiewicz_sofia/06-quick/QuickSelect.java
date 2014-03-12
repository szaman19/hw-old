import java.io.*;
import java.util.*;

public class QuickSelect{

    public int[] array;
    Random rnd;


    public static void main (String[] args){
	QuickSelect qs = new QuickSelect(10);
	System.out.println("Initial Array: "  + qs.toString());
	System.out.println("QuickSelect for 3rd smallest item: " + qs.quickselect(qs.array, 3, 0, (qs.array.length)-1));
    }

	   	 
    public QuickSelect(int n){
	rnd = new Random();
	array = new int[n];
	for (int i=0; i<n;i++){
	    array[i] = rnd.nextInt(100);
	}
    }
    
    public QuickSelect(){
	this(5);
    }

    public String toString(){
	String s = "";
        s+=Arrays.toString(array);
	return s;
    }
			  
			  
    public int quickselect(int[] a, int k, int low, int high){
	if (low>=high){
	    return high;
	}
	else{
	    int range = high-low;
	    int pivot = low+rnd.nextInt(range+1);
	    int[] tmp = new int[range+1];
	    int i2 = 0;
	    for (int i = low; i<=high; i++){
		if (array[i] < array[pivot]){
		    tmp[i2] = array[i];
		    i2++;
		}
	    }
	    if (i2+low==k){
		return array[pivot];
	    }
	    if (i2+low>k){
		return quickselect(array, k, low, (low+tmp.length)-1);
	    }
	    tmp[i2] = array[pivot];
	    pivot = i2;
	    i2++;
	    for (int i = low; i<=high; i++){
		if (array[i] >= tmp[pivot]){
		    tmp[i2] = array[i];//some weird error from around here happens sometimes
		    i2++;
		}
	    }
	    return quickselect(array, k, (high-tmp.length)+1, high);
	}


    }

}
