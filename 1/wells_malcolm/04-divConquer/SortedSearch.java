import java.util.*;
public class SortedSearch{
    private static int search(int[] sorted, int targ){
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
	    return search(x, targ);
	}
    }    
}