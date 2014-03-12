public class BinarySearches{
    private static int rbsearch(int[] sorted, int targ){
        int value = 0;
        if(sorted.length == 1){
            if(sorted[0] == targ){
                return value;
            }
            return -1;
        } else {
            int[] x = new int[0];
            if(targ< sorted[sorted.length/2]){
                x = new int[sorted.length/2];
                for(int y = 0;y<x.length;y++){
                    x[y] = sorted[y];
                }
            } else {
                x = new int[sorted.length-sorted.length/2];
                for(int y = 0;y<x.length;y++){
                    x[y] = sorted[sorted.length/2+y];
                }
                value += sorted.length/2;
            }
            return rbsearch(x, targ);
        }
    }
    private static int ibsearch(int[] sorted, int targ){
	int startVal = 0;
	int endVal = sorted.length;
	while(endVal-startVal > 1){
	    if(targ < sorted[startVal + ((endVal-startVal)/2)]){
		endVal = startVal + ((endVal-startVal)/2);
	    }
	    if(targ >= sorted[startVal + ((endVal-startVal)/2)]){
		startVal = startVal + ((endVal-startVal)/2);
	    }
	}
	if(targ == sorted[startVal]){
	    return startVal;
	}
	return -1;
    }
}
