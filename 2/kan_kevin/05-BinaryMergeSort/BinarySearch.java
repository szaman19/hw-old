import java.io.*;
import java.util.*;

public class BinarySearch{
    public int rbSearch(int[] A, int val){
	return rbSearch(A, val, 0, A.length-1);
    }
    public int rbSearch(int[] A, int val, int low, int high){
	int middle = (high+low)/2;
	if (low>high)
	    return -1;
	if (A[middle] == val)
	    return middle;
	else if (A[middle] > val)
	    return rbSearch(A, val, low, middle-1);
	else if (A[middle] < val)
	    return rbSearch(A, val, middle+1, high);
	return -1;
    }
    public int ibSearch(int[] A, int val){
	int low = 0, high = A.length-1;
	while (low <= high){
	    int middle = (low+high)/2;
	    if (A[middle] == val)
		return middle;
	    else if (A[middle] > val)
		high = middle - 1;
	    else
		low = middle + 1;
	}
	return -1;
    }


    public static void main(String[] args){
	BinarySearch b = new BinarySearch();
	int[] test = new int[]{1,3,4,6,7,9,10,12,13,15,16};
	for (int i = 0; i< test.length; i++){
	    System.out.print(test[i] + " ");
	}
	System.out.println();
	System.out.println(b.rbSearch(test, 7));
	System.out.println(b.rbSearch(test, 5));
	System.out.println(b.ibSearch(test, 7));
	System.out.println(b.ibSearch(test, 5));
    }
}
