public class BinarySearch{


    private int a = L.length/2;
    private int negtemp = L.length/2;
    private int postemp = L.length/2;

    public rbsearch (int n, int[] L){
	if (L[a]==n){
	    return a;
	}
	else if (L[a] < n){
	    postemp = postemp/2;//work out temp
	    a = a/2;
	}
	else if (L[a] > n){
	    negtemp = negtemp/2//work out temp
	    a = a + negtemp