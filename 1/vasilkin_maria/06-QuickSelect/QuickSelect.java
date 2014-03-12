public class QuickSelect {
    public static int quickselect(int[] a, int k, int low, int high) {
	if (low >= high) {
	    return low;
	}
	int pind = (int)(Math.random() * a.length);
	int p = a[pind];
	int[] b= new int[a.length];
	//int[] smaller = new int[a.length];
	int loInd = low;
	int hiInd = high;
	//int[] greater = new int[a.length];
	   
	for (int value: a) {
	    if (value < p){
		b[loInd] = value;
		loInd++;
	    }
	    else if (value > p) {
		b[hiInd] = value;
		hiInd--;
	    }

	}
	//how do you place p in the right place???
	b[loInd] = p;
	for (int i: a) {
	    a[i] = b[i];
	}
	if (pind == k) {
	    return pind;
	}
	else if (pind < k) {
	    quickselect(a,k,low,pind);
	}
	else {
	    quickselect(a,k,pind,high);
	}
	
	return -1;
    }
    
    public static void main( String[] args) {
	int[] a = new int[] {7,12,4,6,8,34,63,14,1,87};
	System.out.println(a);
	quickselect(a,3,0,9);
	System.out.println(a);
    }
}
	
