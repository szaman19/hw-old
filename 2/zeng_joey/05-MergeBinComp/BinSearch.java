import java.util.Arrays;

public class BinSearch{
    
    public static int rbSearch(int n, int[] L){
	if(L.length == 0){
	    return -1;
	}
	else if(L[L.length/2] == n){
	    return L.length/2;
	}
	else if(L[L.length/2] < n){
	    int a = rbSearch(n, Arrays.copyOfRange(L, L.length/2 + 1, L.length));
	    if (a == -1)
		return -1;
	    else
		return L.length/2+1 + a;
	}
	
	else{
	    return rbSearch(n, Arrays.copyOfRange(L, 0, L.length/2));
	}
    }


    public static int ibSearch(int n, int[]L){
	int a = 0;
	int b = L.length;
	while(a<b){
	    if(L[(a+b)/2] == n)
		return (a+b)/2;
	    else if (L[(a+b)/2] < n)
		a = (a+b)/2+1;
	    else
		b = (a+b)/2;
	}
	return -1;
    }

	    
    public static void main(String[] args){
	
	int[] A = {1,2,3,5,7,9,12,16,122};
	System.out.println(rbSearch(15, A));
	System.out.println(rbSearch(1, A));
	System.out.println(rbSearch(2, A));
	System.out.println(rbSearch(3, A));
	System.out.println(rbSearch(5, A));
	System.out.println(rbSearch(7, A));
	System.out.println(rbSearch(9, A));
	System.out.println(rbSearch(12, A));
	System.out.println(rbSearch(16, A));
	System.out.println(rbSearch(122, A));
    }
}
