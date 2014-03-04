import java.io.*;
import java.util.*;

//worked with James

public class mergeSort {

    private int[] a;
    private int[] b;
    private int []a1;
    private int [] b1;
    private int [] ans;
    private int first;
    private int second;
 


    public void mergeSort (int[]x, int[]y) {
	a = x;
	b = y;
	if (a.length <= 1)
	   ;
	if (b.length <=1)
	   ;
	if (a.length > 1) {
	    first = a.length / 2;
	    second = a.length - first;
	    a = split(a, "1");
	    a1 = split(a, "2");     //exception error, don't know the problem
	    mergeSort (a,a1);
	}
	if (b.length > 1) {
	    first = b.length/2;
    
	    second = b.length - first;
	    b = split (b, "1");
	    b1 = split (b, "2");
	    mergeSort (b,b1);
	}
	merge (a,b);



    }





    public int [] split (int [] array, String s){
	if (s.equals("1")){
		int [] one = new int [first];
	    for (int i = 0; i < first; i++) {
		one[i] = array[i];
	    }
	    return one;
	    }
	    if (s.equals("2")){
	    int [] two = new int [second];
	    for (int i = 0;  i < second; i++) {
		two [i] = array [first + i];
	    }
	    return two;
	    }
	    return array;
    }

    public int[]  merge (int [] x, int [] y) {
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
	int  [] b1 = new int [10];
	for (int i = 0; i < 10; i ++) {
	    int r = 5;
	    a1[i] = r + 2;
	    b1[i] = r + 5;
	    r++;
	}   
	System.out.println (Arrays.toString (a1));
	System.out.println (Arrays.toString (b1));
	m.mergeSort (a1,b1);

	System.out.println (Arrays.toString (m.ans));
	    

    }
}