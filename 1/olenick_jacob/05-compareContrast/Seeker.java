import java.io.*;
import java.util.*;

public class Seeker{

    public int rbsearch(int n, int[] L, int place, int range){
	int l = 0;
	int r = 0;
	if (range <= 0 || range >= L.length){
	    r = (L.length-1);
	}
	else{
	    r = range;
	}	
	if (place <= 0 || place >= L.length){
	    l = (L.length-1)/2;
	}
	else{
	    l = place;
	}	

	if (L[l] == n){
	    return l;
	}
	else if (r/2 != 0){
	    if (L[l] < n){
		r = r/2;
		rbsearch(n,L,l+(r/2),r);
	    }
	    else{
		r = r/2;
		rbsearch(n,L,l-(r/2),r);
	    }
	}
	return -1;
    }
    
    public int ibsearch(int n, int[] L){
	int i = (L.length-1)/2;
	int r = L.length;
	boolean found = false;
	while (!found && (r/2 != 0)){
	    if (L[i] == n){
		found = true;
		return i;
	    }
	    else if (L[i] > n){
		r = r/2;
		i = i-r/2;
	    }
	    else{
		r = r/2;
		i = i+r/2;
	    }
	}
	return -1;	
    }
}