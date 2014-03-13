public class quickselect {
 
    
    public static void print(int[] a) {
	for (int i: a) {
	    System.out.print(i + ", ");
	}
	System.out.println();
    }
    

    public int quickselect (int []a, int k, int lo, int high) {
	if (lo >= high)
	    return a[high];
	else {
	    int p = (int) (Math.random() * ((high  + lo)/2));
	System.out.println (p);
	int hi = high;
	int low = lo;
	//int j;
	int [] b = new int [a.length];
	for (int i = low; i <= p; i++) {
	   
	    if (a[i] < a[p]){
		b[low] = a[i];
		low++;
	    }
	    if (a[i] >= a[p] ) {
		b[hi] = a[i];
		hi--;
	    }}
	for (int i = p + 1; i <= high; i++) {
	   
	    if (a[i] <= a[p]){
		b[low] = a[i];
		low++;
	    }
	    if (a[i] > a[p] ) {
		b[hi] = a[i];
		hi--;
	    }}
	b[hi] = a[p];
	
	print(b);
	
	if (low == k)
	    return b[low];
	if (b[low] > k) 
	    return  quickselect (b, k, lo, low);

	else
	    return   quickselect (b, k,low , high);
	}
	
    }
    public static void main (String [] args) {
	int [] foo = {5,8,9,2,3,4,1,7,6,0};
	quickselect yoo = new quickselect();
	System.out.println (yoo.quickselect(foo, 5,0,9));


    }
}

/* Exception errors. Seems to be able to sort them around a partition, but sometimes just stops. Worked on this for two and a half hours and I'm confused now. */