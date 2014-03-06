public class BinarySearch {
    
    public int rbsearch(int n, int[] L) {
    		int mp = L.length / 2;
    		if ( L[mp] == n )
    			return mp;
    		
    		else if ( L[mp] != n && L.length == 1)
    			return -1;
    		
    		else if ( L[mp] > n ) { 
    			int[] L2 = new int[mp];
	    		for int ( i=0; i<mp; i++ ) 
	    			L2[i] = L[i];
	    		return rbsearch(n,L2);
    		}
    		else {
	    		int[] L2 = new int[L.length - (mp+1)];
	    		for int ( i=mp+1; i<L.length; i++ ) 
	    			L2[i-(mp+1)] = L[i];
	    		return rbsearch(n,L2);
    		}
    }
    
    	public int ibsearch( int n, int[] L)
