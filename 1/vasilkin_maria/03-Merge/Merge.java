class Merge {
    
    public static int[] merge(int[] a, int[] b) {
	int merge[] = new int[a.length+b.length];
	System.out.println(merge);
	int indexa = 0;
	int indexb = 0;
	int indexm = 0;
	//for (int i : merge) {
	if (a.length <= indexa) {
	    for (int j: b) {
		merge[indexm] = b[j];
		indexm ++;
		System.out.println(merge);
	    }
	}
	else if (b.length <= indexb) {
	    for (int i = indexa; i <a.length; i++) {
		merge[indexm] = a[indexa];
		indexm ++;
		System.out.println(merge);
	    }
	}
	else if (a[indexa] < b[indexb]) {
	    merge[indexm] = a[indexa];
	    indexa ++;
	    indexm ++;
	    System.out.println(merge);
	}
	else{
	    merge[indexm] = b[indexb];
	    indexb ++;
	    indexm ++;
	    System.out.println(merge);
	} 
    
    return merge;
    }

    public static void main (String[] args) {
	int a[] = {1,5,8,10,14,20,34};
	int b[] = {2,4,8,12,18,24,39,45};
	System.out.println(merge(a,b));
    }
}
	 
