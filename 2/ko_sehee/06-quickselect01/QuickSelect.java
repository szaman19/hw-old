import java.util.*;

public class QuickSelect{
    public int quick( int[] a, int k, int low, int high){
	if((high ==low) && k-1 != low){
	    return -1;
	}   
	else if (low >= high){
	    return a[low];
	}
	else{
	    int p = (high+low)/2;
	    int[] tmp = new int[a.length];
	    int lo = low;
	    int hi = high;
	    for (int i = low; i < p; i ++){
		if (a[i] > a[p]){
		    tmp[hi] = a[i];
		    hi= hi -1;
		}
		else if (a[i] < a[p]){
		    tmp[lo] = a[i];
		    lo = lo +1;
		}
	    }
	    for (int j = p + 1; j < hi; j ++){
		if (a[j] > a[p]){
		    tmp[hi] = a[j];
		    hi= hi -1;
		}
		else if (a[j] < a[p]){
		    tmp[lo] = a[j];
		    lo = lo +1;
		}
	    }
	    tmp[p] = a[p];
	    if (p - low == k-1){
		return tmp[p];
	    }
	    else if (p -low > k){
		return quick(tmp, k, low, p-1);
	    }
	    else if(k >(p-low)){
		return quick(tmp,k, p+1, high);
	    }
	    return -1;
	}	
    }
    public static void main(String[] args){
	QuickSelect q = new QuickSelect();
	int[] a = {31,14,23,12,5,634,123,53,2,1,5,4,2,71};
	System.out.println(q.quick(a,2,0,a.length-1));
    }
}

				     