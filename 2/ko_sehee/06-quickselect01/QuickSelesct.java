import java.util.*;

public class QuickSelect{
    public int quick{ int[] a, int k, int low, int high){
	if (low >= high){
	    return a[low];
	}
	else{
	    Random r = new Random();
	    int p = r.nextInt(a.length -1);
	    int[] tmp = int[a.length];
	    for (int i = low; i <= high; i ++){
		if (a[i] > a[p]){
		    tmp[high] = a[i];
		    high= high -1;
		}
		else if (a[i] < a[p]){
		    tmp[low] = a[i];
		    low = low +1;
		}
	    }
	    a = tmp;
	    if (p - low == k){
		return a[p];
	    }
	    else if (p -low > k){
		    quick(a, k, low, p);
		}
	    else if(p-low < k){
		quick(a,k, p, high);
	    }
	}
    }
}

				     