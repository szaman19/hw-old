import java.io.*;
import java.util.Arrays;

public class Binary {

    // recursive
    public int rbSearch(int n, int[] L) {
	int middle = L.length/2;
	if (L[middle] == n) {
	    return middle;
	}
	else if (L.length <= 1 && L[0]!= n) {
	    return -1;
	}
	else {
	    int[] temp;
	    if (n < L[middle]) {
		temp = new int[middle];
		for (int i=0; i<middle; i++) {
		    temp[i] = L[i];
		}
		return rbSearch(n,temp);
	    }
	    else {
		temp = new int[L.length - middle];
		for (int i=0; i<L.length-middle; i++) {
		    temp[i] = L[i+middle];
		}
		return rbSearch(n,temp) + middle;
	    }
	}
    }

    // iterative

    public int ibSearch(int n, int[] L) {
	int low = 0;
	int high = L.length - 1;
	while (low <= high) {
	    int middle = (low + high) / 2;
	    if (n == L[middle]) {
		return middle;
	    }
	    else if (n < L[middle]) {
		high = middle - 1;
	    }
	    else {
		low = middle + 1;
	    }
	}
	return -1;
    }


    public static void main(String[] args) {
	Binary b = new Binary();
	int[] test = {0,1,2,3,4,5,6,7,8,9};
	System.out.println(b.rbSearch(5,test));

	System.out.println(b.ibSearch(0,test));
	System.out.println(b.ibSearch(5,test));
	System.out.println(b.ibSearch(9,test));
    }


}
