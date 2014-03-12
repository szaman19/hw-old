

public class binsearch {
    // Idea from Norman to just do binary seach using comparable, which he did with mergesort and so it worked for everything, and he didn't have to rewrite.
    //  public static int binsearchint(Comparable[] x, Comparable y) {
    //	return binsearchint(x,y,0,x.length-1);
    // }

    public static int binsearchrecursive(Comparable[] x, Comparable y, int low, int high) {
	
	int spot = ((low + high)/2);
	if (x[spot].compareTo(y) < 0) {
	    return binsearchrecursive(x,y,spot+1,high);//range = spot to high
	}
	else if (x[spot].compareTo(y) > 0) {
	    return binsearchrecursive(x,y,low,spot-1);//range = low to spot
	}
	else if (x[spot].equals(y)) {
	    return spot;//found!
	}
	else {
	    return -1; //not extant
	}
    }
    public static int binsearchiterative(Comparable[] x, Comparable y, int low, int high) {
	int spot = ((high+low)/2);
	while ((! x[spot].equals(y)) && (low <= high)) {
	    if (x[spot].compareTo(y) < 0) {
		low = spot+1;
	    }
	    else if (x[spot].compareTo(y) >= 0) {
		high = spot-1;
	    }
	}

	if (low <= high) {
	    return spot;
	}
	else {
	    return -1;
	}
    }
}
		
