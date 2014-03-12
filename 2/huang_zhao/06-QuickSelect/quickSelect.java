import java.util.*;
public class quickSelect{
    public int quickselect(int[]a,int k,int low,int high){
	Random rand = new Random();
	int r = rand.nextInt(high);
	if (low >= high)
	    return a[low];
	r = partition(a,r,low,high);
	if( k == r)
	    return a[r];
	else if (k<r)
	    return quickselect(a,k,low,high-1);
	else if( k>r)
	    return quickselect(a,k,low+1,high);
	else 
	    return -1;
    }

    public int partition(int[]a,int k,int low,int high){
	int d = a[k];
	while (low != high){
	    while (a[low] < d){
		low ++;
	    }
	    while (a[high]>d){
		high ++;
	    }
	    int temp = a[low];
	    a[low]= a[high];
	    a[high]= temp;
	}
	return low;
    }
}