import java.io.*;
import java.util.*;

public class BinarySearch{
    public int rbsearch(int n,int[] L){
	int mid = L.length/2;
	if (L.length <= 1 && !(L[0]==n)){
	    return -1;
	}
	else if (n == L[mid]){
	    return mid;
	}
	else if (n < L[mid]){
	    int[] front = new int[mid];
	    for (int i = 0;i<front.length;i++){
		front[i] = L[i];
	    }
	    return rbsearch(n,front);
	}
	else if (n > L[mid]){
	    int[] back = new int[L.length-mid];
	    for (int i = 0;i<L.length-mid;i++){
		back[i] = L[i+mid];
	    }
	    return mid + rbsearch(n,back);
	}
	return -1;
    }

    public int ibsearch(int n,int[] L){
	int mid = L.length/2;
	if (L.length <= 1 && !(n == L[mid])){
	    return -1;
	}
	if (n == L[mid]){
	    return mid;
	}
	else if (n < L[mid]){
	    for (int i = 0;i<mid;i++){
		if (n == L[i]){
		    return i;
		}
	    }
	}
	else if (n > L[mid]){
	    for (int i = mid;i<L.length;i++){
		if (n == L[i]){
		    return i;
		}
	    }
	}
	return -1;
    }
}
