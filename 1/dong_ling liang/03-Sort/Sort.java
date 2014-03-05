import java.io.*;
import java.util.*;

public class Sort {

    public int[] mergeSort(int[] l){
	if (l.length <= 1){
	    return l;
	}
	else {
	    int temp = l.length;
	    int[] x = new int[temp/2];
	    for (int i = 0; i< x.length; i++){
		x[i] = l[i];
	    }
	    int[] y;
	    if (temp%2 == 0)
		y = new int[temp/2];
	    else 
		y = new int[temp/2 + 1];
	    int count = 0;
	    for (int i = temp/2; i<l.length; i++){
		y[count] = l[i];
		count++;
	    }
	    x = mergeSort(x);
	    y = mergeSort(y);
	    l = merge(x, y);
	    return l;
	}
    }

    public String toString(int[] ray){
	String ret = "";
	for (int i = 0; i<ray.length; i++){
	    ret = ret + ray[i];
	}
	return ret;
    }
    
    public int[] get(int[] x){
	return x;
    }
    
    public int[] merge(int[] A, int[] B){
	int[] C = new int[A.length + B.length];
	int a = 0;
	int b = 0;
	for (int i = 0 ; i < C.length; i++){
	    if (a<A.length && b<B.length){
		if (A[a] < B[b]){
		    C[i] = A[a];
		    a++;
		}
		else {
		    C[i] = B[b];
		    b++;
		}
	    }
	    else if (a==A.length){
		C[i] = B[b];
		b++;
	    }
	    else if (b==B.length){
		C[i] = A[a];
		a++;
	    }
	}
	return C;
    }
    public static void main(String[] args){
	Random rand = new Random();
	Sort an = new Sort();
	int[] a  = new int[rand.nextInt(20)];
	for (int i = 0; i<a.length; i++){
	    a[i] = rand.nextInt(10);
	}
	
	System.out.println(an.toString(a));
	System.out.println(an.toString(an.mergeSort(a)));
    }


}