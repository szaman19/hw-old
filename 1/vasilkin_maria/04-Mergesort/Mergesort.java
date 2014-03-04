class Mergesort {
    public static int[] mergesort(int[] c) {
	if (c.length == 1) {
	    return c;
	}
	else if (c.length == 2) {
	    if (c[0] >= c[1]) {
		int x = c[0];
		c[0] = c[1];
		c[1] = x;
	    }
	    return c;
	}	
	else {
	    int[] a = new int[c.length/2];
	    for (int i = 0; i < a.length; i++) {
		a[i] = c[i];
	    }

	    int[] b = new int[c.length - a.length];
	    for (int i = 0; i < b.length; i++) {
		b[i] = c[a.length + i];
	    }
	    
	    a = mergesort(a);
	    b = mergesort(b);
	    c = merge(a,b);
	    return c;
	}
    }
    public static int[] merge(int[] a, int[] b) {
	int merge[] = new int[a.length+b.length];
	System.out.println(merge);
	int indexa = 0;
	int indexb = 0;
	int indexm = 0;
	while (indexm < (a.length + b.length))  {//JY's
	if (a.length <= indexa) {
	    for (int j = indexb;j < b.length; j++) {
		merge[indexm] = b[j];
		indexm ++;
		//System.out.println(merge);
	    }
	}
	else if (b.length <= indexb) {
	    for (int i = indexa; i <a.length; i++) {
		merge[indexm] = a[indexa];
		//indexm ++;
		//System.out.println(merge);
	    }
	}
	else if (a[indexa] < b[indexb]) {
	    merge[indexm] = a[indexa];
	    indexa ++;
	    //indexm ++;
	    //System.out.println(merge);
	}
	else{
	    merge[indexm] = b[indexb];
	    indexb ++;
	    //indexm ++;
	    //System.out.println(merge);
	} 
	indexm ++;//JY's
	    }//JY's
    
    return merge;
    }

    public static void main (String[] args) {
	int a[] = {1,5,8,10,14,20,34};
	int b[] = {2,4,8,12,18,24,39,45};
	System.out.println(merge(a,b));
	int c[] = {6,1,9,45,1322,94,12,5,3,98,23,452,12,2,4,7};
	System.out.println(mergesort(c));
    }
}
	 
