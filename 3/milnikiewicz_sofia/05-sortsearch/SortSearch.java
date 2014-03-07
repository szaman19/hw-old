import java.io.*;
import java.util.*;

public class SortSearch{

    public int[] a;
    Random rnd;

    public static void main (String[] args){
	int n = Integer.parseInt(args[0]);
	long start,elapsed;

	SortSearch s = new SortSearch(n);

	System.out.println();
	System.out.println("Initial Array: " + s.toString());
	System.out.println();
	
	System.out.println("Starting");
	start = System.currentTimeMillis();
	int[] d = s.msort(s.a);
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Merge sort: "+Arrays.toString(d));
	System.out.println("Time: "+elapsed+"\n");
    }

    public SortSearch(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<n;i++)
	    a[i]=rnd.nextInt(100);
    }

    public SortSearch() {
	this(20);
    }

    public String toString() {
	String s="";
	s=s+"\n";
	s=s+Arrays.toString(a);
	return s;
    }

    public int[] merge(int[] a, int[] b) {
	int[] result = new int[a.length+b.length];
	int ia=0,ib=0;
	int i=0;
	while (ia<a.length&&ib<b.length) {
	    if (a[ia]<b[ib]) {
		result[i]=a[ia];ia++;
	    }  else {
		result[i]=b[ib];ib++;
	    }
	    i++;
	}

	if (ia>=a.length) {
	    for (;i<result.length;i++){
		result[i]=b[ib];ib++;
	    }
	} else {
	    for (;i<result.length;i++){
		result[i]=a[ia];ia++;
	    }
	}
	return result;
    }
    
    public int[] msort(int[] L) {
	
	if (L.length<=1){
	    return L;
	}
	
	int[] a = new int[L.length/2];
	int[] b = new int[L.length - a.length];

	int i;
	for (i=0;i<a.length;i++){
	    a[i]=L[i];
	}
	for ( ; i<L.length;i++){
	    b[ i-a.length ] = L[i];
	}
	a = msort(a);
	b = msort(b);
	int[] result = merge(a,b);
	return result;
    }
}