import java.util.Arrays;

public class bsearch{
   
    public static int rbsearch(int n, int[] L){
	int count = L.length / 2;
	int index = -1;
	int[] storage = new int[count];
	if (L[count] == n){
	    index = count;
	}
	else if
	    (n > L[count]){
		storage = Arrays.copyOfRange(L,count, L.length);
		index = rbsearch(n, storage);
		count = storage.length / 2;
	    }
	else if 
	    (n < L[count]){
		storage = Arrays.copyOfRange(L,0,count);
		index = rbsearch (n, storage);
		count = storage.length / 2;
	    }
	return index;
    }

    public static void main(String[]args){
	int[] X = {14, 32, 67, 76, 23, 41, 58, 85};
	rbsearch(67,X);
}
}
	    