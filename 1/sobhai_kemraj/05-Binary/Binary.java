import java.util.*;
import java.io.*;

public class Binary{
    public int binarySearch(int n, int[] L){
	if (L[(L.length/2)] == n)
	    return L.length/2;
	else{
	    if (n < L.length/2)
		return binarySearch(n, Arrays.copyOfRange(L, 0, (L.length/2)));
	    else
		return binarySearch(n, Arrays.copyOfRange(L, (L.length/2), L.length-1));
	}
    }

    public int iterativeBinarySearch(int n, int[] L){
	boolean work = true;
	while (work){
	    if (L.length <= 1 && L[0] != n)
		work = false;
	    else if ((L[L.length/2])==n)
		return L.length/2;
	    else{
		if (n<L.length/2){
		    L = Arrays.copyOfRange(L, 0, (L.length/2));
		}
		else{
		    L = Arrays.copyOfRange(L, (L.length/2), L.length);
		}
	    }
	}
	return -1;
    }

    public static void main (String[] args){
	Binary b = new Binary();
	
	int[] a = new int[512];
	for (int i = 0; i < a.length; i ++)
	    a[i] = i*4;
	
	System.out.println(b.iterativeBinarySearch(4, a));
    }
}