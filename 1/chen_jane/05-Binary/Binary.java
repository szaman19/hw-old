import java.io.*;
import java.util.Arrays;

public class Binary {

    // recursive

    public int rbSearch(int n, int[] L) {
	int middle = L.length/2;
	if (L[middle] == n) {
	    return middle;
	}
	else {
	    int[] temp;
	    if (n < L[middle]) {
		temp = new int[middle];
		for (int i=0; i<middle; i++) {
		    temp[i] = L[i];
		}
	    }
	    else {
		temp = new int[L.length - middle - 1];
		for (int i=middle+1; i<L.length; i++) {
		    temp[i-middle-1] = L[i];
		}
	    }
	    // to prevent error if n is not in array L
	    try{
		return rbSearch(n,temp);
	    } catch (Exception e) {
		return -1;
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
