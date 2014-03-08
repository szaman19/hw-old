public class BinarySearch{

    public static int rbsearch(int n, int[]L, int l, int h){
	//Assume L is sorted
	int i = (h+l)/2;
	System.out.println(i + " " + L[i]);
	if (L[i]==n)
	    return i;
	else if (l==i){
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

    public static void main(String[]tests){
	int[] A = new int[6];
	A[0]=0;
	A[1]=2;
	A[2]=3;
	A[3]=44;
	A[4]=53;
	A[5]=234; 
	BinarySearch S = new BinarySearch();
	System.out.println(S.rbsearch(5,A));
	System.out.println(S.rbsearch(53,A));
	System.out.println(S.rbsearch(234,A));
    }
}