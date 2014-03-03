import java.io.*;
import java.util.*;

class Merge {

    //worked with lecvy
    public void mergeSort(int[] array) {
	if (array.length > 1) {
	    //splits the array into one[] and two[]
	    int[] one =  splitArray(array, "one");
	    //debug
	    System.out.println(Arrays.toString(one));
	    int[] two = splitArray(array, "two");
	    //debug
	    System.out.println(Arrays.toString(two));
	   
	    //sort halfs
	    mergeSort(one);
	    mergeSort(two);

	    merge(one, two, array);
	    
	}

    }

    public int[] splitArray(int[] array, String s) {
	if(s.equals("one")) {
	    int sizeofhalf1 = array.length/2;
	    int [] one = new int[sizeofhalf1];
	    for (int i = 0; i < sizeofhalf1; i++) {
		one[i] = array[i];
	    }
	    return one;
	}
	else if(s.equals("two")){
	    int sizeofhalf1 = array.length/2;
	    int sizeofhalf2 = array.length - sizeofhalf1;
	    int [] two = new int[sizeofhalf2];
	    for (int i = 0; i < sizeofhalf2; i++) {
		two[i] = array[i+sizeofhalf1];
	    }
	    return two;
	}
	return array; //never gonna happen
    }

    
    public void merge(int[] one, int[] two, int[] ans) {
	int counterone = 0;
	int countertwo = 0;

	for (int i = 0; i < ans.length; i++) {
	    if (countertwo >= two.length // makes sure it doesnt go out of bounds and indicate that we're done with the 2nd array.
		|| (counterone < one.length && one[counterone] <= two[countertwo])) {
		ans[i] = one[counterone];
		counterone++;
	    }
	    else {
		ans[i] = two[countertwo];
		countertwo++;
	    }
	}

    }

    public static void main(String[] args) {
	Merge m = new Merge();
	int[] a1 = new int[10];
	for (int i = 0; i < 10; i++) {
	    Random r = new Random();
	    a1[i] = r.nextInt(100) +1;
	}
	System.out.println(Arrays.toString(a1));
	m.mergeSort(a1);
	System.out.println(Arrays.toString(a1));
	
    }


}
