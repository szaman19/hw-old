import java.io.*;
import java.util.*;

public class QuickSelect{
    Random r = new Random();
    public int quickSelect(int[] a, int k, int low, int high){
	if (low >= high)
	    return a[low];
	int p = array[r.nextInt(high - low) + low];
	int[] temp = new int[a.length];
	int x = 0;
	for (int i = low; i <= high; i++){
	    if (a[i] < p){
		temp[x] = a[i];
		x++;
	    }
	}
	for (int i = low; i <= high; i++){
	    if (a[i] > p){
		temp[x] = a[i];
		x++;
	    }
	}
	a = temp;
    }
    //
    // Honestly, i'm not 100% sure what this "quick select" does.
    //
    /*-------------------------------------*/
    public static void main(String[] args){
	
    }
}
