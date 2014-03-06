import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){

	Merge m = new Merge();

	int[] x = new int[] {1,3,5,9,12,14,17,18,24,25,26,29,45,46,47,68,78};
	int[] y = new int[] {2,3,4,5,6,7,10,20,33,34,35,36,37,38,39,68,69,78,79};

	//testing the merge method
	int[] sorted = m.merge(x,y);
	for (int i=0; i<sorted.length; i++){
	    System.out.println(sorted[i]);
	}

	//testing the split method
	m.split(x);
	for (int i=0; i<m.temp1.length; i++){
	    System.out.println("TEMP 1:" + m.temp1[i]);
	}
	for (int i=0; i<m.temp2.length; i++){
	    System.out.println("TEMP 2:" + m.temp1[i]);
	}
    }
}
