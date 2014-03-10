import java.util.Arrays;
public class Binary{

    public Binary(){}

    public int rBinary(int n, int[] L, int x){
	if (L.length == 1 && L[0] != n)
	    return -1;
	int mid = L.length / 2;
	int a;
	if(L[mid] == n)
	    return x + mid;
	else if(L[mid] > n){
	    a = rBinary(n, Arrays.copyOfRange(L, 0, mid), x);
	    if (a == -1)
		return a;
	    return x + a;
	}
	else{
	    x += mid;
	    a = rBinary(n, Arrays.copyOfRange(L, mid, L.length), x);
	    if (a == -1)
		return a;
	    return x + a;
	}
    }

    public int rbsearch(int n, int[]L){
	return rBinary(n, L, 0);
    }
}
