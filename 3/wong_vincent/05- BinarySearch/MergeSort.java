import java.io.*;
import java.util.*;
public class MergeSort {

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
