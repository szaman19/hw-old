import java.io.*;
import java.util.*;

public class Merge{

    public static void main (String args[]){
	Merge m = new Merge();
	int[] a1 = {1,2,4};
	int[] a2 = {3,5,6};
        System.out.println((m.MergeSort(a1,a2)).toString());
	
    }

    public int[] MergeSort(int[] a1, int[] a2){
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
