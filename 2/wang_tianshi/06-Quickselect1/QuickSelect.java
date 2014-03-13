import java.io.*;
import java.util.*;

//Still does not work

public class QuickSelect{
    
    public int QuickSelect(int[] a, int k, int low, int high){
	int[] temp = new int[a.length];
	int left = low;
	int right = high;

	if (low>=high)
	    return low;

	Random r = new Random();
	int pivot = r.nextInt(high-low) + low;

        for(int i=low; i<high;i++){
	    if (a[i]>a[pivot]){
		temp[right]=a[i];
		right--;
	    }
	    else{
		temp[left]=a[i];
		left++;
	    }
	}

	temp[right] = a[pivot];

	if (right==k)
	    return a[right];
	else if(right > k)
	    return QuickSelect(temp, k, low, right-1);
	else
	    return QuickSelect(temp, k, right+1, high);
    }


    public static void main (String[] args){
	int[] list = {3,1,4,8,2,34,1,2,643,234,78};
	QuickSelect qs = new QuickSelect();
	System.out.println(qs.QuickSelect(list, 7, 0,10));
	System.out.println(qs.QuickSelect(list, 0, 0,10));

    }
}
