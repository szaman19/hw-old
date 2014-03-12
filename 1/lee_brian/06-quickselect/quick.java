  import java.util.*;
  
  public class quick{
  
      public int quickselect(int[] a, int k, int low, int high){
  	Random r = new Random();
  	if (low >= high){
  	    return high;
  	}
  	else{
  	    int pivot = r.nextInt(high + 1) + low;
  	    int[] copy = new int[a.length];
  	    int high2 = high;
  	    int low2 = low;
  	    for (int i = low; i < high + 1; i++){
  		if (i == pivot){
  		}
  		else if(a[i] >= a[pivot]){
  		    copy[high2] = a[i];
  		    high2--;
  		}
  		else if(a[i] < a[pivot]){
  		    copy[low2] = a[i];
  		    low2++;
  		}
  	    }
  	    copy[high2] = a[pivot];
  	    high2 = pivot;
  	    if (high2 == k){
  		return copy[high2];
  	    }
  	    else if(high2 < k){
  		return quickselect(copy, k, high2, high);
  	    }
  	    else if(high 2 > k){
  		return quickselect(copy, k, low, high2 - 1);
  	    }
  	}
      }
  }
  		
  		
