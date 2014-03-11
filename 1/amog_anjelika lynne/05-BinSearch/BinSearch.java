import java.io.*;
import java.util.*;

public class BinSearch{
    public int rbsearch (int n, int[] L){
	int i = L.length / 2;
	if (L[i] == n)
	    return i;
	else if (L[i] < n){
	    int[] a = new int[i];
	    for (int ia = 0; ia < i; ia++){
		a[ia] = L[ia];
	    }
	    rbsearch(n,a);
	}
	else if (L[i] > n){
	    int[] a = new int[L.length - i];
	    for (int ia = 0; ia < L.length - i; ia++){
		a[ia] = L[i + ia];
	    }
	    rbsearch(n,a);
	}
	return -1;
    }

    public int ibsearch (int n, int[] L){
	int i = L.length / 2;
	while (i > 0){
	    if (L[i] == n)
		return i;
	    else if (L[i] < n){
		int[] a = new int[i];
		for (int ia = 0; ia < i; ia++){
		    a[ia] = L[ia];
		}
		i = a.length;
	    }
	    else if (L[i] > n){
		int[] a = new int[L.length - i];
		for (int ia = 0; ia < L.length - i; ia++){
		    a[ia] = L[i + ia];
		}
		i = a.length;
	    }	
	}
	return -1;
    }
}
