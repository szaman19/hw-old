import java.util.Arrays;

public class BinSearch{
    
    public static int rbSearch(int n, int[] L, int i){
	
	if(L.length == 0)
	    return -1;
	else if(L[L.length/2] == n){
	    return L.length/2;
	}
	else if(L[L.length/2] < n){
	    
	    return rbSearch(n, Arrays.copyOfRange(L, L.length/2 + 1, L.length));
	}
	
	else{
	    return rbSearch(n, Arrays.copyOfRange(L, 0, L.length/2));
	}
    }
    
    
    public static void main(String[] args){
	
	int[] A = {1,2,3,5,7,9,12,16,122};
	System.out.println(rbSearch(5, A));
    }
}
