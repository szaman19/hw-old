import java.util.*;

public class QuickSelect{
    public int QuickSelect(int[] a, int k, int low, int high){
	int i;
	if(low >= high){
	    return a[low];
	}
	i = (int)(Math.random() * (high - low)) + low;
	int pivot = a[i];
	int[] hold = new int[a.length];
	int startl = 0;
	int startr = a.length - 1;
	for(int j = 0; j < a.length; j++){
	    if(a[j] < pivot){
		hold[startl] = a[j];
		startl++;
	    }
	    if(a[j] > pivot){
		hold[startr] = a[j];
		startr--;
	    }
	}
	hold[startl] = pivot;
	if((startl + 1) == k){
	    return hold[startl];
	}
	if((startl + 1) < k){
	    return QuickSelect(hold, k, startl, high);
	}else{
	    return QuickSelect(hold, k, low, startl);
	}
    }
    
    public static void main(String[] args){
	int[] a = {9, 8, 7, 6, 4, 2, 3, 1, 10, 23, 0, 65};
	QuickSelect q = new QuickSelect();
	System.out.println("Answer should be 23");
	System.out.println("Answer: " + q.QuickSelect(a, 11, 0, a.length));

    }
}
	    
