import java.util.*;

//Sometimes it gives an answer and sometimes it gives an IndexOutOfBounds error.
//The answers that it gives varies and non of them are correct.

public class QuickSelect {

    public static int quickselect(int[] a, int k, int low, int high) {
	int in;
	if(low >= high) {
	    return a[low];
	}
	else {
	    in = (int)(Math.random()*(high-low))+low;
	    int p = a[in];
	    int[] l = new int[a.length];
	    l[in] = p;
	    int n = 0;
	    int m = in + 1;
	    for(int x = 0; x < a.length; x++) {
		if(a[x] < p) {
		    l[n] = a[x];
		    n++;
		}
		else if(a[x] > p){
		    l[m] = a[x];
		    m++;
		}
	    }
	    if(l[in] == k) {
		return in;
	    }
	    else {
		if(l[in] < k) {
		    return quickselect(a, k, low, in-1);
		}
		else {
		    return quickselect(a, k, in+1, high);
		}
	    }
	}
    }

    public static void main(String[] args) {
	int[] a = {7, 8, 2, 5, 0, 9, 13, 35, 6, 3, 24, 1};
	System.out.println(quickselect(a, 4, 0, a.length-1));
    }

}

