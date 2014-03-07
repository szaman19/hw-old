public class Search{
    public int ibsearch(int d,int[] L){
	int mid = L.length/2;
	int inc = 0;
	if (L[mid] == d){
	    return mid;
	}
	else if(L[mid]>d){
	    inc = 1;
	}
	else {
	    inc = -1;
	}
	for (;mid>=0 && mid<L.length;mid = mid + inc){
	    if (L[mid]== d){
		return mid;}
	}
	return -1;
    }
    public int recursiveSearch(int d,int[]L,int place){
	
	if (L[L.length/2] == d){
	    
	    return place;
	}
	else if(L[L.length/2] >d){
	    
	   
	    int[]now = new int[L.length - (L.length/2)];
	    for(int t = (L.length/2)+1;t<L.length;t++){
		now[t-(L.length/2)]= L[t];
	    }
	     place += now.length/2;
	    return recursiveSearch(d,now,place);
	}
	
	else if (L[L.length/2] < d){
		int[]now = new int[L.length-L.length/2];
		for(int t = 0;t<L.length/2;t++){
		    now[t]= L[t];
		}
		place -= now.length/2;
		return recursiveSearch(d,now,place);
	    }
	else {
	    return -1;
	}
    }
	
		
    public int rbsearch( int d,int[] L){
	return recursiveSearch(d,L,L.length/2);
    }
}
	