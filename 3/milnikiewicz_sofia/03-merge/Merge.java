import java.io.*;
import java.util.*;

public class Merge{

    public static void main (String args[]){
	Merge m = new Merge();
	int[] L = {2,4,3,1};
        System.out.println((m.MergeSort(L)).toString());
	
    }

    public int[] MergeSort(int[] L){
	if (L.length <= 1){
	    return L;
	}
	else{
	    int[] a = Split(L,0);
	    System.out.println("other:");
	    int[] b = Split(L,1);
	    a = MergeSort(a);
	    b = MergeSort(b);
	    int[] output = Merge(a, b);
	    return output;
	}
    }

    public int[] Split(int[] L, int pos){
	int length = L.length;
	int[] output = new int[length/2];
	if (pos==0){
	    for (int i=0; i<length/2; i++){
		output[i] = L[i];
	    }
	    return output;
	}
	else{
	    for (int i=length/2; i<=length; i++){
		output[i-(length/2)] = L[i];
	    }
	    return output;
	}
	
    }

    public int[] Merge(int[] a1, int[] a2){
	int[] a3 = new int[a1.length + a2.length];
	for (int i = 0;i<a1.length; i++){
	    a3[i]=a1[i];
	}
	for (int j=0; j<a2.length; j++){
	    a3[j+a1.length]=a2[j];
	}
	Arrays.sort(a3);
	return a3;
	
    }
}


//u said to do this stupidly so i did this stupidly
//and its not printing correcly for whatever reason...something to do with toString?
