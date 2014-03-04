import java.io.*;
import java.util.*;

public class MergeSort {
    
    private int[] combined;
    private int[] a;
    private int[] b;
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private int w = 0;

    public int[] MSort (int[] L) {
	if (L.length == 1) {
	    return L;
	}
	else {
	    for (int i = 0; i < L.length/2; i++) {
		a = new int[L.length/2];
		a[i] = L[i];
	    }
	    for (int i = L.length/2; i < L.length; i++) {
		b = new int[L.length-L.length/2];
		b[i] = L[i];
	    }
	    int[] o = MSort(a);
	    int[] p = MSort(b);
	    L = merge(o,p);
	    return L;
	}
    }

    public int[] merge (int[] a, int[] b) {
	combined = new int[a.length+b.length];

	x = a[z];
	y = b[w];
	
	for (int i = 0; i < a.length+b.length; i++) {
	    if (x <= y) {
		combined[i] = x;
		if (z < a.length -1){
		    z = z + 1;
		    x = a[z];
		}
	    }
	    else if (y < x) {
		combined [i] = y;
		if (w < b.length - 1) {
		    w = w + 1;
		    y = b[w];
		}
	    }
	}
	return combined;
    }
}
