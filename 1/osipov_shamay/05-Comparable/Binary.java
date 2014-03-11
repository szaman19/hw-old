public class Binary{

    public int rbsearch(int n, int[] L,int beg, int end){
	int middle = (end-beg) / 2;
 	if(L[middle] == n){
	    return middle;
	}else if(L[middle] > n){
	    return rbsearch(n,L,middle,end);
	}else if(L[middle] < n){
	    return rbsearch(n,L,beg,middle);
	}else{
	    return -1;
	}
    }      

    public int ibsearch(int n, int[] L){
	int beg = 0;
	int end = L.length - 1;
	int middle = (end-beg) / 2;
	while(end != middle && beg != middle){
	    if(L[middle] == n){
		return middle;
	    }else if(L[middle] > n){
		beg = middle;
		middle = (end-beg) / 2;
	    }else{
		end = middle;
		middle = (end-beg) / 2;
	    }
	}
	return -1;
    }
}
