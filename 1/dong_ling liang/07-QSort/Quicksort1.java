import java.io.*;
import java.util.*;

public class Quicksort {
    //doesn't work; only sorts 80%    
    public int[] Sort(int[] L){
	if (L.length <= 1)
	    return L;
	Random rand = new Random();
	int pivotIndex = rand.nextInt(L.length);
	for (int i = 0; i<L.length; i++){
	    if (L[i] < L[pivotIndex] && i > pivotIndex){
		L = Swap(L, i, pivotIndex);
		pivotIndex = i;
	    }
	    else if (L[i] > L[pivotIndex] && i < pivotIndex){
		L = Swap(L, i, pivotIndex);
		pivotIndex = i;
	    }
	    else if (L[pivotIndex] == L[i] && i > pivotIndex){
		L = Swap(L, i, pivotIndex);
		pivotIndex = i;
	    }
	}	
	if (L.length < 3)
	    return L;
	int[] R1 = Sort(getList(L, 0, pivotIndex - 1));
	int[] R2 = Sort(getList(L, pivotIndex + 1, L.length - 1));
	System.out.println("-----\n" + toString(R1));
	System.out.println("" + L[pivotIndex]);
	System.out.println(toString(R2)+"\n ====");
	return Combine(R1, L[pivotIndex], R2);
    }

    public int[] Swap(int[] L, int a, int b){
	int temp = L[a];
	L[a] = L[b];
	L[b] = temp;
	return L;
    }

    public int[] getList(int[] L, int start, int end){
	int[] ret = new int[end - start + 1];
	int ind = start;
	for (int i = 0; i < ret.length; i++){
	    ret[i] = L[ind];
	    ind ++ ;
	}
	return ret;
    }

    public int[] Combine(int[] a, int c, int[] b){
	int[] ret = new int[a.length + b.length + 1];
	int counter = 0;
	for (int i : a){
	    ret[counter] = i;
	    counter++;
	}
	ret[counter] = c;
	counter++;
	for (int i : b){
	    ret[counter] = i;
	    counter++;
	}
	return ret;
    }

    public String toString(int[] L){
	String ret = "";
	for (int i : L){
	    ret = ret + i + " ";
	}
	return ret;
    }

    public static void main(String[] args){
	int[] ul = new int[10];
	Random rand = new Random();
	for (int i = 0; i <ul.length; i++){
	    ul[i] = rand.nextInt(10) + 1;
	}
	Quicksort q = new Quicksort();
	System.out.println(q.toString(ul));
	System.out.println(q.toString(q.Sort(ul)));
    }
}