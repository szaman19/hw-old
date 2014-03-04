import java.io.*;
import java.util.*;

//worked with James

public class mergeSort {


    public void mergeSort (int[]x) {
	if (x.length <= 1)
	   ;

	if (x.length > 1) {
	    int first = x.length / 2;
	    int second = x.length - first;
	    int [] a1 = split(x, "1");
	    int [] a2 = split(x, "2");     //exception error, don't know the problem
	    mergeSort (a1);
	    mergeSort (a2);
	    merge (a1,a2, x);
	}

    }






    public int [] split (int [] array, String s){
	if (s.equals("1")){
	    int first = array.length / 2;
	    int second = array.length - first;
	    int [] one = new int [first];
	    for (int i = 0; i < first; i++) {
		one[i] = array[i];
	    }
	    return one;
	    }
	    if (s.equals("2")){
		int first = array.length / 2;
		int second = array.length - first;
		int [] two = new int [second];
		for (int i = 0;  i < second; i++) {
		    two [i] = array [first + i];
		}
	    return two;
	    }
	    return array;
    }
    
    public int[]  merge (int [] x, int [] y, int [] ans) {
	int count1 = 0;
	int count2 = 0;
	for (int i = 0; i < x.length + y.length; i++) {
	    if (count2 >= y.length || (count1 < x.length && (x[count1] <= y[count2]))) {
		ans [i] = x[count1];
		count1++;
	    }
	    else if (count2 < y.length){
		ans[i] = y [count2];
		count2++;
	    }
	}
	return ans;
    }

    public static void main (String [] args) {
	mergeSort m = new mergeSort();
	int [] a1 = new int [10];
	for (int i = 0; i < 10; i ++) {
	    int r = (int)(10 * Math.random());
	    a1[i] = i +r;
	}   
	System.out.println (Arrays.toString (a1));
	m.mergeSort (a1);

	System.out.println (Arrays.toString (a1));
	    

    }
}