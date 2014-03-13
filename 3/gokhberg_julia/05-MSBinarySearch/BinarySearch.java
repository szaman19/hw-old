import java.util.*;
import java.io.*;

public class BinarySearch{
    
    public static int rbsearch (int n, int[] L, int low, int high){
	if (low > high){
	    return -1;
	}else{
	    //Avg of the list?
	    int pos = (low + high)/2;
	    if (L[pos] == n){
		return pos;
	    }else if (L[pos] < n){
		return rbsearch(n, L, pos+1, high);
	    }else{
		return rbsearch(n, L, low, pos-1);
	    }
	}
    }

    public static int ibsearch(int n, int[]L){
	int pos = 0;
	int low = 0;
	int high = L.length-1;
	while (high >= low){
	    //I didn't understand why the pos would have to be instantiated here
	    //but because we're looping, it has to keep changing. I get it! Yay!
	    pos = (low + high)/2;
	    if (L[pos] == n){
		return pos;
	    }else if (L[pos] < n){
		low = pos + 1;
	    }else{
		high = pos - 1;
	    }
	}
	return -1;
    }

    public static int rbsearch (int n, int[] L){
	return rbsearch (n, L, 0, L.length-1);
    }

    public static void main(String[] args){
	int[] L = new int[1337];
	for(int x = 0; x < 1337; x ++){
	    L[x] = x;
	}
	//I now realize its a hassle to write out the low and high for the
	//rbsearch
	System.out.println(rbsearch(999, L));
	System.out.println(ibsearch(650, L));
    }

}
			   
			   
