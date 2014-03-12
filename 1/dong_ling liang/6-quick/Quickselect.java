import java.io.*;
import java.util.*;

public class Quickselect {
    
    public int quickSelect(int[] a, int k){
	return quickSelect(a, k, 0, a.length - 1);
    }

    public int[] swap(int[] a, int j, int d){
	int temp = a[j];
	a[j] = a[d];
	a[d] = temp;
	return a;
    }

    public int quickSelect(int[] a, int k, int low, int high){
	if (low >= high)
	    return a[low];
	Random rand = new Random();
	int pivotIndex = rand.nextInt(a.length);
	for (int i = low; i<high; i++){
	    if (a[i] > a[pivotIndex] && pivotIndex > i){
		a = swap(a, pivotIndex, i);
		pivotIndex = i;
	    }
	    else if (a[i] < a[pivotIndex] && pivotIndex < i){
		a = swap(a, pivotIndex, i);
		pivotIndex = i;
	    }
	}
	if ( k == pivotIndex )
	    return a[k];
	else if ( pivotIndex < k){
	    return quickSelect(a, k, pivotIndex + 1, high);
	}
	else {
	return quickSelect(a, k, low, pivotIndex - 1);
	}
    }
    public String toString(int[] a){
	String temp = "";
	for (int i : a){
	    temp = temp + i;
	}
	return temp;
    }


    public static void main(String[] arg){
	Quickselect jdai = new Quickselect();
	int[] aray = new int[10];
	Random rand = new Random();
	for (int i = 0; i < 10; i++){
	    aray[i] = rand.nextInt(9) + 1;
	}
	System.out.println(jdai.toString(aray));
	System.out.println("The 3rd smallest is:");
	System.out.println(jdai.quickSelect(aray, 3));
    }
}