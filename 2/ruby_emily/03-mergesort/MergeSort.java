import java.io.*;
import java.util.*;

public class MergeSort{
    private int[] h1, h2;

    public int[] mergeSort(int[] a){
	if (a.length <= 1)
	    return a;
	else{
	    int half = a.length/2;
	    h1 = new int[half];
	    h2 = new int[half];
	    for (int i=0; i<half; i++){
		h1[i]=a[i];
		h2[i]=a[i+half];
	    }
	    h1 = mergeSort(h1);
	    h2 = mergeSort(h2);
	    a  = merge(h1,h2);
	    return a;
	}

    }
    
  

    public int[] merge(int[] x, int[] y){
	int ycount=0;
	int xcount=0;
	int[] result = new int[x.length+y.length];
        for (int i=0; i<result.length; i++){
	    if (x[xcount] <= y[ycount]){
		result[i] = x[xcount];
		if (xcount < x.length-1){
		    xcount++;
		}
	    }
	    else if (y[ycount] < x[xcount]){
		result[i] = y[ycount];
		if (ycount < y.length-1){
		    ycount++;
		}
	    }
	}
	//	System.out.println(xcount);
	//	System.out.println(ycount);
	//	System.out.println(toString(result));
	return result;
    }
    
    public String toString(int[] a){
	return Arrays.toString(a);
    }
    
    public static void main(String[] args){
	MergeSort m = new MergeSort();

	int[] b = new int[52];
	Random r = new Random();
	for (int i=0;i<b.length;i++){
	    b[i] = r.nextInt(25);
	}
	//	m.split(b);
	//	m.merge(c,d);
       	m.mergeSort(b);
       	System.out.println(m.toString(b));
    }
}
//each part works individually, the merge and the split, but still working on incorporating them together in the merge sort
