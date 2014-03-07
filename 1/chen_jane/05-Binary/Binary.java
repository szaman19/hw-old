import java.io.*;
import java.util.*;

public class Binary {

    // recursive
    public int rbsearch(int n, int[] L) {
	int middle = L.length / 2;
	if (L[middle] == n)
	    return middle;
	else {
	    int[] temp;
	    if (n < L[middle]) {
		temp = new int[middle];
		for (int i=0; i<middle; i++)
		    temp[i] = L[i];
	    }
	    else {
		temp = new int[L.length - middle];
		for (int i=middle; i<L.length; i++)
		    temp[i-middle] = L[i];
	    }
	    return rbsearch(n,temp);
	}
    }

    public static void main(String[] args) {
	Binary b = new Binary();
	int[] test = {1,2,3,4,5,6,7,8,9};
	System.out.println(b.rbsearch(8,test));
    }


}
