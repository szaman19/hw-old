import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args) {
	MergeSort A = new MergeSort();
	int[] x = new int[] {1,16,23,32,2,1,1,1,45,4,13,61};
	//int[] y = new int [] {2,4,6,8,10};
	
	x = A.MSort(x);

	for (int i = 0; i < x.length; i++) {
	    System.out.println(x[i]);
	}
    }
}
