public class Mergesort{

    public Mergesort(){};

    public void print(int[] a){
	for(int x = 0; x<a.length;x++){
		System.out.println(a[x]);
	    }
    }

    public int[] merge(int[] a, int[] b){
	if(a.length == 0) return b;
	if(b.length == 0) return a;
	int[] c = new int[a.length + b.length];
	int la = 0;
	int lb = 0;
	int count = 0;
	do{
	    if(a[la] < b[lb]){
		c[count] = a[la];
		la++;
	    }else{
		c[count] = b[lb];
		lb++;
	    }
	    count++;
	}while(la < a.length && lb < b.length);
	if(la < a.length){
	    for(int x = la; x < a.length; x ++){
		c[count] = a[x];
		count ++;
	    } 
	}
	if(lb < b.length){
	    for(int x = lb; x < b.length; x ++){
		c[count] = b[x];
		count ++;
	    } 	  
	}
	return c;
    }

    public int[] subarray(int a, int b, int[] array){
	int[]c=new int[b-a];
	int count = 0;
	for (int x = a; x < b; x ++){
	    c[count] = array[x];
	    count ++;
	}
	return c;
    }

    public int[] MergeSort(int[] a){
	if (a.length < 2) return a;
	int[] c, d;
	    if (a.length % 2 == 0){
		c = new int[a.length / 2];
		d = new int[a.length /2];
		c = MergeSort(subarray(0, a.length / 2 , a));
		d = MergeSort(subarray(a.length/2 , a.length, a));
	    }else{
		c = new int[a.length/2];
		d = new int[a.length/2 + 1];
		c = MergeSort(subarray(0, a.length / 2 , a));
		d = MergeSort(subarray(a.length / 2 , a.length, a));
	    }

	   a =  merge(c,d);
	return a;
    }
}
