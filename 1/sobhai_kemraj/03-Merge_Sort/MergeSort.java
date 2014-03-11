import java.io.*;
import java.util.*;

public class MergeSort{
    
    public int[] merge(int[] a, int[] b){
		int[] answer = new int[a.length + b.length];
		int aPlace = 0;
		int bPlace = 0;
		//perhaps not the best way to do this!
		while (aPlace < a.length && bPlace < b.length){
			if (aPlace==a.length){
				answer [aPlace + bPlace] = b[bPlace];
				bPlace++;
			}
			if (bPlace==b.length){
				answer [aPlace + bPlace] = a[aPlace];
				aPlace++;
			}
			if (a[aPlace] > b[bPlace]){
				answer[aPlace + bPlace] = a[aPlace];
				aPlace++;
			}
			else{
				answer[aPlace + bPlace] = b[bPlace];
				bPlace++;
			}
		}
		return answer;
    }
    
    private int[] splitArray (int[] arr, int part){
		int newSize = arr.length/2;
		int[] answer = new int[newSize];
		if (part == 0){
			for (int i = 0; i < newSize; i ++){
				answer[i] = arr[i];
			}
		}
		else{
			for (int i = 0; i < newSize;i ++){
				answer[i] = arr[i+newSize];
			}
		}
		return answer;
    }

    /*
    public int[] mergeSort (int[] a, int[] b){
	if (a.length > 1 && b.length > 1){
	    int[] A = mergeSort (splitArray(a,0), splitArray(a,1));
	    int[] B = mergeSort (splitArray(b,0), splitArray(b,1));
	    // System.out.println(Arrays.toString(A));
	    //System.out.println(Arrays.toString(B));
	    return mergeSort (A, B);
	}
	else{
	    return merge(a, b);
	}
	
    }
    */
   
    public int[] mergeSort (int[] a, int[]b){
		int[] answer = new int[a.length + b.length];
		int aPlace = 0;
		int bPlace = 0;
		while ((aPlace + bPlace) < (a.length + b.length)){
			if (aPlace == a.length){
				answer[aPlace + bPlace] = b[bPlace];
				bPlace++;
			}
			else if (bPlace == b.length){
				answer[aPlace + bPlace] = a[aPlace];
				aPlace++;
			}
			else if (a[aPlace] < b[bPlace]){
				answer[aPlace + bPlace] = a[aPlace];
				aPlace++;
			}
			else {
				answer[aPlace + bPlace] = b[bPlace];
				bPlace++;
			}
		}
		return answer;
    }
    //doesn't catch wordls like ants vs. aaa, and therefore does not work properly yet
    public String[] mergeSortStrings (String[] a, String[]b){
		String[] answer = new String[a.length + b.length];
		int aPlace = 0;
		int bPlace = 0;
		while ((aPlace + bPlace) < (a.length + b.length)){
			if (aPlace == a.length){
				answer[aPlace + bPlace] = b[bPlace];
				bPlace++;
			}
			else if (bPlace == b.length){
				answer[aPlace + bPlace] = a[aPlace];
				aPlace++;
			}
			else if ((a[aPlace].compareTo(b[bPlace]))<0){
				answer[aPlace + bPlace] = a[aPlace];
				aPlace++;
			}
			else {
				answer[aPlace + bPlace] = b[bPlace];
				bPlace++;
			}
		}
		return answer;
	}
    
    public static void main (String[] args){
	MergeSort a = new MergeSort();
	int[] b = new int[4];
	int[] c = new int[4];
	for (int i =0; i < 4; i ++)
	    b[i] = i*2;
	for (int i = 0; i < 4; i++)
	    c[i] = i*4;

	String[] d = new String[4];
	String[] e = new String[4];
	d[0]="cat";
	d[1]="dog";
	d[2]="ant";
	d[3]="butterfly";
	e[0]="ants";
	e[1]="aaa";
	e[2]="zz";
	e[3]="ZZZ";
	System.out.println(Arrays.toString(d));
	System.out.println(Arrays.toString(e));	
	System.out.println(Arrays.toString(a.mergeSortStrings (d,e)));
    }
}