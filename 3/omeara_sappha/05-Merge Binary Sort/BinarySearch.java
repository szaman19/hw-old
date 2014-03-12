import java.util.*;

public class BinarySearch{

    public int rbsearch(int[] L, int n, int lower, int upper){
	if (L.length == 1 && L[0] == n)
	    return 0;
	else if (L.length == 1)
	    return -1;
	int x = L.length / 2;
	if (L[x] == n)
	    return x;
	else if (L[x] < n){
	    return rbsearch(L, n, lower, x);
	}
	else{
	    return rbsearch(L, n, x, upper);
	}
    }

    public int ibsearch(int[] L, int n){
	int lower = 0;
	int upper = L.length;
        while (lower <= upper){
	    int x = (lower + upper) / 2;
	    if (L[x] == n)
		return x;
	    else if (L[x] < n){
		lower = x;
	    }
	    else{
		upper = x;
	    }
	}
	return -1;
    }
    
    public static void main(String[] args){

	BinarySearch b = new BinarySearch();
	int[] A = new int[10000];
	for (int i = 0; i < A.length; i ++){
	    A[i] = i;
	}
	System.out.println(b.ibsearch(A, 345));
	
    }
}
