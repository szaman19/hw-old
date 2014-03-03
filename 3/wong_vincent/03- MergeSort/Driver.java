import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args) {
	MergeSort A = new MergeSort();
	int[] x = new int [] {15,14,13,12};
	int[] y = new int [] {2,4,6,8,10};
	
	int[] merged = A.merge(x,y);

	for (int i = 0; i < merged.length; i++) {
	    System.out.println(merged[i]);
	}
    }
}
