import java.io.*;
import java.util.*;

public class Quickselect{
    private Random r = new Random();
 
    public int quickselect(int[] a,int k,int low, int high){
	if (low >= high && low >= 0){
	    return a[low];
	}
	int index = r.nextInt(high-low)+low;
	int p = a[index];
	int[] temp = new int[a.length];
	temp[index] = p;
	int c = 0;
	int d = index + 1;
	for (int i = 0;i<a.length;i++){
	    if (a[i] < p){
		temp[c] = a[i];
		c = c + 1;
	    }
	    else if (a[i] > p){
		temp[d] = a[i];
		d = d + 1;
	    }
	}
	if (temp[index] == k){
	    return index;
	}
	else if (temp[index] < k){
	    quickselect(temp,k,low,index);
	}
	else {
	    quickselect(temp,k,index+1,high);
	}
	return index;
    }
}
