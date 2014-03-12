import java.util.Arrays;
public class BinarySearch{
    
    //recursive binary search
    //fixed recursive error, trouble was with the value of 'middle'
    public static int searcher(int n, int[] L, int lo, int hi){
	if((hi == 0)||(L.length==0)||(lo<0)){
	    return -1;
	}
	int middle = (lo+hi) / 2 ;
	if(L[middle] ==  n){
	    return middle;
	}
	if(L[middle] < n){
	    return searcher(n,L,middle,hi);
	}else{
	    return searcher(n,L,lo,middle);
	}
    }
    
    
    public static int rbsearch(int n, int[] L){
	return searcher(n,L,0,L.length);
    }

    //iterative binary search
    //my algorithm works for the first 3/4 of the list but will go out of bounds for the remaining end of the list
    public static int ibsearch(int n, int[] L){
	if(L.length==0){
	    return -1;
	}
	int middle = L.length / 2;
	while(!(L[middle]==n)){
	    if(L[middle]<n){
		middle+= (middle / 2);
	    }else if(L[middle] > n){
		middle = (middle / 2);
	    }
	}
	    
	return middle;
    }

    public static void main(String[]args){
	int[] a = {1,5,7,12,41,67,235,573,821,4102} ;
	int[] b = {34,8,656,2,1,7,6,823,7,243,835,23} ;

	System.out.println("rbsearch\n");
	System.out.println(rbsearch(1,a));
	System.out.println(rbsearch(5,a));
	System.out.println(rbsearch(7,a));
	System.out.println(rbsearch(12,a));
	System.out.println(rbsearch(41,a));
	System.out.println(rbsearch(67,a));
	System.out.println(rbsearch(235,a));
	System.out.println(rbsearch(573,a));
	System.out.println(rbsearch(821,a));
	System.out.println(rbsearch(4102,a));
	System.out.println("ibsearch\n");
	System.out.println(ibsearch(1,a));
	System.out.println(ibsearch(5,a));
	System.out.println(ibsearch(7,a));
	System.out.println(ibsearch(12,a));
	System.out.println(ibsearch(41,a));
	System.out.println(ibsearch(67,a));
	System.out.println(ibsearch(235,a));
	System.out.println(ibsearch(573,a));
	System.out.println(ibsearch(821,a));
	System.out.println(ibsearch(4102,a));
	

    }    
}
