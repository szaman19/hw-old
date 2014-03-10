import java.io.*;
import java.util.*;

public class MergeSort{
    // private int[] a, b;

     public int[] mergeSort(int[] a){
	 int[] h1;
	 int[] h2;
	if (a.length <= 1)
	    return a;
	else{
	    int half = a.length/2;
	    h1 = new int[half];
	    h2 = new int[a.length-half];
	    for (int i = 0; i < a.length; i++) {
                if (i < half) {
                    h1[i] = a[i];
                }
                else {
                    h2[i - half] = a[i];
                }
            }
	}

	    h1 = mergeSort(h1);
	    h2 = mergeSort(h2);
	    a  = merge(h1,h2);
	    return a;
	   
	

    }
  
  

    public int[] merge(int[] x, int[] y){
	int xcount = 0;
	int ycount = 0;
	int[] result = new int[x.length + y.length];
        for (int i=0; i<result.length; i++){
	    if (xcount == x.length){
		result[i] = y[ycount];
		ycount++;
		    }
	    else if (ycount == y.length){
		result[i] = x[xcount];
		xcount++;
	    }
	    else if (x[xcount] <= y[ycount]){
		result[i] = x[xcount];
	        xcount++;
	    }
	    else{
		result[i] = y[ycount];
	        ycount++;
	    }
	}
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
	//	m.merge(c,d);
       	//mergeSort(b);
      	System.out.println(m.toString(m.mergeSort(b)));
    }
}
