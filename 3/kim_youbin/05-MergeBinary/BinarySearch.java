public class BinarySearch{
    
    public static int rbsearch(int n, int[] L, int min, int max){
	int mid = (min + max)/2;
	if (L[mid] == n){
	    return mid;
	}
	if (max < min){
	    return -1;
	}
	if (L[mid] > n){
	    return rbsearch(n,L,min,mid-1);
	} else {
	    return rbsearch(n,L,mid + 1, max);
	}
	
    }
 
    public static int ibsearch(int n, int[] L){
	int min = 0;
	int max = L.length - 1;
	while(max > min){
	    int mid = (min + max)/2;
	    if (L[mid] == n){
		return mid;
	    }
	    if (L[mid] > n){
		max = mid - 1;
	    } else {
		min = mid + 1;
	    }
	} 
	return -1;
    }
    
    public static void main(String[] args){
	int[] a = {1,3,5,6,8,9,13,15};
	System.out.println(rbsearch(13,a,0,a.length-1));
	System.out.println(ibsearch(13,a));
	
	
    }
    
}