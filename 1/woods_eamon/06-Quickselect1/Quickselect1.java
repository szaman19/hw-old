import java.util.*;
public class Quickselect1{
    private static int[]a;

    public static int quickselect(int[]a, int k, int low, int high){
	int p;
	int c = 0;
	int[]copy;
	if (low >= high){
	    return high;
	} else {
	    p = a[(int)(Math.random() * (high + 1) + low)];
	    copy = new int[a.length];
	    for (int i = 0; i < a.length; i++){
		if (a[i] < p){
		    copy[i] = a[i];
		}
	    }
	    for (int h = 0; h < copy.length; h++){
		if (copy[h] != 0){
		    c = h;
		}
	    }
	    copy[c] = p;
	    c++;
	    for (int j = 0; j < a.length; j++){
		if (a[j] > p){
		    copy[c] = a[j];
		    c++;
		}
	    }
	    a = copy;
	    if ( (Arrays.binarySearch(a,p)) == k){
		return p; 
	    } else {
		if ( (Arrays.binarySearch(a,p)) > k){
		    high = Arrays.binarySearch(a,p);
		} else {
		    low = Arrays.binarySearch(a,p);
		}
		return quickselect(a,k,low,high);
	    }
	}
    }


    public static void main(String[]args){
	int[]a = {2,3,6,434,35,454,33,23,423,34};
	System.out.println(quickselect(a,5,0,9));
    }
}
