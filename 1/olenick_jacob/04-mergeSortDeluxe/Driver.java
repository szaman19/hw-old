import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main (String[] args){
	Sort S = new Sort();
	int[] eg = S.randArray(1000,1000);//regular
	S.mergeSort(eg);
	S.bubbleSort(eg);
	S.radixSort(eg);
	eg = S.randArray(10000,1000);//longer
	S.mergeSort(eg);
	S.bubbleSort(eg);
	S.radixSort(eg);
	eg = S.randArray(100000,1000);//much longer
	S.mergeSort(eg);
	S.bubbleSort(eg);
	S.radixSort(eg);
	eg = S.randArray(1000,10000);//wider
	S.mergeSort(eg);
	S.bubbleSort(eg);
	S.radixSort(eg);
	eg = S.randArray(1000,100000);//much wider
	S.mergeSort(eg);
	S.bubbleSort(eg);
	S.radixSort(eg);
    }
}