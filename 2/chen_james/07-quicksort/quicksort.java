import java.io.*;
import java.util.*;

public class quicksort {

    //not sure why the returned array has duplicate values....
    //everything else shoudl work fine
    public static void main(String[] args) {
	quicksort a = new quicksort();
	int n = 10;
	ArrayList<Integer> list = new ArrayList<Integer>(n);
	Random r = new Random();
	
	for (int i = 0; i < n; i++) {
	    list.add(r.nextInt(n*10));
	}
	
	System.out.println(list);
	System.out.println(a.qSort(list));
    }
    public ArrayList<Integer> qSort(ArrayList<Integer> a) {
	if (a.size() <= 1)
	    return a;

	int pivot = (int) (Math.random() * a.size());
	int pivotvalue = a.get(pivot);

	ArrayList<Integer> left = new ArrayList<Integer>();
	ArrayList<Integer> right = new ArrayList<Integer>();
	
	for (int i = 0; i < a.size(); i++) {
	    if ( a.get(i) <= pivotvalue ){
		if ( i == pivot ) {
		    
		}
		left.add( a.get(i) );
	    }
	    else {
		    right.add( a.get(i) );
		}
	}
	return combine(qSort(left), pivotvalue, qSort(right));
	
    }
    
    private ArrayList<Integer> combine(ArrayList<Integer> left, int pivot, ArrayList<Integer> right){
	
	ArrayList<Integer> combined = new ArrayList<Integer>();
		
		for (int i = 0; i < left.size(); i++) {
		    combined.add(left.get(i));
		}
		
		combined.add(pivot);
		
		for (int i = 0; i < right.size(); i++) {
		    combined.add(right.get(i));
		}
		
		return combined;
    }
}
