import java.io.*;
import java.util.*;

public class QuickSort{
    
    //it works! it works!

    public Integer[] array;
    Random rnd;

    public static void main (String[] args){
	QuickSort qs = new QuickSort(11);
	System.out.println("Initial Array: "  + qs.toString());
	qs.qsort(qs.array);
	System.out.println("Sorted Array: " + qs.toString());
    }

    public QuickSort(int n){
	rnd = new Random();
	array = new Integer[n];
	for (int i=0; i<n;i++){
	    array[i] = rnd.nextInt(100);
	}
    }

    public QuickSort(){
	this(10);
    }

    public String toString(){
	String s = "";
        s+=Arrays.toString(array);
	return s;
    }

    public Integer[] qsort(Integer[] a){
	if (a.length<= 1){
	    return a;
	}
	else{
	    int pivotindex = rnd.nextInt(a.length);
	    int pivot = a[pivotindex];
	    //System.out.println(pivot);
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();
	    int i = 0;
	    for (; i<pivotindex; i++){
		if (a[i]<pivot){
		    lower.add(a[i]);
		}
		if (a[i]>=pivot){
		    upper.add(a[i]);
		}
	    }
	    for (int i2 = i+1; i2<(a.length); i2++){
	        if (a[i2]<pivot){
		    lower.add(a[i2]);
		}
		if (a[i2]>=pivot){
		    upper.add(a[i2]);
		}
	    }
	    //System.out.println(lower);
	    //System.out.println(upper);

	    Integer[] lowerArr = lower.toArray(new Integer[]{});
            Integer[] upperArr = upper.toArray(new Integer[]{});
            Integer[] r1 = qsort(lowerArr);
            Integer[] r2 = qsort(upperArr);

            for (int i3 = 0; i3<r1.length; i3++) {
                a[i3] = r1[i3];
            }
            a[r1.length] = pivot;
            for (int i4 = 0; i4<r2.length; i4++) {
                a[i4 + r1.length + 1] = r2[i4];
	    }
        return a;
	}
    }
    
}
