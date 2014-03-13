//Getting stackOverflow runtime errors, something to do with Math.random()?
//This cropped up after nullPointerExceptions I couldn't explain in line 22, maybe related?
import java.util.*;
public class Quickselect{
    public static int quickselect(int[] a, int k, int low, int high){
	if (low>=high){
	    return low;
	}
	int pivot = (int)(Math.random()*(high-low))+low;
	int[] part = new int[a.length];
	int firstLength = 0;
	for(int x = low;x<high;x++){
	    if(a[x]<a[pivot]){
		part[x-low] = a[x];
		firstLength++;
	    }
	}
	part[firstLength] = a[pivot];
	for(int x = low;x<high;x++){
	    if(a[x]>a[pivot]){
		firstLength++;
		part[firstLength] = a[low+x];
	    }
	    a[x] = part[x-low];
	}
	if(pivot == k){
	    return pivot;
	} else if(pivot < k){
	    return quickselect(a, k, low, pivot);
	} else {
	    return quickselect(a, k, pivot, high);
	}
    }
    public static void main(String[]args){
	int[] a = {3, 5, 2, 7, 12, 5, 7, 9};
	System.out.println(quickselect(a, 2, 0, a.length));
    }
}
