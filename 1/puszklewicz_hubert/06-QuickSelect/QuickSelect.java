import java.util.*;

public class QuickSelect{
    
    public static int quickSelect(int[] a, int k, int low, int high){
	if(low >= high){
	    return a[high];
	}else{
	    Random r = new Random();
	    int pivot = r.nextInt(a.length-1);
	    System.out.println("Pivot: " + a[pivot]);
	    int[] newa = new int[a.length];
	    int f = low; //index for side < pivot
	    int g = high;  //index for side > pivot
	    for(int i = low; i < high; i++){
		if(a[i] < a[pivot]){
		    newa[f] = a[i];
		    f++;
		    System.out.println(Arrays.toString(newa) +
				       " Low Index: " + f + 
				       " High Index: " + g );
		}else{
		    newa[g] = a[i];
		    g--;
		    System.out.println(Arrays.toString(newa) +
				       " Low Index: " + f + 
				       " High Index: " + g );
		}
	    }
	    for(int i = pivot; i <= high; i++){
		if(a[i] > a[pivot]){
		    newa[g] = a[i];
		    g--;
		    System.out.println(Arrays.toString(newa) + 
				       " Low Index: " + f + 
				       " High Index: " + g);
		}else{
		    newa[f] = a[i];
		    f++;
		    System.out.println(Arrays.toString(newa) +
				       " Low Index: " + f + 
				       " High Index: " + g );
		}
	    }
	    if(f == k){
		return newa[f];
	    }
	    else if(newa[f] > k){
		high = f;
	    }else{
		low = f;
	    }
	    return quickSelect(newa, k, low, high);
	}
    }

    public static void main(String[]args){
	int[] test = {1,2,3,4,5,6,7,8,9};
	System.out.println(quickSelect(test, 14, 0, 8));
    }

}
	
