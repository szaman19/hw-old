import java.util.*;

public class QuickSelect{

    public int quickselect(int[] a, int k, int low, int high){
	if(low >= high){
	    return a[high];
	}
	else{
	    Random r = new Random();
	    int p = r.nextInt(a.length-1);
	    int[] b = new int[a.length];
	    int b1 = low;
	    int b2 = high;
	    for(int i = low; i<high; i++){
		if(a[i] < a[p]){
		    b[b1] = a[i];
		    b1++;
		}
		else if(a[i] > a[p]){
		    b[b2] = a[i];
		    b2--;
		}
		else{
		    b[b1] = a[p];
		}
	    }
	    if(b1 == k){
		return b[k];
	    }
	    else if(b1 < k){
		return quickselect(b,k,b2,high);
	    }
	    else{
		return quickselect(b,k,low,b1);
	    }
	}
    }

    public static void main(String[]args){
	int[] a = {10,3,9,7,14,2,5,6,13,12,1,8,11};
	QuickSelect qs = new QuickSelect();
	System.out.println(Arrays.toString(a)+"\n4th term: (should be 6)");
	System.out.println(qs.quickselect(a,4,0,a.length-1));
    }
}
