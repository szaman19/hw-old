import java.io.*;
import java.util.*;

public class QuickSelect{
  
    public int quickselect(int[] a, int k, int low, int high){
	int[] other = new int[(high - low)]; //new array
	if (low >= high){
	    return k;
	}
	Random r = new Random();
	int iP = r.nextInt(other.length) + low; //index of p
	int p = other[iP];
	int otheri = 0;
	int otheri2 = 0;
	for (int i = 0; i < a.length; i ++){
	    if (a[i] <= p){
		other[otheri] = a[i];
		otheri ++;
	    }
	    else{
		other[a.length - otheri2 - 1] = a[i];
		otheri2 ++;
	    }
	}
	if (otheri == k){
	    return other[otheri];
	}
	else{
	    if (otheri < k){
		//return quickselect(a, otheri + 1, high, k) + otheri;
		return quickselect(a, k, otheri, high) + otheri;
	    }
	    else{
		//return quickselect(a, 0, otheri - 1, k);
		return quickselect(a, k, 0, otheri);
	    }
	}
    }   
}
