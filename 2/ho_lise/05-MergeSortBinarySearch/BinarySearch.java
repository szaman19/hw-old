public class BinarySearch{

    public static int rbsearch(int n, int[]L, int l, int h){
	//Assume L is sorted
	int i = (h+l)/2;
	if (L[i]==n)
	    return i;
	else if (l==i || h==i){
	    return -1;
	}
	else if (L[i] > n)
	    return rbsearch(n, L, l,i);
	else
	    return rbsearch(n,L,i,h);
    }
    
    public static int rbsearch (int n, int[]L){
	return rbsearch(n, L, 0, L.length);
    }

    public static int ibsearch (int n, int[]L){
	int l=0;
	int h=L.length;
	int i=(h+l)/2;

	while (l!=i && h!=i){  
	    if (L[i] ==n)
		return i;
	    else if (l==h-1){
		if (L[i+1] ==n)
		    return i+1;
	    }
	    else if (L[i] > n){
		h = i;
	    }
	    else{
		l=i;
	    }
	    i=(h+l)/2;
	}
	return -1;
    }

    public static void main(String[]tests){
	int[] A = new int[7];
	A[0]=0;
	A[1]=2;
	A[2]=3;
	A[3]=44;
	A[4]=45;
	A[5]=234; 
	A[6]=23234;
	BinarySearch S = new BinarySearch();
	System.out.println(S.rbsearch(5,A));
	System.out.println(S.rbsearch(53,A));
	System.out.println(S.rbsearch(234,A));

	System.out.println(S.ibsearch(5,A));
	System.out.println(S.ibsearch(53,A));
	System.out.println(S.ibsearch(234,A));
    }
}