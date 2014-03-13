
import java.util.*;
import java.util.ArrayList;

public class quicksort2 {
    
    public static ArrayList<Comparable> quicksort (ArrayList<Comparable> L) {
	
	int length = L.size();
	if (length <= 1) {
	    return L;
	}
	int pivot = (int)(Math.random()*length);
	ArrayList<Comparable> h1 = new ArrayList<Comparable>();
	ArrayList<Comparable> h2 = new ArrayList<Comparable>();
	for (int i = 0; i<length;i++) {
	    if (i == pivot) {
		//do nothing I think. I forget what we do with these values.
	    }
	    else if (L.get(i).compareTo(L.get(pivot)) < 0) {
		h1.add(L.get(i));
	    }
	    else {
		h2.add(L.get(i));
	    }
	}
	ArrayList<Comparable> R1 = quicksort(h1);
	ArrayList<Comparable> R2 = quicksort(h2);

	ArrayList<Comparable> ans = new ArrayList<Comparable>(); //Final array, combo of R1 and R2, the sorted upper and lower halves.
	for (int x=0;x<R1.size();x++) {
	    ans.add(R1.get(x));
	}
	ans.add(R1.get(pivot));
	for (int y=0;y<R2.size();y++) {
	    ans.add(R2.get(y));
	}
	return ans;
    }

    public static void main(String[] args) {
	ArrayList test = new ArrayList<Integer>();
	test.add(5);
	test.add(17);
	test.add(3);
	test.add(4);
	test.add(7);
	test.add(2);
	test.add(14);
	test.add(11);
	System.out.println(test);
	System.out.println(quicksort(test));
    }
}
//It says there is an IndexOutOfBoundsException, but I don't understand why. Tried a lot to fix it. No dice.
