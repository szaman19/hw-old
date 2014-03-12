public class binSearch{
    int counter = 0;
    public int rbsearch(int n, int[] L){
	int i = L.length / 2;
	if(L.length == 1){
	    return counter;
	}else if(L[i] == n){
	    return i;
	}else if(L[i] > n ){
	    int[] R = new int[i];
	    for (int c = 0; c<i; c++){
		R[c] = L[c];}
	    rbsearch(n,R);
	}else if (L[i] < n){
	    int x = 0;
	    int[] R = new int[i];
	    for (int c = i + 1; c<L.length; c++){
		R[x] = L[c];
		x++;}
	    rbsearch(n,R)
	}else{
	    return -1;
	}


}


}