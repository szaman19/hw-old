public class MergeSort{
    
    public static int[] merge(int[]a, int[]b){
	int topA=0;
	int topB=0;
	int tret=0;
	int[]ret=new int[a.length+b.length];
	while(topA<a.length &&topB<b.length){
	    if (a[topA]< b[topB]){
		ret[tret]=a[topA];
		topA++;
	    }
	    else{
		ret[tret]=b[topB];
		topB++;
	    }
	    tret++;
	}
	if (topA==a.length){
	    for(int x=topB;x<b.length;x++){
		ret[tret]=b[x];
		tret++;
	    }
	}
	else if(topB==b.length){
	    for(int x=topA;x<a.length;x++){
		ret[tret]=a[x];
		tret++;
	    }
	}
	return ret;
    }

    public static int[] mergeSort(int[]l){
	if (l.length<=1)
	    return l;
	else{
	    int[]a=new int[l.length/2];
	    int[]b=new int[l.length-a.length];
	    for(int i=0;i<a.length;i++)
		a[i]=l[i];
	    for(int i=0;i<b.length;i++)
		b[i]=l[i+a.length];
	    return  merge(mergeSort(a),mergeSort(b));
	   
	}
    }
    public static void main(String[]args){
	int[] a={1,4,5,61,2,45,345,4,56,3,2,6,84,2,25,1,1,0};
	a=mergeSort(a);
	for(int x:a)
	    System.out.print(x+", ");
    }
}
	
	    