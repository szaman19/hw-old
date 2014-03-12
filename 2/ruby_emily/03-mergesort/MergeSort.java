import java.io.*;
import java.util.*;

public class MergeSort{
<<<<<<< HEAD
    // private int[] a, b;

     public int[] mergeSort(int[] a){
	 int[] h1;
	 int[] h2;
=======
    private int[] h1, h2;

    public int[] mergeSort(int[] a){
>>>>>>> parent of f249657... hw5
	if (a.length <= 1)
	    return a;
	else{
	    int half = a.length/2;
	    h1 = new int[half];
<<<<<<< HEAD
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

=======
	    h2 = new int[half];
	    for (int i=0; i<half; i++){
		h1[i]=a[i];
		h2[i]=a[i+half];
	    }
>>>>>>> parent of f249657... hw5
	    h1 = mergeSort(h1);
	    h2 = mergeSort(h2);
	    a  = merge(h1,h2);
	    return a;
<<<<<<< HEAD
	   
	

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
=======
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
>>>>>>> parent of f249657... hw5
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
<<<<<<< HEAD
	//	m.merge(c,d);
       	//mergeSort(b);
      	System.out.println(m.toString(m.mergeSort(b)));
    }
}
=======
	//	m.split(b);
	//	m.merge(c,d);
       	m.mergeSort(b);
       	System.out.println(m.toString(b));
    }
}
//each part works individually, the merge and the split, but still working on incorporating them together in the merge sort
>>>>>>> parent of f249657... hw5
