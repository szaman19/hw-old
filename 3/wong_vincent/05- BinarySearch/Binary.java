import java.io.*;
import java.util.*;
public class Binary {
    
    //recursive
    public static int rbsearch(int n, int[] L) {
	if (L.length == 1) {
	    if (L[0] == n) {
		return 1;
	    }
	    else
		return -1;
	}
	else if (L[L.length/2] == n) {
	    reutrn L.length/2;
	}
	else {
	    if (L[L.length/2]>n) {
		int[] x = new int [L.length-L.length/2];
		for (int i = 0; i < x.length; i++) {
		    x[i]=L[L.length/2+i];
		}
		int w = rbsearch(n,x);
		return w;
	    }
	    else if (L[L.length/2]<=n) {
		int [] y = new int [L.length/2];
		for (int j = 0; i < y.length; j++) {
		    y[i]=L[i];
		}
		int z = rbsearch(n,y);
		return w;
	    }
	}
    }

    //iterative
    public static int ibsearch (int n, int[] L) {
	for (int i = 0; i < L.length; i++) {
	    if (L[i]==n)
		return i;
	}
	return -1;
    }
    //im pretty sure this isn't how to do this iteratively but if there is no recursion, what is the point of splitting the array in the first place?
    
}

