import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main (String[] args){
	System.out.println("format: merge, bubble, radix");
	Sort S = new Sort();
	int[] eg = S.randArray(10000,10000);//regular
	int[] perm = eg;
	long start = System.currentTimeMillis();
	S.mergeSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.bubbleSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.radixSort(eg);
	print(start - System.currentTimeMillis());
	eg = S.randArray(100000,10000);//longer
	start = System.currentTimeMillis();
	S.mergeSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.bubbleSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.radixSort(eg);
	print(start - System.currentTimeMillis());
	eg = S.randArray(1000000,10000);//much longer
	start = System.currentTimeMillis();
	S.mergeSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.bubbleSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.radixSort(eg);
	print(start - System.currentTimeMillis());
	eg = S.randArray(10000,100000);//wider
	start = System.currentTimeMillis();
	S.mergeSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.bubbleSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.radixSort(eg);
	print(start - System.currentTimeMillis());
	eg = S.randArray(10000,1000000);//much wider
	start = System.currentTimeMillis();
	S.mergeSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.bubbleSort(eg);
	print(start - System.currentTimeMillis());
	eg = perm;
	start = System.currentTimeMillis();
	S.radixSort(eg);
	print(start - System.currentTimeMillis());
    }

    public static void print(String s){
	System.out.println(s);
    }    

    public static void print(long s){
	System.out.println(s);
    }    

    public static void print(){
	System.out.println();
    }

}