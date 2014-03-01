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
	    }else if (b==B.length && a!=A.length){
		ans[i]=A[a];
		a++;
	    }else if (A[a]<B[b]){
		ans[i]= A[a];
		a++;
	    }else{
		ans[i]=B[b];
		b++;
	    }
	    i++;
	}
	return ans;
    }

    public int[] mergeSort(int[] a){
	int size = a.length;
	if (size<=1)
	    return a;
	else{
	    int[] a1 = new int[size/2];
	    int[] a2 = new int[size - size/2];
	    for (int i=0; i<a1.length; i++)
		a1[i]=a[i];
	    
	    for (int i=0; i<a2.length; i++)
		a2[i]=a[i+a1.length];

	    return merge(mergeSort(a1),mergeSort(a2));
	}	    
    }
    
	    

    public static void main (String[] args){
	merge m = new merge(); //testing out merge
	int[] L1 = {1,1,1,2,2,3,4,6,7,8,8,9,10};
	int[] L2 = {0,3,5,6,7,7,9,};
	int[] test = m.merge(L1,L2);
	for (int i=0; i<test.length;i++)
	    System.out.print(test[i]+" ");
	
	System.out.println();

	int[] L3 = {1,3,5,12,7,4,8,9,100,0,20,1,0,0,1,19};
        int[] test2 = m.mergeSort(L3);
	for (int i=0; i<test2.length;i++)
	    System.out.print(test2[i]+ " ");
	
    }
}
		
		    
