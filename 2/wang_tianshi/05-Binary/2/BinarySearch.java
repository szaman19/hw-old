import java.io.*;
import java.util.*;

public class BinarySearch{
    
    public int rbsearch(int n, int[] L, int low, int high){
	if (low>high)
	    return -1;
	if (L[(low+high)/2]==n)
	    return (low+high)/2;
	else if (L[(low+high)/2]<n)
	    return rbsearch(n, L, (low+high)/2+1, high);
	else if (L[(low+high)/2]>n)
	    return rbsearch(n, L, low, (low+high)/2-1);
	return -1;
    }

    public int ibsearch(int n, int[] L){
	int high = L.length-1;
	int low =0;
	while (low <= high){
	    if (L[(high+low)/2] == n)
		return (high+low)/2;
	    else if (L[(high+low)/2]>n)
		high = (high+low)/2-1;
	    else if (L[(high+low)/2]<n)
		low = (high+low)/2+1;
	}
	return -1;
    }


    public static void main (String[] args){
	BinarySearch bs = new BinarySearch();
	merge m = new merge();
	int[] list = {1,3,4,15,20,23,45,68,90,504};
	
	System.out.println(bs.rbsearch(68,list,0,list.length-1));
	System.out.println(bs.rbsearch(3,list,0,list.length-1));
	System.out.println(bs.rbsearch(3,list,0,list.length-1));
	System.out.println(bs.rbsearch(90,list,0,list.length-1));
	System.out.println(bs.rbsearch(2,list,0,list.length-1));

	System.out.println(bs.ibsearch(68,list));
	System.out.println(bs.ibsearch(3,list));
	System.out.println(bs.ibsearch(3,list));
	System.out.println(bs.ibsearch(90,list));
	System.out.println(bs.ibsearch(2,list));
    }
}
    
