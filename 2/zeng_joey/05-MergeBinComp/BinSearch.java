public class BinSearch{
    
    public static int rbSearch(int n, int[] L){
	if(L.length == 0)
	    return -1;
	else if(L[L.length/2] == n){
	    return L.length/2;
	}
	else if(L[L.length/2] > n){
	    int[] A = new int[L.length/2];
	    for(int i = 0; i< L.length/2;i++){
		A[i] = L[i];
	    }
	    
	    return rbSearch(n, A);
	}
	
	else{
	    int[] A = new int[L-L.length/2];
	    for(int i = L.length/2 + 1; i < L.length; i++){
		A[i-L.length/2-1] = L[i];
	    }
	    return rbSearch(n, L);
	}
    }
}