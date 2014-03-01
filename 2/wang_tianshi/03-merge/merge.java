import java.io.*;
import java.util.*;

public class merge{

    public int[] merge (int[] A, int[] B){
        int L = A.length + B.length;
        int[] ans = new int[L];
	int a=0;
	int b=0;
	int i=0;
	boolean early;
	while (i<L && (a<=A.length && b<=B.length)){
	    if (a==A.length && b!=B.length){
		ans[i]=B[b];
		b++;
	    }
	    else if (b==B.length && a!=A.length){
		ans[i]=A[a];
		a++;
	    }
	    else if (A[a]<B[b]){
		ans[i]= A[a];
		a++;
	    }
	    else{
		ans[i]=B[b];
		b++;
	    }
	    i++;
	}
	return ans;
    }

    public static void main (String[] args){
	merge m = new merge(); //testing out merge
	int[] L1 = {1,1,1,2,2,3,4,6,7,8,8,9,10};
	int[] L2 = {0,3,5,6,7,7,9,};
	int[] test = m.merge(L1,L2);
	for (int i=0; i<test.length;i++)
	    System.out.print(test[i]+" ");
	
	System.out.println();

	int[] L3 = {0,0,0,0,0,0,1,19};
	int[] L4 = {15,17,18};
        test = m.merge(L3,L4);
	for (int i=0; i<test.length;i++)
	    System.out.print(test[i]+ " ");
	
    }
}
		
		    
