import java.io.*;
import java.util.*;

public class MergeSort{
    
    public int[] merge(int[] a, int[] b){
	int[] answer = new int[a.length + b.length];
	int aPlace = 0;
	int bPlace = 0;
	//perhaps not the best way to do this!
	while (aPlace < a.length && bPlace < b.length){
	    if (aPlace=a.length){
		answer [aPlace + bPlace] = b[bPlace];
		bPlace++;
	    }
	    if (bPlace=b.length){
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
	int newSize = part/2;
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

    public int[] mergeSort(int[] a, int[] b){
	if (a.length > 1 && b.length > 1){
	    A = mergeSort (splitArray(a,0), splitArray(a,1));
	    B = mergeSort (splitArray(b,0), splitArray(b,1));
	    return mergeSort (A, B);
	}
	else{
	    return merge(a, b);
	}
	
    }
    
    public static void main (String[] args){
	MergeSort a = new MergeSort();
	int[] b = new int[4];
	int[] c = new int[4];
	for (int i =0; i < 4; i ++)
	    b[i] = i*2;
	for (int i = 0; i < 4; i++)
	    c[i] = i*3;
	System.out.println(a.mergeSort (b,c));
    }
}