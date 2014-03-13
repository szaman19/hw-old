import java.util.*;
import java.io.*;

public class QuickSort{

    public Integer[] QuickSort(Integer [] arrayIn){
	
	if(arrayIn.length <= 1){
	    return arrayIn;
	}
	ArrayList<Integer> upper = new ArrayList<Integer>();
	ArrayList<Integer> lower = new ArrayList<Integer>();

	int middle = arrayIn.length / 2;
	int pivot = arrayIn[middle];

	for(int i = 0; i < middle; i++){
	    lower.add(arrayIn[i]);
	}

	for(int i = middle + 1; i < arrayIn.length; i++){
	    upper.add(arrayIn[i]);
	}

	
	Integer[] low = QuickSort(lower.toArray(new Integer[]{}));
	Integer[] high = QuickSort(upper.toArray(new Integer[]{}));
	

	int count = 0;
	for(int i = 0; i < low.length; i++){
	    arrayIn[count] = low[i];
	    count++;
	}
	arrayIn[count] = pivot;
	count++;
	for(int i = 0; i < high.length; i++){
	    arrayIn[count] = high[i];
	    count++;
	}
	return arrayIn;
	
    }


}