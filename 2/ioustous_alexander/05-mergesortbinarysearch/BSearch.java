import java.util.*;
import java.io.*;

public class BSearch {

    public static  int rbsearch (int n, int[] L, int low, int high){
	if (high-low <= 0){
	    if (L[high] == n){
		return high;
	    }else{
		return -1;
	    }
	}
	if (L[(high-low+1)/2] == n){
	    return (int)Math.round((high-low+1)/2);
	}
	if (L[(high-low+1)/2] < n){
	    return rbsearch (n, L, (int)Math.round((high-low+1)/2), high);
	} else {
	    return rbsearch (n, L, low, (int)Math.round((high-low+1)/2));
	}
    }

    public static int ibsearch (int n, int [] L){
        int low = 0;
	int high = L.length -1;
	for (int i =0; (high - low) > 0;){
	    if (L[(high-low+1)/2] == n){
		return (int)Math.round((high-low+1)/2);
	    }		
	    if (L[(high-low+1)/2] < n){
		low = (int)Math.round((high-low+1)/2);
	    }else{
		high = (int)Math.round((high-low+1)/2);
	    }
	}
	if (L[high] == n){
	    return high;
	}
	return -1;
    }



    public static void main (String []args){
	int[] a = {1,2,3,4,5,6,7};
	System.out.println (rbsearch(2, a, 0, a.length-1));
	System.out.println (ibsearch(2, a));
	System.out.println (rbsearch(4, a, 0, a.length-1));
	System.out.println (ibsearch(4, a));
	
	
	//	System.out.println (rbsearch(8, a, 0, a.length-1));
	//	System.out.println (ibsearch(8, a));
    }
}
       
     
