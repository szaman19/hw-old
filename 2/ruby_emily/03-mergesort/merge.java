import java.io.*;
import java.util.*;

public class merge{
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
    
    public static void main (String[] args){
	merge m = new merge();

	int[] x = new int[3];
	x[0] = 1;
	x[1] = 7;
	x[2] = 13;

	int[] y = new int[3];
	y[0] = 2;
	y[1] = 5;
	y[2] = 15;

	//[1,2,5,7,13,15]

        m.merge(x,y);
	//	System.out.println(m.merge(x,y));
    }
}
