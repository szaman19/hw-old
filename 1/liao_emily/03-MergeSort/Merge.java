public class Merge{

    public int[] merge( int[] A, int[] B ) {
	int[] ans = new int[A.length + B.length];
	int ctr1 = 0;
	int ctr2 = 0;
	for ( int x = 0; x < ans.length; x++ )
	    if ( A[ctr1] < B[ctr2] ) {
		ans[x] = A[ctr1];
		if ( ctr1 < A.length - 1 )
		    ctr1++;
	    }
	    else if ( A[ctr1] > B[ctr2] ) {
		ans[x] = B[ctr2];
		if ( ctr2 < B.length - 1 )
		    ctr2++;
	    }
	return ans;
	}

    public static void main (String[] args) {
	Merge m = new Merge();
	int[] A = new int[3];
	A[0] = 5;
	A[1] = 9;
	A[2] = 15;
	int[] B = new int[4];
	B[0] = 3;
	B[1] = 10;
	B[2] = 13;
	B[3] = 18;
	System.out.println(m.merge( A, B));
    }

}
