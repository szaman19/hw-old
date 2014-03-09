import java.util.*;

public class Search{

    public int rbsearch(int n, int[] a){
	if(a.length < 1){
	    return -1;
	}
	else if(n == a[a.length/2]){
	    return a.length/2;
	}
	else if(n < a[a.length/2]){
	    return rbsearch(n, Arrays.copyOfRange(a, 0, a.length/2));
	}
	else{
	    int x = rbsearch(n, Arrays.copyOfRange(a, a.length/2+1, a.length));
	    if(x == -1){
		return x;
	    }
	    else{
		return a.length/2+x+1;
	    }
	}
    }
    
    public int ibsearch(int n, int[] a){
	return 0;
    }

    public static void main(String[]args){
	Search s = new Search();
	int[] a = {0,1,2,3,4,5,6,7,8,9};
	int n = 4;
	System.out.println("Searching for "+n+" in "+Arrays.toString(a));
	System.out.println("Result: "+s.rbsearch(n,a));
	n = 10;
	System.out.println("Searching for "+n+" in "+Arrays.toString(a));
	System.out.println("Result: "+s.rbsearch(n,a));
	n = 8;
	System.out.println("Searching for "+n+" in "+Arrays.toString(a));
	System.out.println("Result: "+s.rbsearch(n,a));
	n = 5;
	System.out.println("Searching for "+n+" in "+Arrays.toString(a));
	System.out.println("Result: "+s.rbsearch(n,a));
	n = 2;
	System.out.println("Searching for "+n+" in "+Arrays.toString(a));
	System.out.println("Result: "+s.rbsearch(n,a));
    }
}
