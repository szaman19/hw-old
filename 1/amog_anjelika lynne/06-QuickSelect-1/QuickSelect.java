import java.io.*;
import java.util.*;

public class QuickSelect {
    public int quickSelect (int[] a, int k, int low, int high){
	if (low >= high)
	    return a[high];
	Random r = new Random();
	int pivotIndex = r.nextInt(high - low) + low;
	int pivot = a[pivotIndex];
	int[] temp = new int[a.length];
	int loIndex = 0;
	int hiIndex = a.length - 1;
	for (int i = 0; i < a.length; i++){
	    if (a[i] < pivot){
		temp[loIndex] = a[i];
		loIndex++;
	    }
	    else if (a[i] > pivot){
		temp[hiIndex] = a[i];
		hiIndex--;
	    }
	}
	temp[loIndex] = pivot;
	pivotIndex = loIndex;
	if (pivotIndex == k)
	    return a[pivotIndex];
	else if (pivotIndex < k)
	    return quickSelect(temp, k, low, pivotIndex - 1);
	else
	    return quickSelect(temp, k, pivotIndex + 1, high);
    }
}

