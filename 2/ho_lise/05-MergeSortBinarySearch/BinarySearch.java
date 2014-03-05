public class BinarySearch{

    public static int rbsearch(int n, int[]L, int l, int h){
	//Assume L is sorted
	int i = (h+l)/2;
	if (L[i]==n){
	    return i;
	}
	else if (L[i] < n){
	    rbsearch(n, L, l,i);
	}
	else{
	    rbsearch(n,L,i,h);
	}
	if (l==h)
	    return -1;

    }
    
    public static int rbsearch (int n, int[]L){
	rbsearch(n, L, 0, L.size()-1);
    }

}

}