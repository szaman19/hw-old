//Johnathan Yan
//Period 1

public class Binary{

	//didn't know how to do without adding extra parameters
	public static int rbsearch( int[] a, int target, int lo, int hi ) {
		if (lo > hi)
			return - 1;
		else if (a[(lo + hi) / 2] == target)
			return (lo + hi) / 2;
		else if (a[(lo + hi) / 2] > target)
			return rbsearch(a, target, lo, ((lo + hi) - 1));
		else if (a[(lo + hi) / 2] < target)
			return rbsearch(a, target, (((lo + hi) / 2) + 1), hi);
		return -1;
	}
	
	
    public static int ibsearch( int[] a, int target, int lo, int hi ) {
		while (lo <= hi){
			if (a[(lo + hi) / 2] == target)
				return (lo + hi) / 2;
			else if (a[(lo + hi) / 2] > target)
				hi = (lo + hi) - 1;
			else if (a[(lo + hi) / 2] < target)
				lo = ((lo + hi) / 2) + 1;
			}
		return -1;
	}	
	
    public static void main(String[] args){
	int[] L = {0,1,2,3,4,5,6,7};
	int[] X = {0,1,2,3,4,5,6,7};
	System.out.println(rbsearch(L, 0, 0, L.length - 1));
	System.out.println(ibsearch(L, 0, 0, L.length - 1));
	System.out.println(rbsearch(X, 7, 0, X.length - 1));
	System.out.println(ibsearch(X, 7, 0, X.length - 1));
    }
	
}
	    
		  
		
    