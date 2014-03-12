import java.lang.Math;
import java.io.*;
import java.util.*;

public class Quick{

    public int quickselect(int[] a, int k, int low, int high){

	int x = 0; int y = 0; int z = a.indexOf(k) + 1; int p = 0;
	
	int[] b = new int[a.length];
	
	Random generator = new Random();

	if (low >= high){

		return low;

	    }

	else{

	    p = a[high - generator.nextInt(low)];
	    
	    for (int i = 0; i < a.length; i++){

		if (a[i] < p){

		    b[y] = a[i];

			y++;

			}

		if (a[i] > p){

		    b[z] = a[i];
		    
		    z++;
	
		}

		else {

		    b[a.indexOf(p)] = p;

		}
	    
	    }

	    for (int j = 0; j < b.length; j++){
		
		a[j] = b[j];

	    }

	    if (p == k){

		return a.indexOf(p);

	    }

	    else if (p < k){

		low = p;

		quickselect(a, k, low, high);

	    }

	    else if (p > k){

		high = p;

		quickselect(a, k, low, high);

	    }
	
	}

	return a.indexOf(k);

    }

}

//Seems like it should work, but I cannot find out how to use indexOf()
