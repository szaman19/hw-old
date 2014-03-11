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
	    rbsearch(n,R);
	}
	return -1;
    }

    public int ibsearch(int n, int[]L){
	int i = L.length / 2;
	int ans = 0;
	if (L[i] == n){
	    ans = i;
	}else if(L[i] > n){
	    for(int x = i; x >= 0; x--){
		if(L[i] == n){
		    ans = x;
		}
	    }
	}else if(L[i] < n){
	    for(int x = i; x < L.length; x++){
		if(L[i] == n){
		    ans = x;
		}
	    }
}
	return ans;
    }


    public static void main(String[] arrgs){
	binSearch a = new binSearch();
	int[] test = {1,2,3,4,5,6,7,8,9,10,11,12};
	System.out.println(a.ibsearch(8,test));
}

}
