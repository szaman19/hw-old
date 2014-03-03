import java.util.*;
import java.io.*;

public class Driver{
    public static void main (String[]args){
	int[] A = {4,10,5,88,2,7,18,46};
	int[] B = {12,7,3,90,35,19,23,1053,2};
	mergeSort m = new mergeSort();
	System.out.println(Arrays.toString(A));
	System.out.println(Arrays.toString(B));
	System.out.println(Arrays.toString(m.merge(A,B)));
	System.out.println(Arrays.toString(m.mergeSort(A)));
        
    }
}
