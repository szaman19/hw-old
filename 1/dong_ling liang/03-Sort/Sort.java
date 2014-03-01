import java.io.*;
import java.util.*;

public class Sort {

    public String toString(int[] ray){
	String ret = "";
	for (int i = 0; i<ray.length; i++){
	    ret = ret + ray[i];
	}
	return ret;
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
	Sort an = new Sort();
	int[] b = new int[] {1, 3, 4, 5, 6};
	int[] c = new int[] {2, 3, 4, 5, 5, 5};

	System.out.println(an.toString(an.merge(b, c)));
    }


}